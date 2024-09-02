package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selecting_DDL_Task {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		WebElement continents = driver.findElement(By.xpath("//select[@name='continents']"));
		Select sc = new Select(continents);
		Thread.sleep(3000);
	    sc.selectByVisibleText("Europe");
		Thread.sleep(3000);

		WebElement SelectCommand_multiple = driver.findElement(By.xpath("//select[@name='selenium_commands']"));
		Select sc2 = new Select(SelectCommand_multiple);
		
		sc2.selectByVisibleText("Switch Commands");
		Thread.sleep(3000);
		sc2.selectByVisibleText("Wait Commands");
		Thread.sleep(3000);
		 

	}

}
