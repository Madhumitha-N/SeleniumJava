package multibrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultiBrowserDemo {
	WebDriver driver=null;
	@Parameters("browserName")
	@BeforeTest
	
	public void setup(String browserName)
	{
		if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
	}
	@Test
	public void test1() throws InterruptedException
	{
		
		driver.get("https://google.com");
		Thread.sleep(4000);
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
		System.out.println("Test completed successsfully");
	}
	
}
