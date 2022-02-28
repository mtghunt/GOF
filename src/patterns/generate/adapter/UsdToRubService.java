package patterns.generate.adapter;

import patterns.generate.adapter.model.UsdToRub;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UsdToRubService {

    public static UsdToRub getActual() {

        String result = readFromFile();
        System.out.println(">>>>>" + result);
        return new UsdToRub(Double.valueOf(result));
    }






    public static String readFromFile() {

        try (BufferedReader br = new BufferedReader(new FileReader("usdToRub.txt"))) {

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
