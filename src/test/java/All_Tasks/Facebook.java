package All_Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
	
		Facebook();

	
	}
	

	private static void Facebook() {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		
		
		/*driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ShaikZakriya961@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("9581928986");
		driver.findElement(By.xpath("//button[@name='login']")).click();*/
		System.out.println(driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getTagName());
		
		
	
		
	}
}