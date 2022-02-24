package hashcode2022;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.HashMap;
import java.util.Map;



import hashcode2022.*;
public class Main {
    
    public static void main(String args[]) throws FileNotFoundException,IOException{
        Reader read=new Reader();
        Writer write=new Writer();
        //String[] filenames={"c_collaboration.in.txt","e_exceptional_skills.in.txt","b_better_start_small.in.txt","d_dense_schedule.in.txt","f_find_great_mentors.in.txt"};
        String[] filenames={"f_find_great_mentors.in.txt"};
        for(String file:filenames){
            Data d=read.readinput("Input/"+file);
            write.writeIntoFile(d,file.substring(0,1));

        }
        
        // for(Contrib c:d.co){
        //     System.out.println(c.name);
        //     for(Skill s:c.skills){
        //         System.out.println(s.name+" "+s.level);
        //     }
        // }
        // for(Projects p:d.po){
        //     System.out.println(p.name+" "+p.days+" "+p.score+" "+p.bestbefore+" "+p.roles);
        //     for(Skill s:p.ski){
        //         System.out.println(s.name+" "+s.level);

        //     }
        // }
        

        
    }



}
