package All_Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Class_22 {

	public static void main(String[] args) throws InterruptedException {
	
		  Right_Click();
		//Double_click();
		//Hover_Mouse();
		//Drag_Drop();
       
	}


	private static void Drag_Drop() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(5000);
		
		WebElement drag_drop = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(drag_drop);
		Thread.sleep(5000);
		
		WebElement From_Element = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement To_Element   = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		//Actions class Drag and Drop Action using
		Actions ac = new Actions(driver);
		
		ac.dragAndDrop(From_Element, To_Element).build().perform();
		Thread.sleep(5000);
		
		driver.close();
		
		
	}

	private static void Hover_Mouse() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/hovers");
		Thread.sleep(3000);
		
		WebElement LastImage = driver.findElement(By.xpath("//img[@alt='User Avatar']/following::img[2]"));
		
		//Action Class perform a hover action using move to element method
		Actions ac = new Actions(driver);
		Thread.sleep(3000);
		
		ac.moveToElement(LastImage).build().perform();
		Thread.sleep(3000);
		
		driver.close();
		
	}

	private static void Double_click() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://mousetester.com/");
		
		WebElement clickMe_Button = driver.findElement(By.xpath("//div[@id='clickMe']"));
		Thread.sleep(3000);
		
		//Action class performing_Double click
		Actions sc = new Actions(driver);
		sc.doubleClick(clickMe_Button).build().perform();
		
		Thread.sleep(7000);
		driver.quit();
		
		
	}

	private static void Right_Click() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/context_menu");
		Thread.sleep(5000);
        
		WebElement Rectangle_Area = driver.findElement(By.xpath("//div[@id='hot-spot']"));
		Thread.sleep(5000);
		
		Actions ac = new Actions(driver);
		ac.contextClick(Rectangle_Area).build().perform();
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		driver.close();
		
	}

}
