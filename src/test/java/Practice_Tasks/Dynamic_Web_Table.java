package Practice_Tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Web_Table {

	public static void main(String[] args) {
		
		Dynamic_Tables();

	}

	private static void Dynamic_Tables() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> Rows = driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
        System.out.println("Number of Rows : " +Rows.size());
	
        List<WebElement> Columns = driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]//td"));
        System.out.println("Number of Columns : " +Columns.size());
	
        for(int i=1; i<=Rows.size(); i++)
        {
		
        	for(int j=1; i<=Columns.size(); i++)
        	{
        		
	    WebElement Target = driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]//td["+j+"]"));
	    String Text = Target.getText();
	    System.out.println(Text);
	    
	    if(Target.equals("Apollo Hospital"))
	    {
	    	Target.click();
	    }
	    
	    driver.quit();
	    
        	}
        	
        }
	}
	
        	
	    
	    
	

}