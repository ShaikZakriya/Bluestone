package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Webpage_linkTask {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 
		driver.get("https://www.facebook.com/?_rdc=1&_rdr");		
		
		List<WebElement> total_links = driver.findElements(By.tagName("a"));
		int count = total_links.size();
		System.out.println("The number of links available on the webpage: "+count);
		driver.close();
		
		
		

	}

}
