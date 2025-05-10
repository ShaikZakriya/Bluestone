package XYZ_TASKS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Green_cart_task {

	public static void main(String[] args) {
		
		Green_kart();

	}

	private static void Green_kart() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		List <WebElement> products = driver.findElements(By.xpath("//button[text()='ADD TO CART']"));
		
		for(int i=0; i<products.size(); i++)
		{
			String name =products.get(i).getText();
			
			if(name.contains("Cucumber"))
			{
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}
		}
		
		driver.quit();
	}

}
