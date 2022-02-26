package patterns.generate.builder.model;

public class CherepizaRoof extends Roof{
    @Override
    protected Roof clone()  {
        return new CherepizaRoof();
    }
}
