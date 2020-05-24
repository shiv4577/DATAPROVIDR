package Method3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test3 {

	WebDriver driver;
	
	@BeforeMethod
	
	public void setup() {
System.setProperty("webdriver.chrome.driver", "E:\\All Selenium Workspace\\Think-App\\ThinkAppProjectV1\\src\\test\\resources\\executables\\chromedriver.exe");
		
		 driver= new ChromeDriver();
		
		driver.get("https://trimitiy.com/shubhavishva/");
	}
	
	@DataProvider
	
	public void getLogindata() {
		
	}
	
	
	
	@Test
	
	public void loginTest(String name , String mail, String contact) {
		driver.findElement(By.name("name")).sendKeys(name);
		driver.findElement(By.name("email")).sendKeys(mail);
		driver.findElement(By.name("mobile")).sendKeys(contact);
		
	}
	
	
	
	
	@AfterMethod
	
	public void teardown() {
		driver.quit();
	}
}
