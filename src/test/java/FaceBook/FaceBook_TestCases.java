package FaceBook;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FaceBook_TestCases {
    
	@BeforeMethod
	 public void BrowserInitilization() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@AfterMethod
	public void ClosingBrowser() {
		
	
	}
	
	
	
	@Test
	public void ValidID_ValidPwd() {
		
		
		//login code for test cases
		
	}
	
     @Test
     public void InvalID_ValidPwd() {
    	 
 		 
    	//login for this test cases 
     }
     
     @Test
     public void validID_inValidPwd() {
    	 
 		 
 		 //login for this test cases
 		 	 
    	 
     }

	
}
