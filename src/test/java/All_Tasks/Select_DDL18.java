package All_Tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_DDL18 {

	public static void main(String[] args) throws InterruptedException {
		
	  //Select_DDL18();
      //Select_Multiples_DDL();
        Select_DropDown_List();
	}

	private static void Select_DropDown_List() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://online.apsrtcpass.in/counterstupass.do");
		
	 
		List<WebElement> SCC = driver.findElements(By.xpath("//select[@name='userProperties(ssctype)']"));
		int count = SCC.size();
		System.out.println("Number of Values : " +count);
	
        WebElement SCC_board = driver.findElement(By.xpath("//select[@name='userProperties(ssctype)']"));
        Select sc = new Select(SCC_board);
        sc.selectByIndex(5);
		Thread.sleep(3000);
		
	}

	private static void  Select_Multiples_DDL() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		WebElement continents = driver.findElement(By.xpath("//select[@name='continents']"));
		Select sc = new Select(continents);
		Thread.sleep(3000);
		sc.selectByVisibleText("Europe");
		Thread.sleep(3000);

		WebElement SelectCommand_multiple = driver.findElement(By.xpath("//select[@name='selenium_commands']"));
		Select sc2 = new Select(SelectCommand_multiple);
		
		sc2.selectByVisibleText("Switch Commands");
		Thread.sleep(3000);
		sc2.selectByVisibleText("Wait Commands");
		Thread.sleep(3000);
		 

		
	}

	private static void Select_DDL18() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.apsrtcpass.in/counterstupass.do");
		
		WebElement SSC_BoardType = driver.findElement(By.xpath("//select[@name='userProperties(ssctype)']"));
        
		Thread.sleep(3000);
		Select sc=new Select(SSC_BoardType);
        sc.selectByValue("cbse");
        Thread.sleep(3000);
        sc.selectByValue("icse");
        

        //WebElement  Date_of_Birth = driver.findElement(By.xpath("//input[@id='userProperties(passdob)']"));      
        //Thread.sleep(3000);
        //Date_of_Birth.sendKeys("15-05-1996");
         
        WebElement SSC_Reg_Sup = driver.findElement(By.xpath("//select[@id='userProperties(passType)']"));  
        Thread.sleep(3000);
        Select Bs=new Select(SSC_Reg_Sup);
        Bs.selectByVisibleText("Supplementary");
         
        WebElement SSC_Year_of_pass = driver.findElement(By.xpath("//input[@id='userProperties(sscpassfailyr)']"));
        Thread.sleep(3000);
        SSC_Year_of_pass.sendKeys("2013");
       
       
        WebElement SSC_Hall_Ticket = driver.findElement(By.xpath("//input[@id='userProperties(sscno)']"));
        SSC_Hall_Ticket.sendKeys("1310262989");
        
        WebElement DOB = driver.findElement(By.xpath("//input[@id='userProperties(passdob)']"));
        DOB.sendKeys("15/05/1998");
        
        Thread.sleep(5000);
        
        WebElement Name = driver.findElement(By.xpath("//input[@name='userProperties(youthname)']"));
        Name.click();
        Name.sendKeys("Shaik Zakriya");
       
        WebElement Father_Name = driver.findElement(By.xpath("//input[@name='userProperties(youthfgname)']"));
        Father_Name.sendKeys("Shaik Ibrahim");
        
        WebElement Date_of_Birth = driver.findElement(By.xpath("//input[@name='userProperties(dob)']"));
        Date_of_Birth.sendKeys("15-05-1996");
        
        WebElement Aadhar_Num = driver.findElement(By.xpath("//input[@name='userProperties(aadharno)']"));
        Aadhar_Num.sendKeys("9581620080");
        
        WebElement Gender_Male = driver.findElement(By.xpath("//input[@value='M']"));
        Gender_Male.click();
        
        WebElement Select_District = driver.findElement(By.xpath("//select[@name='userProperties(addrdistid)']"));
        Select_District.click();
        
        Select Ac = new Select( Select_District);
        Thread.sleep(3000);
        Ac.selectByValue("13");
        
        Thread.sleep(8000);
        
         driver.quit();
        
		
	}

}
