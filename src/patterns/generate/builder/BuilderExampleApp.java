package patterns.generate.builder;

import patterns.generate.builder.model.House;

import java.util.Scanner;

public class BuilderExampleApp {

    public static void main(String[] args) {

        Prorab vasy = new Prorab();

        Scanner sc = new Scanner(System.in);
        String houseType = sc.next();

        House mySweetHouse = vasy.makeHouse(houseType);

        House oneMoreHouse = mySweetHouse.clone();

    }
}
