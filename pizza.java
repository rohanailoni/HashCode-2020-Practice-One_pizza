package Hashcode;
import java.util.*;

import Hashcode.Customer;

import java.io.*;
import Hashcode.Writer;


public class pizza{
    
    public int Score(String[] ans,Customer[] cus){
        int res=0;

        return res;
    }
    public static void main(String[] args) {
        try {
            
            HashMap<String,Integer>likes=new HashMap<>();
            HashMap<String,Integer>dislikes=new HashMap<>();
            Reader reader=new Reader();
            Writer w=new Writer();
            Score score=new Score();
            List<Customer>cus=reader.getinput("e_elaborate.in.txt");
            List<String>chook=new ArrayList<>();
            for(Map.Entry<String,Integer>map:reader.likesones.entrySet()){
                chook.add(map.getKey());

            }


            System.out.println(score.calculate(cus,chook));
            System.out.println(reader.likesones);
            System.out.println(reader.dislikedones);
            w.writeIntoFile(chook,"e.txt");
            
            
            
        } catch (Exception e) {
            return;
        }
    }
}
