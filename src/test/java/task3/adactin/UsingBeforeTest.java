package task3.adactin;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingBeforeTest {
	static WebDriver driver =null;
@BeforeTest
public static void browser() {
	WebDriverManager.edgedriver().setup();
	driver = new EdgeDriver();
    driver.manage().window().maximize();
	driver.get("https://adactinhotelapp.com/");
}

@Parameters({"username","password"})
@Test
public static void possibility1(String username,String Password) {
	WebElement u1 = driver.findElement(By.id("username"));
	u1.sendKeys(username);
	WebElement p1 = driver.findElement(By.id("password"));
	p1.sendKeys(Password);
	WebElement l1= driver.findElement(By.id("login"));
    l1.click();
}

@Parameters({"username1","password1"})
@Test
public static void possibility2 (String username1,String Password1) {
	WebElement u2 = driver.findElement(By.id("username"));
	u2.sendKeys(username1);
	WebElement p2 = driver.findElement(By.id("password"));
	p2.sendKeys(Password1);
	WebElement l2= driver.findElement(By.id("login"));
l2.click();
}

@Parameters({"username2","password2"})
@Test
public static void possibility3 (String username2,String Password2) {
	WebElement u3 = driver.findElement(By.id("username"));
	u3.sendKeys(username2);
	WebElement p3 = driver.findElement(By.id("password"));
	p3.sendKeys(Password2);
	WebElement l3= driver.findElement(By.id("login"));
    l3.click();
}

@Parameters({"username3","password3"})
@Test
public static void possibility4(String username3,String Password3) throws IOException {
	WebElement u4 = driver.findElement(By.id("username"));
	u4.sendKeys(username3);
	WebElement p4 = driver.findElement(By.id("password"));
	p4.sendKeys(Password3);
	WebElement l4= driver.findElement(By.id("login"));
    l4.click();
    TakesScreenshot ts = (TakesScreenshot) driver;
	File webpage = ts.getScreenshotAs(OutputType.FILE);
	File in_eclipse = new File("C:\\Users\\SUWATHI JAMES\\eclipse-workspace\\new\\ProjectTask\\Screenshot\\output.jpeg");
    FileHandler.copy(webpage,in_eclipse);
} 

@AfterTest
public static void quit()  {
    driver.close();
  }
}