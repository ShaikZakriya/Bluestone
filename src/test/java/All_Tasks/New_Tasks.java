package All_Tasks;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class New_Tasks {

	public static void main(String[] args) {
		
		String_Task();
		

	}


	private static void String_Task() {
		
		String input = "Zakriya";
		
		for (int i= 1; i <= input.length(); i++)
			
		{
			System.out.println(input.substring(0, i));
		}
	}

}
