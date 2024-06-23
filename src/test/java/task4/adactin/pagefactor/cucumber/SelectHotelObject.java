package task4.adactin.pagefactor.cucumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectHotelObject extends LoginPageObject{

	@FindBy(xpath="//img[@class='logo']")
	public WebElement Logo;
	
	@FindBy(id = "location")
	public WebElement location;
	
	@FindBy(id = "hotels")
	public WebElement hotels;
	
	@FindBy(id = "room_type")
	public WebElement room_type;

	@FindBy(id = "room_nos")
	public WebElement room_nos;
	
	@FindBy(id = "datepick_in")
	public WebElement datepick_in;
	
	@FindBy(id = "datepick_out")
	public WebElement datepick_out;
	
	@FindBy(id = "adult_room")
	public WebElement adult_room;
		
	@FindBy(id = "child_room")
	public WebElement child_room;
	
	@FindBy(id = "Submit")
	public WebElement Submit;
}
