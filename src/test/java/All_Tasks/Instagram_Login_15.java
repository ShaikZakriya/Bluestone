package All_Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram_Login_15 {

	public static void main(String[] args) throws InterruptedException {
		
		Instagram_Login();

	}

	private static void Instagram_Login() throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
			
		WebElement userId    =driver.findElement(By.xpath("//input[@value='9581928986']"));
		WebElement password  =driver.findElement(By.xpath("//input[@value='9581620080']"));
		WebElement loginbtn  =driver.findElement(By.xpath("//button[@type='submit']"));	
		Thread.sleep(3000);
		userId.sendKeys("9581928986");
		Thread.sleep(3000);
		password.sendKeys("9581620080");
		Thread.sleep(5000);
		loginbtn.click();
		
	    driver.close();
			
		
	}

}
