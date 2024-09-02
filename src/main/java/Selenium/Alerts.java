package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		 Alerts_Accept_GetText();
		//Alerts_Dismiss();
       //Alerts_Accept();
	}

	private static void Alerts_Accept() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
		
        WebElement CustomerID_TextBox   =driver.findElement(By.xpath("//input[@name='cusid']"));
		WebElement Submit_Button        =driver.findElement(By.xpath("//input[@name='submit']"));    
		
		CustomerID_TextBox.sendKeys("9581928986");
		Thread.sleep(3000);
		Submit_Button.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.close();
		
		
		
	}

	private static void Alerts_Dismiss() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
		
        WebElement CustomerID_TextBox   =driver.findElement(By.xpath("//input[@name='cusid']"));
		WebElement Submit_Button        =driver.findElement(By.xpath("//input[@name='submit']"));    
		
		CustomerID_TextBox.sendKeys("9581928986");
		Thread.sleep(3000);
		Submit_Button.click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		driver.close();
		
		
		
	}

	private static void Alerts_Accept_GetText() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		String Expected_Message = "Successfully Deleted";
		
		WebElement CustomerID_TextBox   =driver.findElement(By.xpath("//input[@name='cusid']"));
		WebElement Submit_Button        =driver.findElement(By.xpath("//input[@name='submit']"));    
		
		CustomerID_TextBox.sendKeys("9581928986");
		Submit_Button.click();
  
		 //Using Alerts
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		String Actual_Message = driver.switchTo().alert().getText();
		
		
		if(Expected_Message.equals(Actual_Message))
		{
            System.out.println("Message is same - Test Case is PASS");
		}
		else
		{
			System.out.println("Message is Not same - Test Case is Fail");
		}
		
		

		
		
		
		
	}

}
