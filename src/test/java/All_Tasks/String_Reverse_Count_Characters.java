package All_Tasks;


public class String_Reverse_Count_Characters {

	public static void main(String[] args) {
		
		//Reverse_Your_Name();
		//Palindrome();
		Zakriya();
	}

	private static void Zakriya() {
		
		String name = "Zakriya";
		String reverse = "";
		
		int length=name.length();
		
		for (int i=length-1; i>0; i--)
		{
			reverse=reverse+name.charAt(i);
		}
		
		System.out.println("Reverse string is: "+ reverse);
		
	
		
	}

	private static void Palindrome() {
		
		String name = "Zakriya";
		String reverse = "";
		
		int length=name.length();
		
		for(int i=length-1; i>=0; i--)
		
		{
			reverse=reverse+name.charAt(i);
		}
		
		System.out.println("Reverse string is:"+ reverse);
		
	  if
	  (name.equalsIgnoreCase(reverse))
	  {
		  System.out.println("The string is a palindrome");
	  }
	  else {
		  System.out.println("The string is Not a palindrome");
	  }
	}

	private static void Reverse_Your_Name() {
		
		String name = "Zakirya";
		String str = "";
		
		
		for(int i=name.length()-1; i>=0; i--)
		
		{
			str=str+name.charAt(i);
		}
		
		System.out.println("Reverse string is:"+ str);
		
	
	}
		
} 
