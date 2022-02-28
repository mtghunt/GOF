package patterns.generate.builder;

import patterns.generate.builder.Builder;
import patterns.generate.builder.model.*;

import java.util.ArrayList;
import java.util.List;

public class KarkasBuilder implements Builder {

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
        roof = new ProfilRoof();

    }

    @Override
    public void buildWalls() {

        walls = new ArrayList<>();
        walls.add(new WoodWall());
        walls.add(new WoodWall());
        walls.add(new WoodWall());
        walls.add(new WoodWall());

    }

    @Override
    public void buildBackground() {

        background = new Background();

    }

    @Override
    public House getResult() {
        return new House(roof, background, walls);
    }

    public List<Wall> getResultWalls() {
        return walls;
    }
}
