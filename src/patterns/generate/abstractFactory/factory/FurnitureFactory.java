package patterns.generate.abstractFactory.factory;

import patterns.generate.abstractFactory.model.Chair;
import patterns.generate.abstractFactory.model.Sofa;
import patterns.generate.abstractFactory.model.Table;

public interface FurnitureFactory {
    Chair createChair();

    Table createTable();

    Sofa createSofa();
}
