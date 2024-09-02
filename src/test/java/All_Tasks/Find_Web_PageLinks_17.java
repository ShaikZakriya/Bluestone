package All_Tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Web_PageLinks_17 {

	public static void main(String[] args) throws InterruptedException {
		
		  Find_Total_WebLinks();
        //Automate_Upto_Selenium();
	}

	private static void Automate_Upto_Selenium() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		WebElement firstName    = driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement lastName     = driver.findElement(By.xpath("//input[@name='lastname']"));
		WebElement Gender       = driver.findElement(By.xpath("//input[@name='sex']"));
		WebElement exp7         = driver.findElement(By.xpath("//input[@value='7']"));
		WebElement Date1        = driver.findElement(By.xpath("//input[@value='7']/following::input"));
		WebElement Date         = driver.findElement(By.xpath("//strong[text()='Date:  ']/following::input[1]"));
		WebElement ManualTester = driver.findElement(By.xpath("//input[@value='Manual Tester']"));
		WebElement AutoMation   = driver.findElement(By.xpath("//input[@value='Automation Tester']"));
		  
		
		
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
		
		Date1.sendKeys("01/01/2024");
		Thread.sleep(3000);
		
		ManualTester.click();
		Thread.sleep(3000);
		
		AutoMation.click();
		Thread.sleep(5000);
		
		driver.close();
		
	}

	private static void Find_Total_WebLinks() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 
		driver.get("https://www.facebook.com/?_rdc=1&_rdr");		
		
		List<WebElement> total_links = driver.findElements(By.tagName("a"));
		int count = total_links.size();
		System.out.println("The number of links available on the webpage: "+count);
		driver.close();
		
		
	}

}	
