package DataProvider_Annotation;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FaceBook {
	
	@Test(dataProvider = "testData")
	public void TestCases(String UserID, String Password) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
	
		WebElement UserName_TextBox = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement Password_TextBox = driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement Login_Button = driver.findElement(By.xpath("//button[@name='login']"));
		
		
		Thread.sleep(4000);
		UserName_TextBox.sendKeys(UserID);//TestData is changing
		Password_TextBox.sendKeys(Password);//TestData is changing
		Thread.sleep(4000);
		Login_Button.click();
		
		driver.close();
	}
	
	   @Test
	@DataProvider
	   public Object[][] testData() {
		//x = How many sets of data
		//Y = In each Set. How many values you are passing
		//Object[][] data = new Object[X][Y]
		   
		   
	   Object[][] data = new Object[3][2];
	   
	   data[0][0] = "UserName_1";
	   data[0][1] = "Password_1";
	   
	   data[1][0] = "UserName_2";
	   data[1][1] = "Password_2";
	   
	   data[2][0] = "UserName_3";
	   data[2][1] = "Password_3";
	   
	   
	   return data;
	   
	   
	 }
		   

}
