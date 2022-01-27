package Hashcode;
import java.util.*;

import Hashcode.Customer;

import java.io.*;



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
            Score score=new Score();
            List<Customer>cus=reader.getinput("a_an_example.in.txt");
            List<String>chook=new ArrayList<>();
            chook.add("cheese");
            chook.add("mushrooms");
            chook.add("tomatoes");
            chook.add("peppers");
            System.out.println(score.calculate(cus,chook));
            System.out.println(reader.likesones);
            System.out.println(reader.dislikedones);
            
            
            
        } catch (Exception e) {
            return;
        }
    }
}
