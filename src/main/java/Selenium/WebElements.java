package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		WebElement Gender = driver.findElement(By.xpath("//input[@name='sex']"));
		WebElement exp7 = driver.findElement(By.xpath("//input[@value='7']"));
		WebElement Date = driver.findElement(By.xpath("//strong[text()='Date:  ']/following::input[1]"));
		WebElement ManualTester = driver.findElement(By.xpath("//input[@value='Manual Tester']"));
		WebElement AutoMation = driver.findElement(By.xpath("//input[@value='Automation Tester']"));
		  
		
		
		//Sendkeys method to enter data into text box
	    //Click method to click on radio button
	    //click method to click on check box
	    firstName.sendKeys("Zakriya");
		Thread.sleep(3000);
		
		lastName.sendKeys("Shaik");
		Thread.sleep(3000);
		
		Gender.click();
		Thread.sleep(3000);
		
		exp7.click();
		Thread.sleep(3000);
		
		ManualTester.click();
		Thread.sleep(3000);
		
		AutoMation.click();
		Thread.sleep(5000);
		
		driver.close();
		
		
		
		

	}

}
