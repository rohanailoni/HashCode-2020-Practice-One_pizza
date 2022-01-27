package Hashcode;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.HashMap;
import java.util.Map;


import java.util.ArrayList;
public class Reader {
    public Map<String,Integer> allIngredient;
    public Map<String,Integer>likesones;
    public Map<String,Integer>dislikedones;
    public List<Customer> getinput(String filename) throws FileNotFoundException,IOException{
        allIngredient=new HashMap<>();
        likesones=new HashMap<>();
        dislikedones=new HashMap<>();
        List<Customer> customers = new ArrayList<Customer>();
        try{
            BufferedReader fr = new BufferedReader(new FileReader(filename));
            String line;
            int nbrCustomer;
            nbrCustomer = Integer.parseInt(fr.readLine());
            while((line = fr.readLine()) != null){
                String likedIngredientInput[] = line.split(" ");
                List<String> likedIngredientCustomer = new ArrayList<>();
                for (int i = 1; i < likedIngredientInput.length; i++) {
                   
                    likedIngredientCustomer.add(likedIngredientInput[i]);
                    allIngredient.put(likedIngredientInput[i], 0);
                    likesones.put(likedIngredientInput[i],likesones.getOrDefault(likedIngredientInput[i],0)+1);
                }
                line =fr.readLine();
                String dislikedIngredientInput[] = line.split(" ");
                List<String> dislikedIngredientCustomer = new ArrayList<>();

                for (int i = 1; i < dislikedIngredientInput.length; i++) {
                    
                    dislikedIngredientCustomer.add(dislikedIngredientInput[i]);
                    allIngredient.put(dislikedIngredientInput[i], 0);
                    dislikedones.put(dislikedIngredientInput[i],dislikedones.getOrDefault(dislikedIngredientInput[i],0)+1);
                }
                Customer customer=new Customer(likedIngredientCustomer.toArray(new String[0]), dislikedIngredientCustomer.toArray(new String[0]));
                customers.add(customer);


            }




        } 
        catch (IOException ex) {
            System.out.println("ex "+ex.getMessage());
            }
        return customers;

    }
}