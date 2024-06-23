package task4.adactin.pagefactor.cucumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookHotelObject extends SearchHotelObject{
	  @FindBy(id="hotel_name_dis")
	    public WebElement BooKRoom;
	    		
	    @FindBy(id = "first_name")
	    public WebElement first_name;
	    
	    @FindBy(name = "last_name")
	    public WebElement last_name;
	    
	    @FindBy(id = "address")
	    public WebElement address;
	    	    
	    @FindBy(id = "cc_num")
	    public WebElement cc_num;
	    
	    @FindBy(id = "cc_type")
	    public WebElement cc_type;
	    
	    @FindBy(id = "cc_exp_month")
	    public WebElement cc_exp_month;
	  	    
	    @FindBy(id = "cc_exp_year")
	    public WebElement cc_exp_year;
	    
	    @FindBy(id = "cc_cvv")
	    public WebElement cc_cvv;
	    
	    @FindBy(id = "book_now")
	    public WebElement book_now;
	    
	    @FindBy (name="order_no")
	    public WebElement OrderID;
}
