package DataProvider_Annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Task {

	@Test(dataProvider = "testData")
	 public void TestCase1 (CharSequence[] Usernum) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	
	 driver.get("https://demo.guru99.com/test/delete_customer.php");
	 
	 WebElement Customer_ID_TextBox = driver.findElement(By.xpath("//input[@name='cusid']"));
	 WebElement SubmitBtn           = driver.findElement(By.xpath("//input[@name='submit']"));
	 
	 Customer_ID_TextBox.sendKeys(Usernum);
	 SubmitBtn.click();
	
     driver.switchTo().alert().accept();
	 Thread.sleep(5000);
	 
	}

    @DataProvider
     public Object[][] testData() {
     
     Object[][] data = new Object[05][01];
     
     data[0][0] = "9581928986";
     data[1][0] = "9581620080";
     data[2][0] = "6200807589";
     data[3][0] = "7799698574";
     data[4][0] = "9581857985";
     return data;
    
    
    }
}
