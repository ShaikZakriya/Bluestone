package Selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Handling {

	public static void main(String[] args) throws InterruptedException {
     
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		
		WebElement About_Link = driver.findElement(By.xpath("//span[text()='About']"));
		WebElement Help_Link  = driver.findElement(By.xpath("//span[text()='Help']"));
		WebElement API_Link  = driver.findElement(By.xpath("//span[text()='API']"));
		 
		 Thread.sleep(2000); 
		 About_Link.click();
		
		 Thread.sleep(2000);
		 Help_Link.click();
		 
		 Thread.sleep(2000);
		 API_Link.click();
		 
		//Now 4 Windows are open
		//Getting the handles of all the opened windows
		//Return type for getWindowHandles is Set of string
		//Return type for getWindowHandle is String
		 Set<String> AllHandles = driver.getWindowHandles();
		 
		 Iterator<String> ite = AllHandles.iterator();
		 
		 while(ite.hasNext())
		 {
			 String childWindow = ite.next();
			 
			 Thread.sleep(2000);
			 driver.switchTo().window(childWindow);
			 
			 Thread.sleep(2000);
			 String CurrentTitle = driver.getTitle();
			 
			 System.out.println(CurrentTitle);
			 
			 
		}
		
		 Thread.sleep(2000);
		 
		//This quit method will close all the windows  
		 driver.quit();
		 
		 
		 
		 
		 //This close method will close the current windows in which the driver is present 
		 //driver.close();
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
