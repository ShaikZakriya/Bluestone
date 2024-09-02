package Selenium;

import java.util.HashMap;


public class String_CharacterCount {

	public static void main(String[] args) {
		
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
}
