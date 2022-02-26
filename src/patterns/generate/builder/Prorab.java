package patterns.generate.builder;

import patterns.generate.builder.model.House;

public class Prorab {


    public House makeHouse(String type) {
        Builder builder = null;

        if("кирпичный".equals(type)) {
            builder = new KirpichBuilder();
        } else if("каркасный".equals(type)) {
            builder = new KarkasBuilder();
        }


        if(builder != null) {
            builder.reset();
            builder.buildBackground();
            builder.buildWalls();
            builder.buildRoof();
            return  builder.getResult();
        } else
            return  null;

    }

}
