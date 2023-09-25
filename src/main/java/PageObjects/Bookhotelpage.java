package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Bookhotelpage {
public static WebDriver driverb;
	
	public Bookhotelpage(WebDriver driver4){
		
		driverb=driver4;
		PageFactory.initElements(driver4, this);
		
	}
	@FindBy(id="first_name")
	WebElement txtfstname;
	
	@FindBy(id="last_name")
	WebElement txtlstname;
	
	@FindBy(id="address")
	WebElement txtaddrs;
	
	@FindBy(id="cc_num")
	WebElement txtccnum;
	
	@FindBy(id="cc_type")
	WebElement selcctype;
	
	@FindBy(id="cc_exp_month")
	WebElement selmonth;
	
	@FindBy(id="cc_exp_year")
	WebElement selccyear;
	
	@FindBy(id="cc_cvv")
	WebElement selcc;
	
	@FindBy(id="book_now")
	WebElement clkbook;
	
	public void Firstname(String frstn){
		
		txtfstname.sendKeys(frstn);
	}
	public void Lastname(String lastn){
		
		txtlstname.sendKeys(lastn);
	}
	
	public void setAddress(String adrs){
		txtaddrs.sendKeys(adrs);
	}
		
	public void Crditcardno(String ccno){
		txtccnum.sendKeys(ccno);
	}

	public void clickCard_type(){
		Select dropsel= new Select(selcctype);
		dropsel.selectByValue("MAST");
	}
	public void selEM(){
		Select dropsel2= new Select(selmonth);
		dropsel2.selectByValue("1");
	}
	
	public void selEy(){
		Select dropsel3= new Select(selccyear);
		dropsel3.selectByValue("2025");
	}

	public void SelCC(String slcc){
		selcc.sendKeys(slcc);
	}
	public void clickBooknow(){
		clkbook.click();
	}
}
