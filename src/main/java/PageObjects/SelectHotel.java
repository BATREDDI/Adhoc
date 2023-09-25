
package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
	
	public static WebDriver drivern;
	
	public SelectHotel(WebDriver driver3){
		
		drivern=driver3;
		PageFactory.initElements(driver3, this);
		
	}
	
	@FindBy(id="radiobutton_0")
	WebElement rdbut;
	
	@FindBy(id="continue")
	WebElement reg_button;
	

	
	public void rdbut(){
		rdbut.click();
	}
	public void reg_button(){
		reg_button.click();
	}
	
}
