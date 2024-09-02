package All_Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Write_All_XPath_13 {

	public static void main(String[] args) {
		
		Write_All_XPath();
	

	}

	private static void Write_All_XPath() {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.apsrtcpass.in/counterstupass.do");
		
		// 1.Student 10th Details
		
		WebElement  SSC_Board_Type = driver.findElement(By.xpath("//select[@name='userProperties(ssctype)']"));
	    
		WebElement SSC_Reg_Sup = driver.findElement(By.xpath("//select[@name='userProperties(passType)']"));
	
	    WebElement SSC_Year_of_Pass = driver.findElement(By.xpath("//input[@name='userProperties(sscpassfailyr)']"));
	    
	    WebElement SSC_Hall_Ticket = driver.findElement(By.xpath("//input[@name='userProperties(sscno)']"));
	    
	    WebElement Date_of_Birth = driver.findElement(By.xpath("//input[@name='userProperties(passdob)']"));
	    
	    // 2.Student Details
	    
	    WebElement Name = driver.findElement(By.xpath("//input[@name='userProperties(youthname)']"));
	    
	    WebElement Father_Name = driver.findElement(By.xpath("//input[@name='userProperties(youthfgname)']"));
	    
	    WebElement Date_of_Birth1 = driver.findElement(By.xpath("//input[@name='userProperties(dob)']"));
	    
	    WebElement Gender = driver.findElement(By.xpath("//input[@name='userProperties(gender)']/following::input"));
	    
	    WebElement Aadhar_No = driver.findElement(By.xpath("//input[@name='userProperties(aadharno)']"));
	    
	    WebElement Mobile_No = driver.findElement(By.xpath("//input[@name='userProperties(studentmobileno)']"));
	    
	    WebElement is_Employee_Children = driver.findElement(By.xpath("//input[@name='userProperties(isempchild)']/following::input"));
	    
	    WebElement Email = driver.findElement(By.xpath("//input[@name='userProperties(email)']"));
	    
	    WebElement Photo = driver.findElement(By.xpath("//div[@id='manualupload']"));
	    
	    //3.Residential Address Details
	    
	    WebElement District = driver.findElement(By.xpath("//select[@name='userProperties(addrdistid)']"));
	    
	    WebElement Mandal = driver.findElement(By.xpath("//select[@name='userProperties(addrmndlid)']"));
	    
	    WebElement Village = driver.findElement(By.xpath("//select[@name='userProperties(addrvillid)']"));
	    
	    WebElement Address = driver.findElement(By.xpath("//textarea[@name='userProperties(addrhouseno)']"));
	    
	    //4.Institution Details
	    
	    WebElement Distirct = driver.findElement(By.xpath("//select[@name='userProperties(instdistname)']"));
	    
	    WebElement Mandal2 = driver.findElement(By.xpath("//select[@name='userProperties(instmndlname)']"));
	    
	    WebElement Institution_Name  = driver.findElement(By.xpath("//select[@name='userProperties(instcollname)']"));
	    
	    WebElement Course_Name = driver.findElement(By.xpath("//select[@name='userProperties(instcourseid)']"));
	    
	    WebElement Parent_Course_Year = driver.findElement(By.xpath("//select[@name='userProperties(instcourseyear)']"));
	    
	    WebElement Admission_No = driver.findElement(By.xpath("//input[@name='userProperties(admissionno)']"));
	    
	    WebElement Institution_Address = driver.findElement(By.xpath("//textarea[@name='userProperties(inst_address)']"));
	    
	    //5.Route Details
	    
	    WebElement Center = driver.findElement(By.xpath("//select[@name='userProperties(center_id)']"));
	    
	    WebElement Pass_Type_Required = driver.findElement(By.xpath("//select[@name='userProperties(buspasstypeid)']"));
	    
	    WebElement Enter_Captha = driver.findElement(By.xpath("//input[@name='userProperties(captha)']"));
	    
	    WebElement Submit = driver.findElement(By.xpath("//input[@name='userProperties(sbutton)']"));
	    
	                                //All Xpath Finished
	    
	    
	}
     
}
