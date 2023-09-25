
	package Testcases;

	import java.util.concurrent.TimeUnit;

	import org.testng.annotations.Test;

	import PageObjects.LoginPage;
import PageObjects.Bookhotelpage;
import PageObjects.Hotelbooking;
	import PageObjects.SelectHotel;


	public class Tc_BookHotel_001 extends BaseClass {
		
		@Test
		public void SelectHotel() throws InterruptedException{
			
			driver.get(URL);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			//Loginpage
			LoginPage lp=new LoginPage(driver);
			lp.setUsername(username);
			lp.setPassword(password);
			Thread.sleep(10000);
			lp.clickLogin();
			
			//Search hotel
			Hotelbooking sh=new Hotelbooking(driver);
			
			sh.setLocation();
			Thread.sleep(2000);

			sh.setSelectHotel();
			Thread.sleep(2000);

			sh.setRoomType();
			Thread.sleep(2000);

			sh.setNoofRooms();
			Thread.sleep(2000);

			sh.setCheckinDate(checkindate);
			Thread.sleep(2000);

			sh.setCheckoutDate(checkoutdate);
			Thread.sleep(2000);

			sh.setAdultsperroom();
			Thread.sleep(2000);

			sh.setChildrensperroom();
			Thread.sleep(2000);
			
			sh.clickSearchbtn();
			Thread.sleep(2000);
			
			//Select hotel
			SelectHotel seh=new SelectHotel(driver);
			seh.rdbut();
			Thread.sleep(2000);

			seh.reg_button();
			Thread.sleep(2000);
			
			//Book a hotel
			
			Bookhotelpage bhp=new Bookhotelpage(driver);
			bhp.Firstname(first_name);
			Thread.sleep(2000);
			
			bhp.Lastname(last_name);
			Thread.sleep(2000);
			
			
			bhp.setAddress(address);
			Thread.sleep(2000);

			bhp.Crditcardno(cc_num);
			Thread.sleep(2000);
			
			bhp.clickCard_type();
			Thread.sleep(2000);
			
			bhp.selEM();
			Thread.sleep(2000);
			
			bhp.selEy();
			Thread.sleep(2000);
			
			bhp.SelCC(cc_cvv);
			Thread.sleep(2000);

			bhp.clickBooknow();
			Thread.sleep(50000);


		}

	}
