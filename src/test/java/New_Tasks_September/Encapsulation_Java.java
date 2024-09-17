package New_Tasks_September;

  class Employee 
  {
	  private String name;
	  public void setName(String name)
	  {
		  this.name=name;
	  }
	  
	  public String getName()
	  {
		  return name;
	  }
  }
public class Encapsulation_Java {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setName("Shaik Zakriya");
		System.out.println("Name is: "+e.getName());
		
		
	}
}
