package XYZ_TASKS;

public class ARRAYS {

	public static void main(String[] args) {
		
		Array();

	}

	private static void Array() {
		
		// Syntax  [which data type]  type[] arrayName = new type[size];
		
		int [] marks = new int[3];
		
		marks[0] = 97;
		marks[1] = 98;
		marks[2] = 95;
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		
		//Now i am trying with for loop
		System.out.println("*****************");
		
		for(int i =0; i<3; i++)
		{
			System.out.println(marks[i]);
		}
	
		//This is the 2 type
		int marks2[] = {97, 98, 95};
	
		for(int i =0; i<3; i++)
		{
			System.out.println(marks2[i]);
		}
	
	}

}
