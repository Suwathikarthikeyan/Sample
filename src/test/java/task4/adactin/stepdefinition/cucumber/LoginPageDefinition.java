package task4.adactin.stepdefinition.cucumber;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import task4.adactin.baseclass.cucumber.BaseClass;
import task4.adactin.pagefactor.cucumber.BookHotelObject;

public class LoginPageDefinition{

	@Given("Launch the browser and load the Url")
	public void launch_the_browser_and_load_the_url() {
		 BaseClass.browserLaunch();
		 BaseClass.Url("https://adactinhotelapp.com/");
		    }

	@When("Provide valid username and password hit login")
	public void provide_valid_username_and_password_hit_login() {
		BookHotelObject lpo = new BookHotelObject();
		lpo.user.sendKeys("Suwathikarthikeyan10");
		lpo.pass.sendKeys("Aiite2024");
		lpo.login.click();
	}

	@Then("Validate if the user logged in successfully.")
	public void validate_if_the_user_logged_in_successfully() {
		BookHotelObject lpo = new BookHotelObject();
		boolean displayed = lpo.Logo.isDisplayed();
		Assert.assertTrue(displayed);
} 	
	
}
