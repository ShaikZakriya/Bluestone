package All_Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains_Text_Function {

	public static void main(String[] args) {
	      
		Text_Contains_Function();
		
	}


	private static void Text_Contains_Function() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
	  //Relative Xpath
		
		WebElement Email_Id = driver.findElement(By.xpath("//input[@id='email']"));
		Email_Id.click();
		
      //Text Function
		
		WebElement Forgotten_Password_Btn = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		Forgotten_Password_Btn.click();
		
	 // Contains Function
		
		WebElement Creat_New_Account_Btn = driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]"));
		Creat_New_Account_Btn.click();
		
	 // Contains & Text Function
		
		WebElement Forgotten_Password_Btn2 = driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]"));
		Forgotten_Password_Btn2.click();
		
	 // Following Sibling
		
		WebElement Password = driver.findElement(By.xpath("//input[@name='email']/following::input"));
		Password.sendKeys("9581620080");
		
	 // Ancestor
		
		String text = driver.findElement(By.xpath("//a[contains(text(),'HDIL')]/ancestor::tr")).getText();
		System.out.println(text);
		
		
	  //  Ancestor or Self
		
		 WebElement Password4 = driver.findElement(By.xpath("//input[@type='password']/ancestor-or-self::form//input[@name='email']"));
	     Password4.click();
		
		
	}

}
