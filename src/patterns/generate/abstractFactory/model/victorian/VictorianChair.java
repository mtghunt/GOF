package patterns.generate.abstractFactory.model.victorian;

import patterns.generate.abstractFactory.model.Chair;

public class VictorianChair implements Chair {

    @Override
    public int hasLegs() {

        return 6;

    }

    @Override
    public void sitOn() {

        System.out.println("Сижу на VictotianChair");
    }
}
