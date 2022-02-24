package hashcode2022;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.HashMap;
import java.util.Map;



public class Reader {
    public void readinput(String filename) throws FileNotFoundException,IOException{
        try{
            BufferedReader fr = new BufferedReader(new FileReader(filename));
            String[] input=fr.readLine().split(" ");
        

        }catch(Exception e){
            System.out.println(e);
        }
        return;
    }

}