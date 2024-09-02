package Saifulla_Tasks;

public class Break_Statement {

	public static void main(String[] args) {
		
		Break_Statement();
		Continue();
		Comments_With_Single_Line();
        Commentw_With_Multiple_Lines();

	}

	private static void Commentw_With_Multiple_Lines() {
		int i=10;    
	    System.out.println(i);    
	/* float j = 5.9; 
	    float k = 4.4; 
	    System.out.println( j + k ); */
		
	}

	private static void Comments_With_Single_Line() {
		
		int i=10; // i is a variable with value 10  
		System.out.println(i);  //printing the variable i  
		
		
	}

	private static void Continue() {

		for(int i=1;i<=10;i++){  
	        if(i==5){  
	            //using continue statement  
	            continue;//it will skip the rest statement  
	        }  
	        System.out.println(i);
		}	
	}

	private static void Break_Statement() {
		
		for(int i=1;i<=10;i++){  
	        if(i==5)
	        {  
	            //breaking the loop  
	            break;  
	        }  
	        System.out.println(i); 
		
	}
	
	}
}