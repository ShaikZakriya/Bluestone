package All_Tasks;

public class Even_ODD_Prime {

	public static void main(String[] args) {
		
		//Even_Numbers();
		//ODD_Numbers();
		  Prime_number();

	}

	private static void Prime_number() {
		
		
		
	}

	private static void ODD_Numbers() {
		
		int i =1;
		
		System.out.println("ODD Number from 1 to 100");
		
		while(i<=100)
		{
			System.out.println(i + " ");
			i +=2;
		}
	}

	private static void Even_Numbers() {
		
		System.out.println("Even numbers from 1 to 100");
		
		for (int i = 2; i < 100; i +=2)
		{
			System.out.println(i + " ");
		}
	}

}
