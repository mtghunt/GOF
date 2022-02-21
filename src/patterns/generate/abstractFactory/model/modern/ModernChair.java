package patterns.generate.abstractFactory.model.modern;

import patterns.generate.abstractFactory.model.Chair;

public class ModernChair implements Chair {
    @Override
    public int hasLegs() {
        return 0;
    }

    @Override
    public void sitOn() {
        System.out.println("Сижу на ModernChair");
    }
}
