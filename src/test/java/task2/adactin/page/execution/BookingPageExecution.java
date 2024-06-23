package task2.adactin.page.execution;

import org.openqa.selenium.support.PageFactory;

import task2.adactin.baseclass.BaseClass;
import task2.adactin.pageobject.BookingHotelLocators;

public class BookingPageExecution extends SelectPageExecution{
	
	public BookingPageExecution(){
		PageFactory.initElements(driver, this);
	}
	
	public static void firstname() {
		String firstnameval =BaseClass.excelReader(1,8); 
		BaseClass.sendValues(new BookingHotelLocators().getFirst_name(), firstnameval);
		}
	
	public static void lastname() {
		String lastnameval =BaseClass.excelReader(1,9); 
		BaseClass.sendValues(new BookingHotelLocators().getLast_name(), lastnameval);
		}
	
	public static void address() {
		String addressval =BaseClass.excelReader(1,10); 
		BaseClass.sendValues(new BookingHotelLocators().getAddress(), addressval);
		}
	
	public static void cc_num() {
		String cc_numval =BaseClass.excelReader(1,11); 
		BaseClass.sendValues(new BookingHotelLocators().getCc_num(), cc_numval);
		}
	
	public static void cc_type() {
		String cc_typeval =BaseClass.excelReader(1,12); 
		BaseClass.dropDown(new BookingHotelLocators().getCc_type(), cc_typeval);
		}
	
	public static void cc_exp_month() {
		String cc_exp_monthval =BaseClass.excelReader(1,13); 
		BaseClass.dropDown(new BookingHotelLocators().getCc_exp_month(), cc_exp_monthval);
		}
	
	public static void cc_exp_year() {
		String cc_exp_yearval =BaseClass.excelReader(1,14); 
		BaseClass.dropDown(new BookingHotelLocators().getCc_exp_year(), cc_exp_yearval);
		}
	
	public static void cc_cvv() {
		String cc_cvvval =BaseClass.excelReader(1,15); 
		BaseClass.sendValues(new BookingHotelLocators().getCc_cvv(), cc_cvvval);
		}
	
	public static void book_now() {
	BaseClass.click_value(new BookingHotelLocators().getBook_now());
	}
	
	public static void bookid() {
		 BaseClass.getattribute(new BookingHotelLocators().getOrderID(),"value");
	}
  }
