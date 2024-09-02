package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DDL_Task {

	private static final WebElement District = null;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.apsrtcpass.in/counterstupass.do");
		
		WebElement SSC_BoardType = driver.findElement(By.xpath("//select[@name='userProperties(ssctype)']"));
        
		Thread.sleep(3000);
		Select sc=new Select(SSC_BoardType);
        sc.selectByValue("cbse");
        Thread.sleep(3000);
        sc.selectByValue("icse");
        
        WebElement SSC_Year_of_pass = driver.findElement(By.xpath("//input[@id='userProperties(sscpassfailyr)']"));
        Thread.sleep(3000);
        SSC_Year_of_pass.sendKeys("2013");
       
       //WebElement  Date_of_Birth = driver.findElement(By.xpath("//input[@id='userProperties(passdob)']"));      
       //Thread.sleep(3000);
       //Date_of_Birth.sendKeys("15-05-1996");
        
        WebElement SSC_Reg_Sup = driver.findElement(By.xpath("//select[@id='userProperties(passType)']"));  
        Thread.sleep(3000);
        Select Bs=new Select(SSC_Reg_Sup);
        Bs.selectByVisibleText("Supplementary");
        
        WebElement SSC_Hall_Ticket = driver.findElement(By.xpath("//input[@id='userProperties(sscno)']"));
        SSC_Hall_Ticket.sendKeys("1310262989");
        
        WebElement DOB = driver.findElement(By.xpath("//input[@id='userProperties(passdob)']"));
        DOB.sendKeys("15/05/1998");
        
        Thread.sleep(5000);
        
        WebElement Name = driver.findElement(By.xpath("//input[@name='userProperties(youthname)']"));
        Name.click();
        Name.sendKeys("Shaik Zakriya");
       
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
