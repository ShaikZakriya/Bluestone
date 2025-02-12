package All_Tasks;


import java.util.List;

import javax.swing.text.html.Option;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

import Selenium.WebElements;

public class SelectLastButonevalue {

	public static void main(String[] args) throws InterruptedException {
		
		Selectlastbutonevalue();

	}

	private static void Selectlastbutonevalue() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		try {
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
		//Select second last item "State Dropdown
		WebElement StateDropdown = driver.findElement(By.xpath("//select[@id='state']"));
		Select stateSelect = new Select(StateDropdown);
		int stateOptionsSize = stateSelect.getOptions().size();
		stateSelect.selectByIndex(stateOptionsSize - 2 );
		
		
		Thread.sleep(3000);
		
	  //Select second last item from city dropdown	
		WebElement CityDropdown = driver.findElement(By.xpath("//select[@id='city']"));
		Select citySelect = new Select(CityDropdown);
		int cityOptionsSize = citySelect.getOptions().size();
		citySelect.selectByIndex(cityOptionsSize - 2 );
		
        System.out.println("Second last options selected successfully");
         
		} catch (Exception e ) {
			
			e.printStackTrace();
		
		} finally {
			
			Thread.sleep(5000);
		}
         
	}

}
