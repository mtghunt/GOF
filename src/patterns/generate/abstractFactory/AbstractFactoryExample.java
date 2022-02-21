package patterns.generate.abstractFactory;

import patterns.generate.abstractFactory.factory.FurnitureFactory;
import patterns.generate.abstractFactory.factory.ModernFurnitureFactory;
import patterns.generate.abstractFactory.factory.VictorianFurnitureFactory;
import patterns.generate.abstractFactory.model.Chair;
import patterns.generate.abstractFactory.model.Sofa;
import patterns.generate.abstractFactory.model.Table;

import java.util.Scanner;

public class AbstractFactoryExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введи стиль мебели для  заказа на заводе");

        String type = sc.next();
        FurnitureFactory factory = null;

        if("Викторианский_стиль".equals(type)) {
            factory = new VictorianFurnitureFactory();
        } else if("Модерн_стиль".equals(type)) {
            factory = new ModernFurnitureFactory();
        }

        System.out.println("Введи товар который хотите заказать? (стол, стул, диван)");

        String productType = sc.next();

        if ("стол".equals(productType)) {
           Table t = factory.createTable();
        } else if ("стул".equals(productType)) {
           Chair c =  factory.createChair();
        }else if ("диван".equals(productType)) {
           Sofa s = factory.createSofa();
        }
    }
}
