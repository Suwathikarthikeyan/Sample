package task4.adactin.baseclass.cucumber;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class BaseClass {
		
	public static WebDriver driver;

	public static void browserLaunch() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		}

	public static void Url(String Url) {
		driver.get(Url);
	   }

	public static void getattribute(WebElement element,String value) {
		String ID=element.getAttribute(value);
		System.out.println("Your Booking ID"+ID);
	}

	public static void dropDown(WebElement element, String value) {
		Select slc= new Select(element);
		slc.selectByVisibleText(value);
	}

	public static void click_value(WebElement element) {
		element.click();
	}   

	public static void close() {
		driver.close();
	}
	
}
