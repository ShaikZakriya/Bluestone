package All_Tasks;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class All_Waits {

	public static void main(String[] args) {
		
		Fluent_Wait();
        Implicit_Wait();
	    Explicit_Wait();
	}

	private static void Explicit_Wait() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		WebElement Search = driver.findElement(By.xpath("//input[text()='Search'"));
		
		WebDriverWait expWait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		expWait.until(ExpectedConditions.visibilityOf(Search));
		
	    Search.click();
	}

	private static void Implicit_Wait() {
	      
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Systax for Implicit Wait
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}

	private static void Fluent_Wait() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Wait <WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		
	}

}
