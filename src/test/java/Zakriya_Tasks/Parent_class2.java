package Zakriya_Tasks;

import All_Tasks.Parent2;

public class Parent_class2 extends Child_Class{

	public static void main(String[] args) {
		
		Parent2 obj = new Parent2();
		obj.home();
		obj.car();
		obj.jobs();
		obj.home2();
		obj.tatasumo();
        obj.city();
		int sum = obj.amount;
        System.out.println(sum);
		

	}

    public static void home2() {
		
		System.out.println("Home inside a village with 10acre");
   
	
	}
	
     public static void tatasumo() {
    	 
    	 System.out.println("Tata sumo cars 30");
     }
}
