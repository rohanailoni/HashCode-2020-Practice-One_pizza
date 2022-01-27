package Hashcode;
import java.util.*;
import java.io.*;
public class Writer {
    public void writeIntoFile(List<String>choosedIngredient,String fileName) {
        try {
            System.out.println("\n------- output " + fileName);
            PrintWriter outputFile = new PrintWriter("output\\" + fileName + ".out", "UTF-8");
            outputFile.print(choosedIngredient.size()+" ");
            for(String ingredient:choosedIngredient){
                outputFile.print(ingredient+" ");
            }
            
            outputFile.close();
        } catch (Exception e) {
            System.err.println("" + e);
        }
    }
}
