package XYZ_TASKS;

public class Access_Methods {

	public static void main(String[] args) {
		
		Access_Methods Z = new Access_Methods();
		String name = Z.getData();
		System.out.println(name);
		Sub_Method P = new Sub_Method();
		P.getUserData();
		
		

	}

	public String getData()
	{
		System.out.println("Hello World");
		return "Automation";
	}
	
	
	
}
