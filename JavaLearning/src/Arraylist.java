import java.util.ArrayList;
import java.util.Collections;
public class Arraylist{

     public static void main(String []args){
         
         ArrayList<String> grocery = new ArrayList<>();
         
         grocery.add("Cucumber");
         grocery.add("Rice");
         grocery.add("Bread");
         grocery.add("Wine");
         
         System.out.println(grocery);
         
         grocery.remove("Wine");
         
         System.out.println(grocery);
         
         System.out.println(grocery.get(1));
         grocery.set(0, "Bhindi");
         System.out.println(grocery);
         System.out.println(grocery.size());
         
         for (String i: grocery) {
        	 
        	 System.out.println(i);
         }
            
         Collections.sort(grocery);
         for(String i: grocery) {
        	 System.out.println(i);
         }
        
     }
}
