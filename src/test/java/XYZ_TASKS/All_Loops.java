package XYZ_TASKS;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_Loops {

	public static void main(String[] args) throws InterruptedException {
		
		Greenkart_Task1();
		Greenkart_Task2();
		Greenkart_Task3();

	}

	private static void Greenkart_Task3() {

		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		WebElement product = driver.findElement(By.xpath("//h4[text()='Cucumber - 1 Kg']"));

		
		if(product.isDisplayed()) 
		{
			System.out.println("Product Name: " + product.getText());
		}
		
		else {
			System.out.println("Product not found");
		}
			
	}

	private static void Greenkart_Task2() throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		
		
		WebElement cucumber = driver.findElement(By.xpath("//div[@class='product' and . //h4[text()='Cucumber - 1 Kg']]//a[@class='increment']"));
		
		for (int i=0; i<4; i++)
		{
			cucumber.click();
			Thread.sleep(1000);
		}
		
            driver.quit();
            
            System.out.println("Zakriya");
		
	}

	private static void Greenkart_Task1() {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		List<WebElement> Products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		List<WebElement> buttons = driver.findElements(By.xpath("//button[text()='ADD TO CART']"));	
		
		for (int i=0; i<Products.size(); i++)
		{
			String name = Products.get(i).getText();
		
			if(name.contains("Beetroot"))
			{
				buttons.get(i).click();
				
				break; 
			}
		
	}

  }
}
