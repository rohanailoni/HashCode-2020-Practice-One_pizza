package hashcode2022;
import java.util.*;
import java.io.*;
public class Writer {
    public void writeIntoFile(Data output,String fileName) {
        try {
            Random rand=new Random();

            System.out.println("\n------- output " + fileName);

            PrintWriter outputFile = new PrintWriter(fileName + ".out", "UTF-8");
            List<String>def=new ArrayList<>();
            for(Projects p:output.po){
                HashSet<String>check=new HashSet<>();
                List<Skill>req=p.ski;
                for(Contrib c:output.co){
                    boolean flag=false;
                    List<Skill> have=c.skills;
                    for(Skill s:req){
                        for(Skill s1:have){
                            if(s.name.equals(s1.name) && s.level<=s1.level){
                                
                                if(!check.contains(s.name)){
                                    check.add(s.name);
                                    flag=true;
                                    break;
                                }
                            }
                        }
                    }
                    if(flag)break;

                    
                }
                if(check.size()!=req.size()){
                    def.add(p.name);
                    System.out.println(p.name);
                }
                
            }
            int count=output.po.size();
            for(Projects p:output.po){
                for(String s:def){
                    if(p.name.equals(s)){
                        count--;
                    }
                }
            }
            outputFile.print(count+"\n");
            //List<String>projec_name=new ArrayList<>();
            for(Projects p:output.po){
                if(!def.contains(p.name)){
                    List<Skill>sk=p.ski;
                    List<String>name=new ArrayList<>();
                    
                    HashSet<String> assign=new HashSet<>();
                    
                    for(Skill rohan:sk){
                        
                        for(Contrib cb:output.co){
                            boolean flag=false;
                            if(!assign.contains(cb.name)){
                                for(Skill rohan1:cb.skills){
                                    if(rohan.name.equals(rohan1.name) && rohan.level<=rohan1.level){
                                        name.add(cb.name);
                                        assign.add(cb.name);
                                        flag=true;
                                        break;
                                    }

                                }
                                
                            }
                            if(flag)break;
                            
                        }
                    }
                    outputFile.print(p.name+"\n");
                    for(String s:name){
                        outputFile.print(s+" ");
                    }
                    outputFile.print("\n");
                    System.out.println(name);           
                }
            }
            //System.out.println(count);
            
            
            outputFile.close();
        } catch (Exception e) {
            System.err.println("" + e);
        }
    }
}
