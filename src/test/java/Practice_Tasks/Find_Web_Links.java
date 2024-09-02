package Practice_Tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Web_Links {

	public static void main(String[] args) {
		
		Find_Web_Links();

	}

	private static void Find_Web_Links() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 
		driver.get("https://www.instagram.com/");
		
		List <WebElement> Total_links = driver.findElements(By.tagName("a"));
		int count = Total_links.size();
		System.out.println("Total links available : " +count);
		driver.close();
		
		
		
		
		
		
	}

}
