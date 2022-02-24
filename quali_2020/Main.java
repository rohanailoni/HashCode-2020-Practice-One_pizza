package Hashcode;

import java.io.FileNotFoundException;
import java.io.IOException;

import Hashcode.Trafficlight;

public class Main{
    public static void main(String args[]) throws IOException,FileNotFoundException{
        Reader reader=new Reader();
        Trafficlight tf;
        tf=reader.readinput(new String("Input/a.txt"));
        // System.out.println(tf.duration+" "+tf.numofintersection+" "+tf.numofstreets+" "+tf.bonus);
        // System.out.println(tf.streets);
        // System.out.println(tf.carpath);
        


    }
}

