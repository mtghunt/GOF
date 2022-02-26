package patterns.generate.builder.model;

public class ProfilRoof extends Roof{


    @Override
    protected Roof clone()  {
        return new ProfilRoof();
    }
}
