package All_Tasks;

import org.testng.annotations.Test;

public class Priority_Enable_26 {

	@Test(priority = 0)
	public void login_PNB() {
		
		System.out.println("Logged into Bank - PNB");
	}
	
	@Test(priority = 0)
	public void CheckBalance() {
		  
		System.out.println("Check Balance in Bank -PNB");
	}
	
	@Test(priority = 1)
    public void TransferAmount_PNB() {
		
		System.out.println("Transfer Amount in Bank - PNB");
   }
   
	@Test(priority = 2)
	public void ReceivedAmount_PNB() {
		
		System.out.println("Received Amount in Bank - PNB");
	}
			
}
