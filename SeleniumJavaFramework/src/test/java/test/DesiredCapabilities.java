package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DesiredCapabilities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("Webdriver.ie.driver", "C:\\Users\\vigne\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\iedriver\\IEDriverServer.exe");
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings",true);
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("ABCD"); 
		driver.findElement(By.id("sb_form_go")).click();
		driver.close();
		driver.quit();
		
		
	}

	private void setCapability(String string, boolean b) {
		// TODO Auto-generated method stub
		
	}

	

}
