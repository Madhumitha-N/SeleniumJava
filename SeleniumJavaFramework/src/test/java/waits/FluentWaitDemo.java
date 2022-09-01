package waits;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {
	public static void main(String[] args) throws InterruptedException {
		test();
	}
	
	public  static void test() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).sendKeys(Keys.RETURN);	
		//driver.findElement(By.name("Action for Boston Community Development: ABCD Homepage")).click();
		
		
			   // Waiting 30 seconds for an element to be present on the page, checking
			   // for its presence once every 5 seconds.
			   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(30L))
			       .pollingEvery(Duration.ofSeconds(2L))
			       .ignoring(NoSuchElementException.class);

			   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			       WebElement linkElement= driver.findElement(By.name("Action for Boston Community Development: ABCD Homepage"));
			       if(linkElement.isEnabled())
			       {
			    	   System.out.println("Element found");
			    	   
			       }
			       return linkElement;
			     }
			   });
			 
			  element.click()
;		Thread.sleep(3000);
		driver.close();
		driver.quit();
		
		
	}

}
