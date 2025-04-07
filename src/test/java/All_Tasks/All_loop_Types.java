package All_Tasks;

public class All_loop_Types {

	public static void main(String[] args) {
		
		//While_Loop();
		//Do_While_Loop();
        //forloop();
		//forEachloop();
		
	}

	private static void forEachloop() {
		
		//I create an integer array with three elements
		int[] numbers = {10, 20, 30};  

		//this loop takes each element from number one by one and assigns it to number
           for (int num : numbers) {  
           
        //it will print each number in the array 
        	System.out.println(num);  
        }
		
	}

	private static void forloop() {
		
		for (int i = 1; i <= 5; i++) {  
            System.out.println(i);  
        }
		
	}

	private static void Do_While_Loop() {
		
		int n =1;
		do
		{
			System.out.println(n+ " ");
			++n;
		}
		while(n<10);
	}

	private static void While_Loop() {
		
		int n =1;
		while(n<=10)
		{
			System.out.println("learn Coding");
			++n;
		}
		        
		
	
	}
}
