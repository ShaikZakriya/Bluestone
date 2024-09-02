package Automation.Bluestone;

public class Child_Class extends Parent_Class {


	public static void main(String[] args) {
		
		
		Child_Class obj = new Child_Class();
		obj.jobs();
        obj.home();
        obj.car();
        int sum = obj.amount;
        System.out.println(sum);
	}

	public static void jobs() {
		
		System.out.println("Job In City");
	}
}
