package patterns.generate.singletone;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Database {

   private File file;

   private static Database db;

   private Database(){

       file = new File("1.txt");
    }

   public static Database getInstance(){
       if(db == null) {
           db = new Database();
       }
        return db;
    }


    public String readDataFromDB() {

        try (BufferedReader br = new BufferedReader(new FileReader("db.txt"))) {


            StringBuilder sb = new StringBuilder();
            String currentLine = "";
            while ((currentLine= br.readLine()) != null) {
                System.out.println(currentLine);
                if(currentLine!=null && !currentLine.isBlank())
                    sb.append(currentLine);
            }

            return  sb.toString();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Данная персона не найдена,  введи ее повторно: ");

        }
        return  null;
    }
}
