package patterns.generate.builder.model;

public class Roof {


    @Override
    protected Roof clone()  {
        return new Roof();
    }
}
