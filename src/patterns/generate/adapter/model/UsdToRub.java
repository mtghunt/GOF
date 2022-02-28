package patterns.generate.adapter.model;

public class UsdToRub {

    private double value;


    public UsdToRub(double value){
        this.value = value;
    }


    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "UsdToRub{" +
                "value=" + value +
                '}';
    }
}
