package All_Tasks;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Print_odd_values {

	public static void main(String[] args) {
		
		odd_values();

	}

	private static void odd_values() {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/#google_vignette");
		
		WebElement dropdown = driver.findElement(By.xpath("//select"));
		
		Select sc = new Select(dropdown);
		List<WebElement> allOptions = sc.getOptions();
		
		//List<WebElement> allOptions = sc.getOptions();
		
		int size = allOptions.size();
		
		for (int i=0; i<size; i++) {
			
			if ((i + 1) % 2 !=0) {
				
				String text = allOptions.get(i).getText();
				System.out.println(text);
			}
		}
		
		
		
		driver.quit();
	}
	
}
