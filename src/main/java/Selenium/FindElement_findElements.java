package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement_findElements {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
	//This will return only first matching WebElement and it will be stored in single 
		WebElement single = driver.findElement(By.xpath("//table[@class='dataTable']//tr"));	
		
	//This will return all the webElements
		List<WebElement> allElement = driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
	    int count = allElement.size();
	    System.out.println("Number of ELement in list "+count);
	    Thread.sleep(5000);
	    
	//closing the window
	    driver.close();
	    
		
		
	
	}

}
