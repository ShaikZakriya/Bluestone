package Practice_Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		
		//Alerts_Accepts();
        //Alerts_Dismiss();
          Alerts_Accept_GetText();	
	}

	private static void Alerts_Accept_GetText() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
		
        String Expected_Msg = "Customer Successfully deleted";
        
        WebElement CustomerID_TextBox   =driver.findElement(By.xpath("//input[@name='cusid']"));
		WebElement Submit_Button        =driver.findElement(By.xpath("//input[@name='submit']"));    
		
		CustomerID_TextBox.sendKeys("9581928986");
		Submit_Button.click();
  
		String Actual_Msg = driver.switchTo().alert().getText();
		System.out.println("Acutal_Msg");
		
		if(Expected_Msg.contentEquals(Actual_Msg));
		
		{
		     System.out.println("Message is Same - Test case is Pass");
		}
		
		
		
	
	}

	private static void Alerts_Dismiss() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		WebElement Customer_ID_TextBox = driver.findElement(By.xpath("//input[@name='cusid']"));
		WebElement Submit_btn = driver.findElement(By.xpath("//input[@name='submit']"));
		
		Customer_ID_TextBox.sendKeys("9581620080");
		Submit_btn.click();
		
		driver.switchTo().alert().dismiss();
		
		
	}

	private static void Alerts_Accepts() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		WebElement Customer_ID_TextBox = driver.findElement(By.xpath("//input[@name='cusid']"));
		WebElement Submit_btn = driver.findElement(By.xpath("//input[@name='submit']"));
		
		Customer_ID_TextBox.sendKeys("9581620080");
		Submit_btn.click();
		
		driver.switchTo().alert().accept();
		
	
		
		
	}

}
