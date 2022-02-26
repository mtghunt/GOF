package patterns.generate.builder.model;

import javax.print.attribute.HashPrintJobAttributeSet;
import java.util.List;

public class House implements Cloneable {

    private Roof roof;
    private Background background;
    private List<Wall> walls;

    // бассей

    // детскую пллощадку

    public House(Roof roof, Background background, List<Wall> walls){

        this.roof = roof;
        this.background = background;
        this.walls = walls;

    }

    public House clone(){
        return new House(roof.clone(), background, walls);
    }
}
