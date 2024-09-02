package Automation.Bluestone;

import java.util.Scanner;

public class if_statement {

	public static void main(String[] args) {

	else_if();
	
		
		}

	private static void else_if() {
		
      
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
