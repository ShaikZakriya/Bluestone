package Learning_Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Text_Task {

	public static void main(String[] args) throws InterruptedException {
		
		
			
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		WebElement Brocolli=driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
		WebElement Cauliflower=driver.findElement(By.xpath("//button[text()='ADD TO CART']/following::button[1]"));
        WebElement Cucumber=driver.findElement(By.xpath("//button[text()='ADD TO CART']/following::button[2]"));
        WebElement beetroot=driver.findElement(By.xpath("//button[text()='ADD TO CART']/following::button[3]"));
        WebElement Cart=driver.findElement(By.xpath("//img[@alt='Cart']"));
        WebElement Proceed=driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']"));
		WebElement Placeorder=driver.findElement(By.xpath("//button[text()='Place Order']"));
        
		Brocolli.click();
		Thread.sleep(3000);
		
		Cauliflower.click();
		Thread.sleep(3000);
		
		Cucumber.click();
		Thread.sleep(3000);
		
		beetroot.click();
		Thread.sleep(3000);
		
		Cart.click();
		Thread.sleep(3000);
		
		Proceed.click();
		Thread.sleep(3000);
		
		
	} 
		
}


		
		

