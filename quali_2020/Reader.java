package Hashcode;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

import Hashcode.Carpath;
import Hashcode.Street;
import Hashcode.Trafficlight;


public class Reader {
    public Trafficlight readinput(String filename) throws FileNotFoundException,IOException{
        try{
            BufferedReader fr = new BufferedReader(new FileReader(filename));
            String[] input=fr.readLine().split(" ");
            Trafficlight trafficlight=new Trafficlight();
            trafficlight.duration=Integer.parseInt(input[0]);
            trafficlight.numofintersection=Integer.parseInt(input[1]);
            trafficlight.numofstreets=Integer.parseInt(input[2]);
            trafficlight.numofcars=Integer.parseInt(input[3]);
            trafficlight.bonus=Integer.parseInt(input[4]);
            for(int i=0;i<trafficlight.numofstreets;i++){
                input=fr.readLine().split(" ");
                Street street=new Street();
                street.inter_start=Integer.parseInt(input[0]);
                street.inter_end=Integer.parseInt(input[1]);
                street.streetname=input[2];
                street.timeStartEnd=Integer.parseInt(input[3]);
                trafficlight.streets.add(street);




            }
            for(int i=0;i<trafficlight.numofcars;i++){
                input=fr.readLine().split(" ");
                Carpath carpath=new Carpath();
                carpath.num_of_street=Integer.parseInt(input[0]);
                for(int j=1;j<carpath.num_of_street+1;j++){
                    carpath.streetname.add(input[j]);
                }
                trafficlight.carpath.add(carpath);
            }
            return trafficlight;

        }catch(Exception e){
            System.out.println(e);
        }
        return new Trafficlight();
    }

}
