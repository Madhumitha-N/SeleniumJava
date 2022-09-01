package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNG2 {
	WebDriver driver=null;
    
    @BeforeTest 
	public void setUpTest() {
		driver=new FirefoxDriver();
	}
	
    @Test
	public void GoogleSearch2() {
		   driver.get("https://google.com");
		
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");
			//press enter to search 
			//driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).sendKeys(Keys.ENTER);		
		
	}
    @Test
    public void GoogleSearch3() {
		   driver.get("https://google.com");
		
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys("course");
			//press enter to search 
			//driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).sendKeys(Keys.ENTER);		
		
	}
	
	@AfterTest
	public void tearDownTest() throws InterruptedException {
		Thread.sleep(7000);
		//driver.close(); //close() closes only the present window
		driver.quit();	//quit closes entire tab
		System.out.println("Success");
	}
	
}
