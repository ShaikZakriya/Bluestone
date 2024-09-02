package Automation.Bluestone;

public class for_loop {

	public static void main(String[] args) {
	    
		int  n = 30;
		for(int i=1; i<=n; i++)
		
		if(i % 3 ==0)
		{
			System.out.println("Buzz");
		}
		
		else if (i % 5 ==0)
		{
			System.out.println("Fizz");
		}
		
		else if (i % 3 ==0 && i % 5 ==0)
		{
			System.out.println("BuzzFizz");
		}
		
		else
		{
			System.out.println(i + " ");
		}
		
		
	}

}
			  
		   
