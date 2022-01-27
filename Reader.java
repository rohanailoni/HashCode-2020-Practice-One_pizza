package Hashcode;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

import Hashcode.Customer;

import java.util.ArrayList;
public class Reader {
    private Map<String,Integer> allIngredient;
    public List<Customer> getinput(String filename) throws FileNotFoundException,IOException{
        allIngredient=new HashMap<>();
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
                }
                line =fr.readLine();
                String dislikedIngredientInput[] = line.split(" ");
                List<String> dislikedIngredientCustomer = new ArrayList<>();

                for (int i = 1; i < dislikedIngredientInput.length; i++) {
                    
                    dislikedIngredientCustomer.add(dislikedIngredientInput[i]);
                    allIngredient.put(dislikedIngredientInput[i], 0);
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