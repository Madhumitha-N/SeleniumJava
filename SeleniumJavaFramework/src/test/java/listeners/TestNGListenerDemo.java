package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.util.*;
import java.util.concurrent.TimeUnit;



public class TestNGListenerDemo {
	@Test
	public void test1()
	{
		System.out.println("I am inside Test 1");
	}
	@Test
	public void test2()
	{
		System.out.println("I am inside Test 2");
		//org.testng.Assert.assertTrue(false);
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.close();
		
	}
	@Test
	public void test3()
	{
		System.out.println("I am inside Test 3");
		throw new SkipException("This test is skipped");
	}
}
