package New_Tasks_September;

import All_Tasks.MethodOverLoading;

public class Method_Overloading {

	public static void main(String[] args) {
		
		MethodOverLoading obj = new MethodOverLoading();
        obj.addition(25, 50);
	    obj.addition("Shaik", "Zakriya");
        obj.addtion(75, "Zikku");	
	    obj.additon(99);
	    obj.addition(99, "Zikku", 'Z');
	    
	}
   
	public static void addition(int a, int b) {
		System.out.println("First Method");
		int sum =a+b;
		System.out.println(sum);
	}
    
	public static void addition(String FirstName,String LastName) {
		System.out.println("Second Method");
		System.out.println(FirstName);
		System.out.println(LastName);
	}
	
	public static void addtion(int age, String Name) {
		System.out.println("Third Method");
		System.out.println(Name);
		System.out.println(age);
		
	}
    
	public static void additon(int a) {
		System.out.println("Fourth Method");
		int sum = a;
		System.out.println(sum);
	}
     
	public static void addition(int age, String Name, char gender) {
		System.out.println("Fifth Method");
		
		
	}

	

}
