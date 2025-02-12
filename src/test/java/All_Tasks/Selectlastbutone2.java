package All_Tasks;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selectlastbutone2 {

	public static void main(String[] args) throws InterruptedException {
		
		Selectlastbutone2();

	}

	private static void Selectlastbutone2() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		try {
			
			
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
	  //Locate the first dropdown (State)	
		WebElement stateDropdown = driver.findElement(By.xpath("//select[@id='state']"));
	    Select stateSelect = new Select(stateDropdown);
		
	   //Select last but one option in state dropdown
		int stateOptionSize = stateSelect.getOptions().size();
		stateSelect.selectByIndex(stateOptionSize - 2);   //Last butone index
		
	  //Wait for city dropdown to load after state selection
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("city")));
		
	  //Locate and select city dropdown	
		WebElement cityDropdown = driver.findElement(By.xpath("//select[@id='city']"));
		Select citySelect = new Select(cityDropdown);
		
	  //Get all options and select last butone option in city dropdown 	
		int cityOptionSize = citySelect.getOptions().size();
		citySelect.selectByIndex(cityOptionSize - 2);  //Last butone index
		
		System.out.println("Successfully selected last but one option from city dropdown. ");
		
		} catch (Exception e) {
			
			e.printStackTrace();
	   
		
		} finally {
			
			
		}
		
	    Thread.sleep(5000);
		
		
		
		}

}