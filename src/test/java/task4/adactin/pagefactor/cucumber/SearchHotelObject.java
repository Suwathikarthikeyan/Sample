package task4.adactin.pagefactor.cucumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchHotelObject extends SelectHotelObject {

	@FindBy(xpath="//td[@class='login_title']")
    public WebElement SelectRoom;
	
	@FindBy(id = "radiobutton_0")
	public WebElement radiobutton_0;
    
    @FindBy(id = "continue")
    public WebElement continue1;
}
