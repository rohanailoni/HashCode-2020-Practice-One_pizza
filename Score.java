package Hashcode;

import Hashcode.Customer;
import java.util.List;
public class Score {
    
    int calculate(List<Customer> cu,List<String>ans){
        boolean liked;
        boolean disliked;
        int sc=0;
        for(int i=0;i<cu.size();i++){
            disliked=true;
            liked=true;
            
            for(String c:cu.get(i).likes){
                
                if(!ans.contains(c)){
                   liked=false;
                   break;
                }
            }
            for(String c:cu.get(i).dislikes){
                
                if(ans.contains(c)){
                    disliked=false;
                    break;
                }
            }
            //System.out.println(liked+" "+disliked);
            if(liked==true &&  disliked==true){
                sc++;
            }
            
        }
        return sc;
    }
}
