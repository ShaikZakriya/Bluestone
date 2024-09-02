package Practice_Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Class {

	public static void main(String[] args) throws InterruptedException {
		
		//Right_click();
        //Double_click();
	    //Hover_Mouse();
	      Drag_drop();
	}

	private static void Drag_drop() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(3000);
		
		WebElement Drag_drop = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	    driver.switchTo().frame(Drag_drop);
	    
	    WebElement From_Element = driver.findElement(By.xpath("//div[@id='draggable']"));
	    WebElement To_Element   = driver.findElement(By.xpath("//div[@id='droppable']"));
	    
	    Actions ac = new Actions(driver);
	    ac.dragAndDrop(From_Element, To_Element).build().perform();
	    
	    Thread.sleep(3000);
	    
		driver.quit();
		
		
		
	}

	private static void Hover_Mouse() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/hovers");
		Thread.sleep(3000);
		
		WebElement Second_Image = driver.findElement(By.xpath("//img[@alt='User Avatar']/following::div[2]"));
		Actions Ac = new Actions(driver);
		
		Ac.moveToElement(Second_Image).build().perform();
		Thread.sleep(3000);
		driver.quit();
		
	}

	private static void Double_click() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://mousetester.com/");
		
		WebElement Double_click = driver.findElement(By.xpath("//div[@id='clickMe']"));
		
		Actions ac = new Actions(driver);
		ac.doubleClick(Double_click).build().perform();
		
		Thread.sleep(3000);
		
		
		
		
	}

	private static void Right_click() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/context_menu");
		Thread.sleep(3000);
		
		WebElement Rec_Area = driver.findElement(By.xpath("//div[@id='hot-spot']"));
	    
		Actions ac = new Actions(driver);
		ac.contextClick(Rec_Area).build().perform();
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
	}
	
}
