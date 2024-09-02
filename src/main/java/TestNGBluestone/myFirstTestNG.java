package TestNGBluestone;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myFirstTestNG {
	
	@Test
	public static void Testcaseone() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
	}
	
	@Test
	public static void Testcasetwo() {
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://jqueryui.com/droppable/");
		driver2.close();
		
	}
	
	
	
	

}
