package Practice_Tasks;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Handling {

	public static void main(String[] args) throws InterruptedException {
		
		Windows_Handling();

	}

	private static void Windows_Handling() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		
		WebElement Aboutlink = driver.findElement(By.xpath("//span[text()='About']"));
		WebElement Helplink  = driver.findElement(By.xpath("//span[text()='Help']"));
		WebElement APIlink   = driver.findElement(By.xpath("//span[text()='API']"));
		
		Aboutlink.click();
		Helplink.click();
		APIlink.click();
		
		Set<String> AllHandles = driver.getWindowHandles();
		
		Iterator<String> ite = AllHandles.iterator();
		
		while(ite.hasNext())
		{
			String childWindow = ite.next();
			driver.switchTo().window(childWindow);
			String CurrentTitle = driver.getTitle();
			
			System.out.println(CurrentTitle);
			
		}
		  Thread.sleep(3000);
		  driver.quit();
	}

}
