package New_Tasks_September;

import All_Tasks.MethodOverriding_Child;
import All_Tasks.MethodOverriding_Parent;

public class Method_Overriding_Child extends MethodOverriding_Parent {

	public static void main(String[] args) {
		
		MethodOverriding_Child obj = new MethodOverriding_Child();
        obj.addition(10, 10);
	}
    
	public static void addition (int a, int b) {
		System.out.println("I am in Child Class");
		int sum = a+b;
		System.out.println(sum);
	}

}
