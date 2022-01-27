package Hashcode;
import java.util.*;
import java.io.*;

public class Customer{
    List<String>likes;
    List<String>dislikes;
    Customer(String[] likes,String[] dislikes){
        this.likes=new ArrayList<>();
        this.dislikes=new ArrayList<>();
        for(int i=0;i<likes.length;i++){
            this.likes.add(likes[i]);

        }
        for(int i=0;i<dislikes.length;i++){
            this.dislikes.add(dislikes[i]);
        }

    }
}