package task4.adactin.stepdefinition.cucumber;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import task4.adactin.pagefactor.cucumber.BookHotelObject;

public class SearchHotelPageDefinition{

	@Given("Select radio button")
	public void select_radio_button() {
		BookHotelObject PO =new BookHotelObject();
	    PO.radiobutton_0.click();
	}

	@When("select continue")
	public void select_continue() {
		BookHotelObject PO =new BookHotelObject();
	    PO.continue1.click();
	}

	@Then("validate Hotel selected")
	public void validate_hotel_selected() {
		BookHotelObject PO =new BookHotelObject();
	    boolean displayed = PO.BooKRoom.isDisplayed();
	    Assert.assertTrue(displayed);
	}
}
