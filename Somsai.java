
import java.io.*;
import java.nio.Buffer;
import java.util.*;
public class Somsai {
    public int check(int n){
        String s=Integer.toString(n);
        String s1="123456789";
        if(s.length()!=10){
            return 2;
        }
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s1.contains(s.substring(i,i+1))){
               
                count++;
            }
        }
        if(count==10){
            return 1;
        }
        return 3;
    }
    
    public static void main(String args[]) throws IOException{
        Scanner sc=new Scanner(System.in);
        Somsai somsai=new Somsai();
        System.out.println("Enter the Phone number of Student");
        String number=sc.nextLine();
        System.out.println("Enter the Regno of the Studnet");
        String Regno=sc.nextLine();
        int num=Integer.parseInt(number);
        int c=somsai.check(num);
        if(c==1){
            System.out.println(" the enter number is correct and is on correct format");

        }else if(c==2){
            System.out.println("The number doesnt have 10 digits");
        }else{
            System.out.println("The number doesnt have a number");
        }
        
        if(Regno.length()==9){
            System.out.println("The Regno of Student is correct");
        }else{
            System.out.println("The regno is of Differnt Length");
            }


       
        
    }
}
