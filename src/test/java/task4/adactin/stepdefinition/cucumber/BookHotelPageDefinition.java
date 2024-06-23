package task4.adactin.stepdefinition.cucumber;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import task4.adactin.baseclass.cucumber.BaseClass;
import task4.adactin.pagefactor.cucumber.BookHotelObject;

public class BookHotelPageDefinition {
	@Given("Enter firstName,LastName,Billing Address,credit card No.")
	public void enter_first_name_last_name_billing_address_credit_card_no() {
	BookHotelObject PO= new BookHotelObject ();
	PO.first_name.sendKeys("Suwathi");
	PO.last_name.sendKeys("Karthikeyan");
	PO.address.sendKeys("Madipakkam");
	PO.cc_num.sendKeys("1234567898765321");
}

	@When("Select card Type,Expire date and CVV Number")
	public void select_card_type_expire_date_and_cvv_number() {
    BaseClass.dropDown(new BookHotelObject().cc_type, "Master Card");		
    BaseClass.dropDown(new BookHotelObject().cc_exp_month, "April");
    BaseClass.dropDown(new BookHotelObject().cc_exp_year, "2029");
    BookHotelObject PO=new BookHotelObject();
    PO.cc_cvv.sendKeys("1234");
    PO.book_now.click();
 }

	@Then("Validate the order ID.")
	public void validate_the_order_id() throws InterruptedException {
		Thread.sleep(10000);
		BookHotelObject lpo = new BookHotelObject();
		boolean displayed = lpo.OrderID.isDisplayed();
		Assert.assertTrue(displayed);
		System.out.println("OrderID");
		BaseClass.close();
}
}
