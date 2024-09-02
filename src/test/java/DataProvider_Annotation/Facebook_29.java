package DataProvider_Annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Facebook_29 {

	@Test(dataProvider = "testData")
	 public void TestCase1(CharSequence[] number) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
        driver.get("https://demo.guru99.com/test/delete_customer.php");
	    
		WebElement CustomerID_TextBox = driver.findElement(By.xpath("//input[@name='cusid']"));
		WebElement Submit_Btn  = driver.findElement(By.xpath("//input[@name='submit']"));
	    
		Thread.sleep(4000);
		CustomerID_TextBox.sendKeys(number);
		Thread.sleep(4000);
		Submit_Btn.click();
		
		//using Alerts
	    driver.switchTo().alert().accept();
	    
	    driver.close();
	}

      @DataProvider
      
      public Object[][] testData() {
  		
          Object[][] data = new Object[07][01];
          
          data[0][0]  = "9581928986";
          data[1][0]  = "9581620080";
          data[2][0]  = "0851862208";
          data[3][0]  = "9581987856";
          data[4][0]  = "6398758964";
          data[6][0]  = "9874589458";
          data[7][0]  = "7859685478";
          
          return data;

      } 	  
}