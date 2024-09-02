package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		 
	  //Iframe();	
	  //SwitchToFrame_By_Index();
	  //SwitchToFrame_By_WebElement();
	
		
	}


	private static void SwitchToFrame_By_WebElement() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		//switch to Iframe By WebElement
		
	    WebElement iframe_xpath = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
	    driver.switchTo().frame(iframe_xpath);
	    
        Thread.sleep(3000);
				
	    WebElement Message_TextBox = driver.findElement(By.xpath("//body[@id='tinymce']"));
	    Message_TextBox.clear();
				
	    Thread.sleep(3000);
	    Message_TextBox.sendKeys("BLUESTONE");
				
	    Thread.sleep(3000);
	    Message_TextBox.clear();
				
	    Thread.sleep(3000);
	    Message_TextBox.sendKeys("Shaik Zakriya");
				
		driver.close();		
		
		
		
		
	}

	private static void SwitchToFrame_By_Index() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		//switch to Iframe By Index
		
	  driver.switchTo().frame(0);
      Thread.sleep(3000);
				
	  WebElement Message_TextBox = driver.findElement(By.xpath("//body[@id='tinymce']"));
	  Message_TextBox.clear();
				
	  Thread.sleep(3000);
	  Message_TextBox.sendKeys("BLUESTONE");
				
	  Thread.sleep(3000);
	  Message_TextBox.clear();
				
	  Thread.sleep(3000);
	  Message_TextBox.sendKeys("Shaik Zakriya");
				
				
		
		
		
	}

	private static void Iframe() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		//switch to Iframe By ID
		
		driver.switchTo().frame("mce_0_ifr");
		Thread.sleep(3000);
		
		WebElement Message_TextBox = driver.findElement(By.xpath("//body[@id='tinymce']"));
		Message_TextBox.clear();
		
		Thread.sleep(3000);
		Message_TextBox.sendKeys("BLUESTONE");
		
		Thread.sleep(3000);
		Message_TextBox.clear();
		
		Thread.sleep(3000);
		Message_TextBox.sendKeys("Shaik Zakriya");
		
		
		
		
	}

}
