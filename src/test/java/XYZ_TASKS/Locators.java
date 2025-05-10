package XYZ_TASKS;

import java.awt.Desktop.Action;
import java.time.Duration;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators {

	public static void main(String[] args) throws InterruptedException {

		// Locators();
		// DDL();

	}

	private static void DDL() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement ddl = driver.findElement(By.xpath("//select"));
		ddl.click();

		Select sc = new Select(ddl);
		List<WebElement> allOptions = sc.getOptions();

		for (WebElement option : allOptions) 
		{
			System.out.println(option.getText());
		}

	}

	private static void Locators() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		// driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebElement Username = driver.findElement(By.xpath("//input[@name='username']"));
		Username.sendKeys("Admin");

		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.sendKeys("admin123");

		WebElement login = driver.findElement(By.xpath("//button[text()=' Login ']"));
		login.click();

		// WebElement search =
		// driver.findElement(By.xpath("//div[@class='oxd-main-menu-search']"));
		// search.sendKeys("Admin");

		WebElement admin = driver.findElement(By.xpath("//span[text()='Admin']"));
		admin.click();
		Thread.sleep(3000);

		WebElement Username2 = driver
				.findElement(By.xpath("//div[@class='oxd-table-filter']//input[@class='oxd-input oxd-input--active']"));
		Username2.sendKeys("Hitman");
		Thread.sleep(1000);

		/*
		 * WebElement select = driver.findElement(By.
		 * xpath("//label[text()='User Role']/parent::div/following-sibling::div//i[contains(@class,'oxd-select-text--arrow')]"
		 * )); select.click();
		 * 
		 * WebElement UserRole = driver.findElement(By.xpath(
		 * "//div[@class='oxd-table-filter']//div[text()='ESS']")); UserRole.click();
		 */

		// Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Step 1 - Click on dropdown

		WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//label[text()='User Role']/parent::div/following-sibling::div//div[contains(@class,'oxd-select-text-input')]")));
		dropdown.click();

		// Step 2 - Select ESS

		WebElement essOption = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='option']//span[text()='ESS']")));
		essOption.click();

		WebElement employeeName = driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
		employeeName.sendKeys("Radha Gupta");

		Actions ac = new Actions(driver);
		ac.moveToElement(employeeName).click().perform();

		Thread.sleep(2000);

		driver.quit();

	}

}
