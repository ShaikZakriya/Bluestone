package All_Tasks;

import java.util.HashSet;
import java.util.Iterator;
public class Hashset2 {

	public static void main(String[] args) {
		
	HashSet<Integer> set = new HashSet<>();
	
	   //insert
        
	    set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println(set);
        
       //Search - contains
        
        if(set.contains(1)) 
        {
        	System.out.println("set contains 2");
        }
        
        if(!set.contains(9))
        {
        	System.out.println("set not contains");
        	
        }
	    
        if(set.remove(1))
        {
        	System.out.println("True");
        }
        
        
        
        
        Iterator it = set.iterator();
        
        while(it.hasNext())
        {
           System.out.println(it.next());	
        }
        
	}

}
