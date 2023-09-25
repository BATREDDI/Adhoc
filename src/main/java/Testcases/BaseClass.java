package Testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import Utilities.ReadConfig;



public class BaseClass {
// implement the common functionality of every testcase
	
	ReadConfig rc=new ReadConfig();
	
	
	public String URL=rc.getapplicationURL();
	public String username=rc.getUsername();
	public String password=rc.getPassword();
	
	public String checkindate=rc.getCheckinDate();
	public String checkoutdate=rc.getCheckoutDaate();
	public String first_name=rc.getFstname();
	public String last_name=rc.getLastname();
	public String address=rc.getAddrs();
	public String cc_num=rc.getCnum();
	public String cc_cvv=rc.getCvv();
	
	public  RemoteWebDriver driver;
	
	@BeforeClass
	public void OpenApplication()  {
		//launch the web driver
		
		
		
		
		System.setProperty("webdriver.chrome.driver", rc.getChromePath());
		driver=new ChromeDriver();
		
		
	}
	
	@AfterClass
	public void CloseApplication(){
		
		//driver.quit();
	}
	
	
	
}
