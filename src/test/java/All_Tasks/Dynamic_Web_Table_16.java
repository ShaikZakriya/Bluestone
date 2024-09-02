package All_Tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Web_Table_16 {

	public static void main(String[] args) {
	    
		//Dynamic_Web_Table();
		Dynamic_Web_Table1();
	}

	private static void Dynamic_Web_Table1() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> Rows = driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
	    System.out.println("Number of Rows :" +Rows.size());
		
	    List<WebElement> Columns = driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]//td"));
	    System.out.println("Number of Columns :" +Columns.size());
	    
	  
	    for(int i=1; i<=Rows.size(); i++)
	    {
	   
	    	
	    
	    for(int j=1; i<=Columns.size(); i++)
	    {
	    	   
	    
	      
	    WebElement Target = driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]//td["+j+"]"));
	    String Text = Target.getText();
	    System.out.println(Text);
	    
	    if(Text.equals("Apollo Hospitals"))
	    {
	    	Target.click();
	    }
	         driver.close();
	    }
	    
	    }
	       
	       
	
	
	
	}

	    private static void Dynamic_Web_Table() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");	
		List<WebElement> Rows = driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
		System.out.println("Number of Rows: " +Rows.size());
		
		List<WebElement> Columns = driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]//td"));
		System.out.println("Number of Columns: " +Columns.size());
		//driver.close();
		
		for(int i=1; i<=Rows.size(); i++)
		{
		  
		   for(int j=1; j<=Columns.size(); j++)
		   {
		 
		  WebElement Target = driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]//td["+j+"]"));
		  String text = Target.getText();
		  System.out.println(text);
		
		 
		  if(text.equals("Apollo Hospitals"))
		  {
			  Target.click();
		  }
		  
		        driver.close();
			 
		   }
		
		
	}

}


	}
