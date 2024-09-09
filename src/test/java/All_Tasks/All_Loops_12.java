package All_Tasks;

public class All_Loops_12 {

	public static void main(String[] args) {
		
		//For_Loop();
		//Fizz_Buzz();
	      Odd_Even();
	}
	

	private static void Odd_Even() {
		
		int n = 10;
        for(int i=1; i<=n; i++)
        if(i % 1 ==0 && i % 2 ==0)  
        {
        	System.out.println("Odd");
            System.out.println("Even");        
        }
       
   }


	private static void Fizz_Buzz() {
		

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

	private static void For_Loop() {
		
		for(int i=1; i<=20; i++)
		{
			System.out.println(i);
		}
		
	}

}
