package hashcode2022;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import hashcode2022.*;

public class Reader {
    public Data readinput(String filename) throws FileNotFoundException,IOException{
        try{
            BufferedReader fr = new BufferedReader(new FileReader(filename));
			String[] input=fr.readLine().split(" ");
            int conti=Integer.parseInt(input[0]);
            int projects=Integer.parseInt(input[1]);
            List<Contrib>contributors=new ArrayList<>();
            List<Projects>projectsall=new ArrayList<>();
            
            for(int i=0;i<conti;i++){
                String[] info=fr.readLine().split(" ");
                String name=info[0];
                int noofskill=Integer.parseInt(info[1]);
                List<Skill> stor=new ArrayList<>();
                for(int j=0;j<noofskill;j++){
                    String[] skills=fr.readLine().split(" ");
                    String skill_name=skills[0];
                    int level=Integer.parseInt(skills[1]);
                    Skill sk=new Skill(skill_name,level);
                    stor.add(sk);



                }
                //System.out.print(name);
                Contrib cb=new Contrib(name,stor);
                contributors.add(cb);
            }
            for(int i=0;i<projects;i++){
                String[] proj=fr.readLine().split(" ");
                List<Skill>listofskill=new ArrayList<>();
                for(int j=0;j<Integer.parseInt(proj[4]);j++){
                    String[] skill_proj=fr.readLine().split(" ");
                    Skill skillls=new Skill(skill_proj[0],Integer.parseInt(skill_proj[1]));
                    listofskill.add(skillls);
                }

                Projects pr=new Projects(proj[0],Integer.parseInt(proj[1]),Integer.parseInt(proj[2]),Integer.parseInt(proj[3]),Integer.parseInt(proj[4]),listofskill);
                projectsall.add(pr);
            }
            Data all=new Data(contributors,projectsall);
            return all;


        }catch(Exception e){
            System.out.println(e);
        }
        return new Data();
        
    }

}