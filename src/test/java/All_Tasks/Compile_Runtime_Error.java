package All_Tasks;

import java.util.Scanner;

public class Compile_Runtime_Error {

	public static void main(String[] args) {
		
		//Compile_Time_Error();
        Runtime_Error();
	}

	private static void Runtime_Error() {
		
		/*int a=5;
		int b=0;
		int c=a/b;
		System.out.println(c);*/
		
		int[] data = new int[10];
		data[8]=15;
		System.out.println(data[8]);
		
	}

	private static void Compile_Time_Error() {
	
		int a=5;
		int b=10;
		int c=a+b;
		System.out.println(c);
		
	}

}
