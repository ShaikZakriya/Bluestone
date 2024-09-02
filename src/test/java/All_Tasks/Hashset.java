package All_Tasks;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		
      HashSet<String> cars = new HashSet<String>();
      
      //Add items
      
      cars.add("Volve");
      cars.add("Tata Nexon");
      cars.add("Tata Harrier");
      cars.add("Tata Nexon");
      cars.add("Zest");
      
      System.out.println(cars);
      
      //Check if an items exists
      
      cars.add("Volve");
      cars.add("Tata Nexon");
      cars.add("Tata Harrier");
      cars.add("Tata Nexon");
      cars.add("Zest");
      
      System.out.println(cars.contains("Tata Nexon"));
      
      //Remove an items
      
      cars.add("Volve");
      cars.add("Tata Nexon");
      cars.add("Tata Harrier");
      cars.add("Tata Nexon");
      cars.add("Zest");
      
      cars.remove("Volve");
      
      System.out.println(cars);
      
      //We can check the size
      
      cars.add("Volve");
      cars.add("Tata Nexon");
      cars.add("Tata Harrier");
      cars.add("Tata Nexon");
      cars.add("Zest");
      
      System.out.println(cars.size());
      
      //We can clear 
      
      cars.add("Volve");
      cars.add("Tata Nexon");
      cars.add("Tata Harrier");
      cars.add("Tata Nexon");
      cars.add("Zest");
      
      cars.clear();
      System.out.println(cars);
      
      // We can used for each loop
      
      cars.add("Volve");
      cars.add("Tata Nexon");
      cars.add("Tata Harrier");
      cars.add("Tata Nexon");
      cars.add("Zest");
      
      for (String i : cars) 
    	  
      {
    	  System.out.println(i);
      }
      
	}
	

}
