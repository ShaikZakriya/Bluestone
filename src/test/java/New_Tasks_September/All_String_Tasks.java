package New_Tasks_September;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class All_String_Tasks {

	public static void main(String[] args) {
		
		//Reverse_string();
		//Count_Character();
		Alphabetical_Order();
		//Print_Prime_number();
		//Print_Fibanacci_Series();

	}

	private static void Print_Fibanacci_Series() {
		
		int term,a=0,b=1,c;
		System.out.print("Enter term ");
		Scanner r=new Scanner(System.in);
		term=r.nextInt();
		for(int i=1;i<=term;i++) 
		{
			System.out.print(a+ " ");
			c=a+b;
			a=b;
			b=c;
		}
		
		
	}

	private static void Print_Prime_number() {
		
	   int i=0;
	   int num =0;
	   String primeNumbers = " ";
	   
	   for (i = 1; i<=100; i++)
	   {
		   int counter=0;
		   for(num =i; num>=1; num--)
		   {
			   if(i%num==0)
			   {
				   counter = counter + 1;
			   }
			   
		   }
			   if(counter ==2)
			   {
				   primeNumbers = primeNumbers + i + " ";
			   }
		   }
	   
		System.out.print("Prime numbers from 1 to 100 are : ");
		System.out.println(primeNumbers);
		
		}
		
	
				
			


	private static void Alphabetical_Order() {
		
		
		//initialize the name
		String name = "Zakriya";
		
		//Convert the name to a character array
		char[] charArray = name.toLowerCase().toCharArray();
		
		//Sort the character array
		Arrays.sort(charArray);
		
		//Convert the sorted character array back to a string
		String sortedName = new String(charArray);
		
		//Print the sorted name
		System.out.println("Name in Alphabetical order: " + sortedName);
	}

	private static void Count_Character() {
		
		String name = "ShaikZakriya";
		
	    HashMap<Character,Integer> map = new HashMap<Character, Integer>();
	         
			for(int i =0; i<name.length(); i++) {
			    char ch = name.charAt(i);
				if(map.containsKey(ch)) {
				int count =map.get(ch);
				count++;
				map.replace(ch, count);
				
			}
			else {
			
				map.put(ch, 1);
			}
		}
	        for(Character key:map.keySet()) {
	        	System.out.println(key+""+map.get(key));
	        }		
	
		
	}

	private static void Reverse_string() {
		
		String name = "Zakirya";
		String result = " ";
		
		int length=name.length();
		
		for(int i=length-1; i>=0; i--)
		
		{
			result=result+name.charAt(i);
		}
		
			System.out.println("Reverse string is:"+ result);
		
	}

}
