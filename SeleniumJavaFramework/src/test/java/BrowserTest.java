import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\vigne\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		 //driver.get("http://seleniumhq.org./");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\vigne\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\chromedriver\\chromedriver.exe");
		// WebDriver driver=new FirefoxDriver();
		 driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("abcd");
	}

}
