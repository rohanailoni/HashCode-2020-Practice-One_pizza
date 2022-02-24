package hashcode2022;
import java.util.*;
import java.io.*;
public class Writer {
    public void writeIntoFile(String output,String fileName) {
        try {
            System.out.println("\n------- output " + fileName);
            PrintWriter outputFile = new PrintWriter("output\\" + fileName + ".out", "UTF-8");
            outputFile.print(output.length()+" ");
            outputFile.close();
        } catch (Exception e) {
            System.err.println("" + e);
        }
    }
}
