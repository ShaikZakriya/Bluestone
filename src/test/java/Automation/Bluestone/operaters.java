package Automation.Bluestone;

import java.util.Scanner;

public class operaters {

	public static void main(String[] args) {
		
		Even_Odd();
       //logical_operator();
		
	}
	
	
		 private static void Even_Odd() {
		
			 int z;
			 System.out.println("Enter any Number");
			 Scanner s=new Scanner(System.in);
			 z=s.nextInt();
			 
			 if(z%2==0)
			 {
				 System.out.println("Even Number");
			 }
			 else
			 {
				 System.out.println("Odd Number");
			 }
		
	}


        private static void logical_operator() {
            
		int a = 5;
		int b = 9;
		int c = 3;
		
		if(a>b ||  c<a || b>c)
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		
		
	}

}
