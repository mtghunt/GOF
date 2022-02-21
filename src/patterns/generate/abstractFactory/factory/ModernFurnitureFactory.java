package patterns.generate.abstractFactory.factory;

import patterns.generate.abstractFactory.model.Chair;
import patterns.generate.abstractFactory.model.Sofa;
import patterns.generate.abstractFactory.model.Table;
import patterns.generate.abstractFactory.model.modern.ModernChair;
import patterns.generate.abstractFactory.model.modern.ModernSofa;
import patterns.generate.abstractFactory.model.modern.ModernTable;

public class ModernFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        System.out.println("Стул ModernChair изготовлен");
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        System.out.println("Стол ModernTable изготовлен");
        return new ModernTable();
    }

    @Override
    public Sofa createSofa() {
        System.out.println("Диван ModernSofa изготовлен");
        return new ModernSofa();
    }
}
