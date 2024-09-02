package Practice_Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DDL {

	public static void main(String[] args) throws InterruptedException {
		
		//Dropdown_list();
        Select_Mul_DDL();
	}

	private static void Select_Mul_DDL() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		WebElement Continents = driver.findElement(By.xpath("//select[@name='continents']"));
		Select sc = new Select(Continents);
		sc.selectByVisibleText("Australia");
		
		WebElement Sel_Commands = driver.findElement(By.xpath("//select[@name='selenium_commands']"));
		Select bs = new Select(Sel_Commands);
		
		bs.selectByVisibleText("Wait Commands");
		bs.selectByVisibleText("Switch Commands");
		Thread.sleep(3000);
		
		driver.close();
		
	}

	private static void Dropdown_list() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://online.apsrtcpass.in/counterstupass.do");
		
		WebElement SSC_Board_Type = driver.findElement(By.xpath("//select[@name='userProperties(ssctype)']"));
        
		Select sc = new Select(SSC_Board_Type);
	    sc.selectByVisibleText("ICSE");
	    Thread.sleep(3000);
	    sc.selectByVisibleText("APOS");
	    Thread.sleep(3000);
	    
	    WebElement DOB = driver.findElement(By.xpath("//input[@id='userProperties(passdob)']"));
        DOB.sendKeys("15/05/1998");
        
	    WebElement Name = driver.findElement(By.xpath("//input[@name='userProperties(youthname)']"));
	    Name.click();
	    Name.sendKeys("Shaik");
	    Thread.sleep(3000);
	
	
	
	
	}

}
