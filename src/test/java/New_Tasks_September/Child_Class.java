package New_Tasks_September;
import All_Tasks.Parent_Class;

public class Child_Class extends Parent_Class {

	public static void main(String[] args) {
		
		 Child_Class obj = new Child_Class();
	     obj.jobs();
	     obj.home();
	     obj.car();
	     obj.city();
	     int sum = obj.amount;
	     System.out.println(sum);
	
	}

    public static void jobs() {
		
		System.out.println("Job In City");
  
    }
    
    public static void city() {
    	
    	System.out.println("Kurnool");
    }

	

}
