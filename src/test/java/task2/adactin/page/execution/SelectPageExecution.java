package task2.adactin.page.execution;

import org.openqa.selenium.support.PageFactory;

import task2.adactin.baseclass.BaseClass;
import task2.adactin.pageobject.SelectHotelLocators;

public class SelectPageExecution extends SearchHotelPageExecution{

	public SelectPageExecution(){
		PageFactory.initElements(driver,"this");
		}
	
	public static void radiobutton_0() {
		BaseClass.click_value(new SelectHotelLocators().getRadiobutton_0());;
		}
	
	public static void continue1() {
		BaseClass.click_value(new SelectHotelLocators().getContinue1());;
		}
}