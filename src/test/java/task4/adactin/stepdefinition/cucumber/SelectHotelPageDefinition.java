package task4.adactin.stepdefinition.cucumber;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import task4.adactin.baseclass.cucumber.BaseClass;
import task4.adactin.pagefactor.cucumber.BookHotelObject;

public class SelectHotelPageDefinition{

	@Given("Select location,hotel,room type,no of rooms.")
	public void select_location_hotel_room_type_no_of_rooms() {
		BaseClass.dropDown(new BookHotelObject().location,"Brisbane");
		BaseClass.dropDown(new BookHotelObject().hotels, "Hotel Hervey");
		BaseClass.dropDown(new BookHotelObject().room_type, "Deluxe");
		BaseClass.dropDown(new BookHotelObject().room_nos, "2 - Two");

}

	@When("Provide checkin date,checkout date,adult count and child count hit search")
	public void provide_checkin_date_checkout_date_adult_count_and_child_count_hit_search() {
		BookHotelObject PO=new BookHotelObject();
	    PO.datepick_in.sendKeys("27-06-2024");
	    PO.datepick_out.sendKeys("27-06-2024");
	    BaseClass.dropDown(new BookHotelObject().adult_room,"4 - Four");
	    BaseClass.dropDown(new BookHotelObject().child_room,"2 - Two");
	    PO.Submit.click();
	    
	}

	@Then("validate hotel available or not")
	public void validate_hotel_available_or_not() {
		BookHotelObject lpo = new BookHotelObject();
		boolean displayed = lpo.SelectRoom.isDisplayed();
		Assert.assertTrue(displayed);
    } 	
}
