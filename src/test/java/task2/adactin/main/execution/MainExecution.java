package task2.adactin.main.execution;

import org.junit.Test;
import task2.adactin.page.execution.BookingPageExecution;

public class MainExecution extends BookingPageExecution{

	@Test
	public void test() throws  InterruptedException{
		weblaunch("https://adactinhotelapp.com/");
		username();
		password();
		login_button();
		location();
		hotels();
		room_type();
		room_nos();
		datepick_in();
		datepick_out();
		adult_room();
		child_room(); 
		submit();
		radiobutton_0();
		continue1();
		firstname();
		lastname();
		address();
		cc_num();
		cc_type();
		cc_exp_month();
		cc_exp_year();
		cc_cvv();
		book_now();
		Thread.sleep(10000);
		bookid();
	}
}