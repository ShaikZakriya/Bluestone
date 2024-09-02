package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectingMultipleValues_ddl {

	public static void main(String[] args) throws InterruptedException {
		
		//SelectingClass_DropDownlist();
        //Select_class_DDL();
	
	}
	
        private static void Select_class_DDL() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://online.apsrtcpass.in/counterstupass.do");
		
		//selecting a value from drop down list
		WebElement SSCBoard_ddl = driver.findElement(By.xpath("//select[@id='userProperties(ssctype)']"));
		
		Thread.sleep(5000);
		Select sc =new Select(SSCBoard_ddl);
		sc.selectByValue("icse");
		Thread.sleep(5000);
		sc.selectByValue("R");
		Thread.sleep(5000);
		
		driver.close();
		
		
	}

        private static void SelectingClass_DropDownlist() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		WebElement SelectCommand_multiple = driver.findElement(By.xpath("//select[@name='selenium_commands']"));
	
		Select sc = new Select(SelectCommand_multiple);
		Thread.sleep(5000);
		sc.selectByIndex(1);
		Thread.sleep(5000);
		sc.selectByIndex(3);
		
		
	}

}
