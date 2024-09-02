package All_Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

    public class Data_Provider {

	@Test(dataProvider = "testData")
	public void testCases1(String Usernum) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
	    
		WebElement CustomerID_TextBox = driver.findElement(By.xpath("//input[@name='cusid']"));
		WebElement Submit_Btn  = driver.findElement(By.xpath("//input[@name='submit']"));
	    
		Thread.sleep(4000);
		CustomerID_TextBox.sendKeys(Usernum);
		Thread.sleep(4000);
		Submit_Btn.click();
		
		//using Alerts
	    driver.switchTo().alert().accept();
	    
	    driver.close();
	
	}
	
	  @DataProvider
	  public Object[][] testData() {
		
      Object[][] data = new Object[02][01];
      
      data[0][0]  = "9581928986";
      data[1][0]  = "9581620080";
      data[2][0]  = "9581928987";
      data[3][0]  = "9581928989";
      data[4][0]  = "9581659878";
      data[5][0]  = "9689785969";
      data[6][0]  = "9696789695";
      data[7][0]  = "9578945698";
      data[8][0]  = "9878589678";
      data[9][0]  = "9878958969";
      	  	  	  	  	  	  		  
	  return data;
     	 
	
	
	
	
	}
}
