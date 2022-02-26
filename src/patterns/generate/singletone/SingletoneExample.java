package patterns.generate.singletone;

import java.io.File;
import java.io.IOException;

public class SingletoneExample {

    public static void main(String[] args) throws IOException {

        Database db1 =  Database.getInstance();
        db1.readDataFromDB();
        Database db2 =  Database.getInstance();
        db1.readDataFromDB();
        Database db3 =  Database.getInstance();
        db1.readDataFromDB();
        Database db4 =  Database.getInstance();
        db1.readDataFromDB();
        Database db5 =  Database.getInstance();
        db1.readDataFromDB();
        Database db6 =  Database.getInstance();
        db1.readDataFromDB();


    }
}
