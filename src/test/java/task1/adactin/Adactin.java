package task1.adactin;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	import java.text.SimpleDateFormat;
	import java.util.Date;
	import java.util.Properties;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.DateUtil;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	
	public class Adactin {

				public static WebDriver driver;
				
				public static void weblaunch(String URL) {
				 driver = new ChromeDriver();
				 driver.manage().window().maximize();
				 driver.get(URL);
				}
				
				public static String propertiesRead(String data) {
					String value = null;
					 try {
						File file = new File ("C:\\Users\\SUWATHI JAMES\\eclipse-workspace\\new\\ProjectTask\\Config.properties");
						FileReader filereader = new FileReader(file);
						Properties properties = new Properties();
						properties.load(filereader);
						value=properties.getProperty(data);
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}
					return value;
				}

			    public static String excelReader(String sheetName, int i, int j) {
					String value = null;

			    	try {
			        	File file = new File ("C:\\Users\\SUWATHI JAMES\\Documents\\AUTOMATION TESTER\\TASK\\Project\\Adactin Task1\\Adactin.xlsx");
						FileInputStream fileinputstream = new FileInputStream(file);
						Workbook wb= new XSSFWorkbook(fileinputstream);
						Sheet sheet = wb.getSheet(sheetName);
						Row row= sheet.getRow(i);
						Cell cell = row.getCell(j);
						int cellType = cell.getCellType();
						
						if (cellType==1) {
							value=cell.getStringCellValue();
							}else if (cellType==0) {
								if(DateUtil.isCellDateFormatted(cell)) {
									Date datecellvalue = cell.getDateCellValue();
									SimpleDateFormat format = new SimpleDateFormat("dd/MM/YYYY");
									value = format.format(datecellvalue);
								}
							}
							else {
								double numericCellValue= cell.getNumericCellValue();
								long l= (long)numericCellValue;
								value= String.valueOf(l);
							}
			    
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}
					return value;
			 
			    }
			    public static void sendValues(WebElement element, String value) {
			    	element.sendKeys(value);
			    }
			    
			    public static void dropDown(WebElement element, String value) {
			    	Select slc= new Select(element);
			    	slc.selectByVisibleText(value);
			    }
			    
			    public static void main(String[] args) throws InterruptedException{
			    	weblaunch (propertiesRead ("URL"));
			    	
			    	WebElement userName= driver.findElement(By.id("username"));
			       	sendValues(userName,propertiesRead("confuserName"));
			    	
			    	WebElement password= driver.findElement(By.id("password"));
			    	sendValues(password,propertiesRead("confpassword"));
			    	
			    	driver.findElement(By.id("login")).click();
			    	
			    	WebElement location= driver.findElement(By.id("location"));
			       	String locationval= excelReader("sheetName",1,0);
			    	dropDown(location,locationval);
			    	
			    	WebElement hotels= driver.findElement(By.name("hotels"));
			    	String hotelsval= excelReader("sheetName",1,1);
			    	dropDown(hotels,hotelsval);
			    	
			    	WebElement roomType= driver.findElement(By.id("room_type"));
			    	String roomTypeval= excelReader("sheetName",1,2);
			    	dropDown(roomType,roomTypeval);
			    	
			    	WebElement noofRooms= driver.findElement(By.id("room_nos"));
			    	String noofRoomsval= excelReader("sheetName",1,3);
			    	dropDown(noofRooms,noofRoomsval);
			    	
			    	
			    	WebElement checkin= driver.findElement(By.id("datepick_in"));
			    	checkin.clear();
			    	String checkinval= excelReader("sheetName",1,4);
			    	sendValues(checkin,checkinval);

	                
			    	WebElement checkout= driver.findElement(By.id("datepick_out"));
			    	checkout.clear();
			    	String checkoutval= excelReader("sheetName",1,5);
			    	sendValues(checkout,checkoutval);
			    	
			    	WebElement Adults= driver.findElement(By.id("adult_room"));
			      	String Adultsval= excelReader("sheetName",1,6);
			    	dropDown(Adults,Adultsval);
			    	
			    	WebElement Children= driver.findElement(By.id("child_room"));
			    	String Childrenval= excelReader("sheetName",1,7);
			    	dropDown(Children,Childrenval);
			    	
			    	WebElement search= driver.findElement(By.id("Submit"));
			    	search.click();
			    	
			    	WebElement select= driver.findElement(By.id("radiobutton_0"));
			    	select.click();
			    	
			    	WebElement Continue=driver.findElement(By.id("continue"));
			    	Continue.click();
			    	
			    	WebElement FirstName=driver.findElement(By.id("first_name"));
			    	String FirstNameval = excelReader("sheetName",1,8);
			    	sendValues(FirstName,FirstNameval);
			    	
			    	WebElement LastName=driver.findElement(By.id("last_name"));
			    	String LastNameval = excelReader("sheetName",1,9);
			    	sendValues(LastName,LastNameval);
			    	
			    	WebElement BillingAddress=driver.findElement(By.id("address"));
			    	String billingAddressval=excelReader("sheetName",1,10);
			    	sendValues(BillingAddress,billingAddressval);
			    	
			        WebElement CreditCard = driver.findElement(By.id("cc_num"));
			        String CreditCardval=excelReader("sheetName",1,11);
			        sendValues(CreditCard,CreditCardval); 
			    	
			    	WebElement CreditCardtype = driver.findElement(By.id("cc_type"));
			        String CreditCardvaltype=excelReader("sheetName",1,12);
			    	dropDown(CreditCardtype,CreditCardvaltype);
			    	
			    	WebElement ExpMonth = driver.findElement(By.id("cc_exp_month"));
			    	String ExpMonthval = excelReader("sheetName",1,13);
			    	dropDown(ExpMonth,ExpMonthval);
			    	
			    	WebElement ExpYear = driver.findElement(By.id("cc_exp_year"));
			    	String ExpYearval = excelReader("sheetName",1,14);
			    	dropDown(ExpYear,ExpYearval);
			    	
			    	WebElement CVVNumber = driver.findElement(By.id("cc_cvv"));
			    	String CVVNumberval = excelReader("sheetName",1,15);
			    	sendValues(CVVNumber,CVVNumberval);
			    	
			    	driver.findElement( By.id("book_now")).click();	
			    	Thread.sleep(10000);
			    	
			    	WebElement orderno=driver.findElement(By.name("order_no"));
			        String ordernoval = orderno.getAttribute("value");
			        System.out.println("Your Booking ID:"+ordernoval);
			    }
			}