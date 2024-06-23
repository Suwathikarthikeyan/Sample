package task2.adactin.page.execution;

import task2.adactin.baseclass.BaseClass;
import task2.adactin.pageobject.SearchHotelLocators;


public class SearchHotelPageExecution extends LoginPageExecution{

	public static void location() {
		String locationval =BaseClass.excelReader(1,0); 
		BaseClass.dropDown(new SearchHotelLocators().getLocation(),locationval);
		}
		
		public static void hotels() {
			String hotelsval =BaseClass.excelReader(1,1);
			BaseClass.dropDown(new SearchHotelLocators().getHotels(),hotelsval);
			}
		
		public static void room_type() {
			String room_typeval =BaseClass.excelReader(1,2);
			BaseClass.dropDown(new SearchHotelLocators().getRoom_type(),room_typeval);
			}
		
		public static void room_nos() {
			String room_nosval =BaseClass.excelReader(1,3);
			BaseClass.dropDown(new SearchHotelLocators().getRoom_nos(),room_nosval);
			}
		
		public static void datepick_in() {
	    	String datepick_inval =BaseClass.excelReader(1,4);
			BaseClass.sendValues(new SearchHotelLocators().getDatepick_in(),datepick_inval);
			}
		
		public static void datepick_out() {
			String datepick_outval =BaseClass.excelReader(1,5);
			BaseClass.sendValues(new SearchHotelLocators().getDatepick_out(),datepick_outval);		
			}
		
		public static void adult_room() {
			String adult_roomval =BaseClass.excelReader(1,6);
			BaseClass.dropDown(new SearchHotelLocators().getAdult_room(),adult_roomval);	
			}
		
		public static void child_room() {
			String child_roomval =BaseClass.excelReader(1,7);
			BaseClass.dropDown(new SearchHotelLocators().getChild_room(),child_roomval);			
			}
		
		public static void submit() {
			BaseClass.click_value(new SearchHotelLocators().getSubmit());
			}
}