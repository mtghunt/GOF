package patterns.generate.builder;

import patterns.generate.builder.model.*;

import java.util.ArrayList;
import java.util.List;

public class KirpichBuilder implements Builder{

    private List<Wall> walls = null;
    private Background background = null;
    private Roof roof = null;

    @Override
    public void reset() {
        walls = null;
        background = null;
        roof = null;
    }

    @Override
    public void buildRoof() {

        roof = new CherepizaRoof();

    }

    @Override
    public void buildWalls() {
        walls = new ArrayList<>();
        walls.add(new KirpichWall());
        walls.add(new KirpichWall());
        walls.add(new KirpichWall());
        walls.add(new KirpichWall());
        walls.add(new KirpichWall());
        walls.add(new KirpichWall());
    }

    @Override
    public void buildBackground() {

        background = new Background();

    }

    @Override
    public House getResult() {
        return new House(roof, background, walls);
    }
}
