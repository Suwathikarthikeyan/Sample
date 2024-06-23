package task4.adactin.pagefactor.cucumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import task4.adactin.baseclass.cucumber.BaseClass;

public class LoginPageObject extends BaseClass{
	public LoginPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	public WebElement user;
	
	@FindBy(id="password")
	public WebElement pass;
	
	@FindBy(id="login")
	public WebElement login;
}
