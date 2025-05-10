package XYZ_TASKS;

import java.util.ArrayList;

public class DATA_TYPES_CLASS_FIRST {

	public static void main(String[] args) {
		
		//ALL_DATA_TYPES();
		 // Arrays();
		//if_else();
		  Arraylist();
		//Reverse_String();
		//Strings_In_Java();
		

	}

	private static void Strings_In_Java() {
		
		// String is an object that represent sequence of characters
		//Now there are two ways to create String object
		//1. String s = "Manual testing"            (This is normal or literal object)
		//2. String s1 = new String("Automation");  (This is new keyword object)
		
		String s = "Cricket is best game";
		String[] splittedString = s.split("is");
		
		System.out.println(splittedString[0]);
		
		
	/*	for(int i =0; i<s.length(); i++)
			
		{
			System.out.println(s.charAt(i));
		}
		
	*/	
		for (int i=s.length()-1; i>=0; i--)
		{
			    
			System.out.println(s.charAt(i));
			
		}
		
		
		
	}

	private static void Reverse_String() {
		
		String name = "Shaik Zakriya";
	    String reversed = " ";
		
		for (int i = name.length()-1; i >=0; i--)
		{
			reversed = reversed + name.charAt(i);
		}
	
		System.out.println("Reversed name: " + reversed);
	
	}

	private static void Arraylist() {
	    
		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Shaik");
		a.add("Shaik Zakriya");
		a.add("Academy");
		a.add("Manual Testing");
		a.add("Coding");
		
		//System.out.println(a.get(3));
		
		/*	for (int i =0; i<a.size(); i++)
			{
				System.out.println(a.get(i));
			}   
			
		*/
		for (int i =0; i<=a.size(); i++)
		{
			if(a.get(i).equals("Academy"))
					
			{
				  System.out.println("Academy is found: " + i);
				  break;
			}
		}
		
		
		
		//System.out.println(a.contains("Coding"));
	}

	private static void if_else() {
		
		int [] arr1 = {1,2,3,4,6,8,10,11,12,13,14,16,18,20};
		
		for (int i =0; i<arr1.length; i++)
			
			if (arr1[i] % 2 ==0)
			{
				System.out.println(arr1[i]);
				
			}
		
			else 
			{
				System.out.println(arr1[i] + " is not multiple by 2");
			}
	
	}

	private static void Arrays() {
		
		//1.This is integer Array
		
		//Now i am assinging the values here
		int [] arr1 = {1,2,3,4,5};
		
		//System.out.println(arr1[1]);
		
		
		//if we want to print total values then we can used for loop 
		/*for (int i =0; i<arr1.length; i++)
		{
			System.out.println(arr1[i]);
		} */
		
		
		//2.This is String Array
	 
		String [] arr2 = {"Shaik Zakriya"};
		
	    for (int i =0; i<arr2.length; i++)
		{
			System.out.println(arr2[i]);
				
		}    
		
		
	/*	//3.Enchanced for loop is easy method 
		
		for (String s: arr2)
		{
			System.out.println(s);
		}
		*/
	}

	private static void ALL_DATA_TYPES() {
		
		int num = 95;
		String name = "Shaik Zakriya";
		char letter = 'A';
		double dec = 5.99;
		boolean card = true;
		
		System.out.println(dec);
		System.out.println(num);
		System.out.println(name  + " is present inside name varaible" );
	    //System.out.println("num: " + num + " \nname: " + name + " \nletter: " + letter + " \ndec: " + dec + " \ncard: " + card + ", ");
	    
	
	}

}
