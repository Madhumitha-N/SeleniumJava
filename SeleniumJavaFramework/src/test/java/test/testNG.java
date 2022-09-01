package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;

public class testNG {
	WebDriver driver=null;
     public static  String browserName=null;
    @BeforeTest 
	public void setUpTest() {
    	PropertiesFile.getProperties();
    	if(browserName.equalsIgnoreCase("firefox"))
    	{
    		driver=new FirefoxDriver();
    	}
		
	}
	
    @Test
	public void GoogleSearch() {
		   driver.get("https://google.com");
		
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");
			//press enter to search 
			driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).sendKeys(Keys.ENTER);		
		
	}
	
	@AfterTest
	public void tearDownTest() throws InterruptedException {
		Thread.sleep(5000);
		//driver.close(); //close() closes only the present window
		//driver.quit();	//quit closes entire tab
		System.out.println("Success");
	}
	
}
