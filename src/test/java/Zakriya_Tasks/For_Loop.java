package Zakriya_Tasks;

public class For_Loop {

	public static void main(String[] args) {
		
		For_Loop();
        While_Loop();
        Do_While_Loop();
	}

	private static void Do_While_Loop() {
	
		int i = 0;
        do 
        {
            System.out.println("Value of i: " + i);
            i++;
        } while (i < 5);
		
	}

	private static void For_Loop() {
		
		for (int i = 0; i < 5; i++) 
		{
			System.out.println("Value of i: " + i);
		}
		        }

	private static void While_Loop() {
		
		int i = 0;
        while (i < 5) 
        {
            System.out.println("Value of i: " + i);
            i++;
		}

	
		
	}	
		
	}


