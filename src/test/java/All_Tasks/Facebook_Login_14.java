package All_Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login_14 {

	public static void main(String[] args) {
		
		Facebook_Login();
        
	}

	private static void Facebook_Login() {
		
	 WebDriver driver = new ChromeDriver();
			
	 //launch the url
	 driver.get("https://www.facebook.com/login/");	
					
	 //Find the WebElement
	 WebElement UserID   = driver.findElement(By.xpath("//input[@id='email']"));
	 WebElement Password = driver.findElement(By.xpath("//input[@id='pass']"));
	 WebElement loginBtn = driver.findElement(By.xpath("//button[@name='login']"));
					
	 //Operations on Elements
	 UserID.sendKeys("shaikzakriya961@gmail.com");
	 Password.sendKeys("9581620080");
	 loginBtn.click();
					

		
	}

}
