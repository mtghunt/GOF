package patterns.generate.builder;

import patterns.generate.builder.model.House;

public interface Builder {

    void reset();
    void buildRoof();
    void buildWalls();
    void buildBackground();


    House getResult();
}
