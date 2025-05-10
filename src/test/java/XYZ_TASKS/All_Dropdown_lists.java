package XYZ_TASKS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class All_Dropdown_lists {

	public static void main(String[] args) throws InterruptedException {
		
		Static_Dropdown();

	}

	private static void Static_Dropdown() throws InterruptedException {
		
		//Static drop are fix values because values will not get change 
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
		WebElement continets = driver.findElement(By.xpath("//select[@id='state']"));
		Select sc = new Select(continets);
		sc.selectByIndex(3);
		Thread.sleep(3000);
		
		sc.selectByValue("NCR");
		Thread.sleep(4000);
		
		sc.selectByVisibleText("Rajasthan");
		Thread.sleep(4000);
		
		driver.quit();
		
		
	}

}
