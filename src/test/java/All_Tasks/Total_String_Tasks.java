package All_Tasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Total_String_Tasks {

	public static void main(String[] args) {
		
		//Reverse_String();
        Count_Characters();
	    //Count_Interger_Num();
	    //Split_The_Words();
	    //Anagram_String(); 
	}      

	private static void Anagram_String() {
		
        Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter First String");
		
		String str1 = scanner.next().replaceAll("\\s", "").toLowerCase();
		
		System.out.println("Enter Second String");
		
		String str2 = scanner.next().replaceAll("\\s", "").toLowerCase();
		
        scanner.close();
        
        if(isAnagram(str1,str2)) {
        	
        	System.out.println("String "+str1+" is an Anagram of String "+str2);
        	
        }else {
        	
        	System.out.println("String "+str1+" is not an Anagram of String "+str2);
        }
	}
	 
      public static boolean isAnagram(String str1,String str2) {
    	  
    	  char[] ca1 = str1.toCharArray();
    	  char[] ca2 = str2.toCharArray();
    	  
    	  Arrays.sort(ca1);
    	  Arrays.sort(ca2);
          
    	  return Arrays.equals(ca1, ca2);
      
      }

	private static void Split_The_Words() {
		
			
		String a = "My favorite game is cricket";
		String[] b = a.split(" ");
		for(String str: b) 
		{
			System.out.println(str);
		}
		
	}

	private static void Count_Interger_Num() {
		
		int z, count=0;
		System.out.println("Enter any Number");
		Scanner s=new Scanner(System.in);
		z=s.nextInt();
		
		while(z>0)
			
		{
			z=z/10;
			count++;
		}
		
		System.out.println("No of Digits "+count);
		
	}

	private static void Count_Characters() {
	       
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

	private static void Reverse_String() {
	       
		String name = "Zakirya";
		String result = "";
		
		int length=name.length();
		
		for(int i=length-1; i>=0; i--)
		
		{
			result=result+name.charAt(i);
		}
		
			System.out.println("Reverse string is:"+ result);
		
	}

}
