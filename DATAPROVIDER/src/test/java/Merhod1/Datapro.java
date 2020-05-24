package Merhod1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datapro {

	@Test(dataProvider="getData")
	
	public void setData(String username, String Password) {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\All Selenium Workspace\\Think-App\\ThinkAppProjectV1\\src\\test\\resources\\executables\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://trimitiy.com/shubhavishva/");
		driver.findElement(By.xpath("//*[@id=\"myHeader\"]/div/div/div/div[2]/nav/ul/li[1]/a")).click();
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(Password);
	}
	
	
	@DataProvider
	
	public Object[][] getData(){
		Object[][] data= new Object[3][2];
		data[0][0]="shivb";
		data[0][1]="21335";
		
		data[1][0]="monu";
		data[1][1]="p5566";
		
		data[2][0]="sonu";
		data[2][1]="pass56565rd";
		return data;
	}
}
