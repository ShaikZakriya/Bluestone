package Zakriya_Tasks;

public class If_Statement {

	public static void main(String[] args) {
		If_Statement();
		If_else();
		If_else_Ladder();
		Nested_If_else();
		Switch_Statement();
	}

	private static void Switch_Statement() {
		
		int number=20;  
	    //Switch expression  
	    switch(number){  
	    //Case statements  
	    case 10: System.out.println("10");  
	    break;  
	    case 20: System.out.println("20");  
	    break;  
	    case 30: System.out.println("30");  
	    break;  
	    //Default case statement  
	    default:System.out.println("Not in 10, 20 or 30");  
	    }  
		
	}

	private static void Nested_If_else() {
		
		int age=20;  
		 int weight=80;     
		    
		 if(age>=18)
		      
		    if(weight<50)
		      {  
		         System.out.println("You are eligible to donate blood");  
		      }    
		    else System.out.println("You are not eligible");
		
	}

	private static void If_else_Ladder() {
		
		int marks=65;  
	      
	    if(marks<50)
	    {  
	        System.out.println("fail");  
	    } 
	    else if(marks>=60 && marks<70){  
	        System.out.println("C grade");  
	    }  
	    else if(marks>=70 && marks<80)
	    {  
	        System.out.println("B grade");  
	    }  
	    else if(marks>=80 && marks<90)
	    {  
	        System.out.println("A grade");  
	    }else if(marks>=90 && marks<100) 
	       
	    {  
	        System.out.println("Invalid!");  
	    }  

}

		
	

	private static void If_else() {
		
		int number=15;  
	    //Check if the number is divisible by 5 or not  
	    if(number%5==0)
	    {  
	        System.out.println("even number");  
	    }else
	    {  
	        System.out.println("odd number");  
	    }  
		
	}

	private static void If_Statement() {
		
		int age=45;  
		 
		 if(age>35)
		 {  
		   System.out.print("Age is greater than 18");  
		 }  

		
	}

}
