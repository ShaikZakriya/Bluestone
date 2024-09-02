package All_Tasks;

import java.util.HashMap;

public class String_Reverse_Count_Characters {

	public static void main(String[] args) {
		
           Reverse_Your_Name();
           Count_Characters();
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

	private static void Reverse_Your_Name() {
		
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
