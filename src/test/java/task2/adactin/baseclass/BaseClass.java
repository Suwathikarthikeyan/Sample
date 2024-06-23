package task2.adactin.baseclass;

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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class BaseClass {

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
	public static String excelReader(int i, int j) {
		String value = null;

    	try {
        	File file = new File ("C:\\Users\\SUWATHI JAMES\\Documents\\AUTOMATION TESTER\\TASK\\Project\\Adactin Task1\\Adactin.xlsx");
			FileInputStream fileinputstream = new FileInputStream(file);
			Workbook wb= new XSSFWorkbook(fileinputstream);
			Sheet sheet = wb.getSheet("SheetName");
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
    	element.clear();
    	element.sendKeys(value);
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
}