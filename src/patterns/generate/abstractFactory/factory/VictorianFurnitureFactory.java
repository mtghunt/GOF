package patterns.generate.abstractFactory.factory;

import patterns.generate.abstractFactory.model.Chair;
import patterns.generate.abstractFactory.model.Sofa;
import patterns.generate.abstractFactory.model.Table;
import patterns.generate.abstractFactory.model.victorian.VictorianChair;
import patterns.generate.abstractFactory.model.victorian.VictorianSofa;
import patterns.generate.abstractFactory.model.victorian.VictorianTable;

public class VictorianFurnitureFactory implements  FurnitureFactory{

    @Override
    public Chair createChair() {
        System.out.println("Стул VictorianChair изготовлен");
        return new VictorianChair();
    }

    @Override
    public Table createTable() {
        System.out.println("Стол VictorianTable изготовлен");
        return new VictorianTable();
    }

    @Override
    public Sofa createSofa() {
        System.out.println("Диван VictorianSofa изготовлен");
        return new VictorianSofa();
    }
}
