
public class Datatypes {

	public static void main(String[] args) {
		
		Types_of_Datatypes();

	}

	private static void Types_of_Datatypes() {
		
		    byte   smallNumber = 127;          // 1 byte
	        short  shortNumber = 32000;       // 2 bytes
	        int    intNumber   = 100000;          // 4 bytes
	        long   longNumber  = 1000000000L;   // 8 bytes

	        // Decimal Data Types
	        float  floatNumber = 5.75f;       // 4 bytes
	        double doubleNumber = 19.99;     // 8 bytes

	        // Character Data Type
	        char letter = 'A';               // 2 bytes

	        // Boolean Data Type
	        boolean isJavaFun = true;        // 1 bit (true/false)

	        // String (Non-Primitive Data Type)
	        String message = "Hello, Java";

	        // Printing values one by one
	        System.out.println("Byte value: "   + smallNumber);
	        System.out.println("Short value: "  + shortNumber);
	        System.out.println("Integer value: "+ intNumber);
	        System.out.println("Long value: "   + longNumber);
	        System.out.println("Float value: "  + floatNumber);
	        System.out.println("Double value: " + doubleNumber);
	        System.out.println("Character value: " + letter);
	        System.out.println("Boolean value: " + isJavaFun);
	        System.out.println("String value: "  + message);
		
	}

}
