package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	// store the login page webelements
	
	public WebDriver driver1;
	public LoginPage(WebDriver driver2){
		
		driver1=driver2;
		PageFactory.initElements(driver2, this);
		
	}
	
	//store the web elements
	
	@FindBy(id="username")
	WebElement txtusername;
	
	@FindBy(id="password")
	WebElement txtpassword;
	
	@FindBy(id="login")
	WebElement clickbtn;
	
	@FindBy(id="location")
	WebElement sellocation;
	
	@FindBy(id="hotels")
	WebElement selhotel;
	
	@FindBy(id="room_type")
	WebElement selroom;
	
	@FindBy(id="room_nos")
	WebElement selroomno;
	
	@FindBy(id="datepick_in")
	WebElement seldatein;
	
	@FindBy(id="datepick_out")
	WebElement seldateout;
	
	@FindBy(id="adult_room")
	WebElement seladult;
	
	@FindBy(id="child_room")
	WebElement selchild;
	
	@FindBy(id="Submit")
	WebElement clickbtn1;
	//we want to create associated methods
	//we want to create associated methods
	
	
		public void setUsername(String usern){
			
			txtusername.sendKeys(usern);
		}
		
		public void setPassword(String pass){
			txtpassword.sendKeys(pass);
		}
		
		public void clickLogin(){
			clickbtn.click();
		}
		
	
	public void clickLocation(){
		Select drpselect= new Select(sellocation);
		drpselect.selectByVisibleText("London");
	}
	
	public void clickHotels(){
		Select drpselect1= new Select(selhotel);
		drpselect1.selectByVisibleText("Hotel Creek");
	}
	
	public void clickRoom_type(){
		Select drpselect2= new Select(selroom);
		drpselect2.selectByVisibleText("Standard");
	}
	
	public void clickRoom_nos(){
		Select drpselect3= new Select(selroomno);
		drpselect3.selectByVisibleText("4 - Four");
	}
	public void clickDatepick_in(){
		Select drpselect4= new Select(seldatein);
		drpselect4.selectByVisibleText("22/08/2023");
	}
	public void clickDatepick_out(){
		Select drpselect5= new Select(seldateout);
		drpselect5.selectByVisibleText("23/08/2023");
	}
	
	public void clickAdult_room(){
		Select drpselect6= new Select(seladult);
		drpselect6.selectByVisibleText("1 - One");
	}
	
	public void clickChild_room(){
		Select drpselect7= new Select(selchild);
		drpselect7.selectByVisibleText("0 - None");
	}
	
	public void clickSubmit(){
		clickbtn1.click();
	}
	

	
}
