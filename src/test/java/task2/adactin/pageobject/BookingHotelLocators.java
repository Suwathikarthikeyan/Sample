package task2.adactin.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingHotelLocators extends SelectHotelLocators{
	
	public BookingHotelLocators(){
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(id = "first_name")
	private WebElement first_name;
    
    @FindBy(name = "last_name")
	private WebElement last_name;
    
    @FindBy(id = "address")
	private WebElement address;
    	    
    @FindBy(id = "cc_num")
	private WebElement cc_num;
    
    @FindBy(id = "cc_type")
	private WebElement cc_type;
    
    @FindBy(id = "cc_exp_month")
	private WebElement cc_exp_month;
  	    
    @FindBy(id = "cc_exp_year")
	private WebElement cc_exp_year;
    
    @FindBy(id = "cc_cvv")
	private WebElement cc_cvv;
    
    @FindBy(id = "book_now")
	private WebElement book_now;
    
    @FindBy (name="order_no")
    private WebElement OrderID;
			       

	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCc_num() {
		return cc_num;
	}

	public WebElement getCc_type() {
		return cc_type;
	}

	public WebElement getCc_exp_month() {
		return cc_exp_month;
	}

	public WebElement getCc_exp_year() {
		return cc_exp_year;
	}

	public WebElement getCc_cvv() {
		return cc_cvv;
	}

	public WebElement getBook_now() {
		return book_now;
		
	}

	public WebElement getOrderID() {
		return OrderID;
	}
}
