package task2.adactin.page.execution;

import org.openqa.selenium.support.PageFactory;

import task2.adactin.baseclass.BaseClass;
import task2.adactin.pageobject.BookingHotelLocators;
import task2.adactin.pageobject.LoginPageLocators;

public class LoginPageExecution extends BookingHotelLocators{

	public LoginPageExecution() {
    PageFactory.initElements(driver, this);
		}
	
	public static void username() {
		String usernameval =BaseClass.propertiesRead("confuserName");
		BaseClass.sendValues(new LoginPageLocators().getUsername(), usernameval);
	}
	
	public static void password() {	
		String passwordval =BaseClass.propertiesRead("confpassword");
		BaseClass.sendValues(new LoginPageLocators().getPassword(), passwordval);
		}

	public static void login_button() {
		BaseClass.click_value(new LoginPageLocators().getLogin());
		}
}