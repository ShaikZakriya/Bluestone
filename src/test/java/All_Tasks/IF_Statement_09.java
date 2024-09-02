package All_Tasks;

import java.util.Scanner;

public class IF_Statement_09 {

	public static void main(String[] args) {
		
		If_Statement();

	}

	private static void If_Statement() {
	
		int age;
		System.out.println("Enter any Number");
		Scanner scan=new Scanner(System.in);
		age=scan.nextInt();
		if(age<18)
		{
			System.out.println("Kids are not allowed");
		}
		else if(age>18 && age<60)
		{
			System.out.println("You are allowed to Horror Movie");
		}
		else
		{
			System.out.println("old age people are not allowed");
		}
		
	}

}
