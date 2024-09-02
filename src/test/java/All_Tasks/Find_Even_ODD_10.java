package All_Tasks;

import java.util.Scanner;

public class Find_Even_ODD_10 {

	public static void main(String[] args) {
	    
		Even_ODD();

	}

	private static void Even_ODD() {
		
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

}
