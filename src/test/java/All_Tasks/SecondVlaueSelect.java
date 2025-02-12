package All_Tasks;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.tools.javac.main.Option;

public class SecondVlaueSelect {

	public static void main(String[] args) {
		
		SecondValueSelect();

	}

	private static void SecondValueSelect() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		try {
			
			
			driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
	      //Locate the dropdown State
			WebElement StateDropdown = driver.findElement(By.xpath("//select[@id='state']"));
			Select StateSelect = new Select(StateDropdown);
	        StateSelect.selectByIndex(2);
	        
	      //Locate the second dropdown City
	        WebElement CityDropdown = driver.findElement(By.xpath("//select[@id='city']"));
			
	        Select CitySelect = new Select(CityDropdown);
	        
	        CitySelect.selectByIndex(2);
	        
	        Thread.sleep(3000);
	        
			} catch (Exception e) {
					
			e.printStackTrace();
			
			} finally {
				
				
			}
			
		    
		
		
	}

}
