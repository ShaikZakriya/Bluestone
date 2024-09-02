package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_RightClickTask {

	public static void main(String[] args) throws InterruptedException {
		
		//DoubleClick();
        //Right_Click();
        Hover_Mouse();  
	}

	private static void Hover_Mouse() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/hovers");
		
		Thread.sleep(3000);
		WebElement Third_Image = driver.findElement(By.xpath("//img[@alt='User Avatar']/following::img[2]"));
		Thread.sleep(3000);
		
		Actions Ac =new Actions(driver);
		Ac.moveToElement(Third_Image).build().perform();
		Thread.sleep(3000);
		
		driver.close();
		
		
		
	}

	private static void Right_Click() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/context_menu");
		Thread.sleep(5000);
		
		
        WebElement Rectangle_Area = driver.findElement(By.xpath("//div[@id='hot-spot']"));
		Thread.sleep(3000);
		
		Actions Ac = new Actions(driver);
		Ac.contextClick(Rectangle_Area).build().perform();
		
		Thread.sleep(3000);
	    driver.switchTo().alert().accept();
	    driver.close();
		
		
		
		
		
        
		
	}

	private static void DoubleClick() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mousetester.com/");
		
		WebElement clickMe_Button = driver.findElement(By.xpath("//div[@id='clickMe']"));
		Thread.sleep(3000);
		
		Actions Sc = new Actions(driver);
		Sc.doubleClick(clickMe_Button).build().perform();
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		
	}

}
