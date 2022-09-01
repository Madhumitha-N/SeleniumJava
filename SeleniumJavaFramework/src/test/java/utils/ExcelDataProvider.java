package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import config.PropertiesFile;

public class ExcelDataProvider {
	WebDriver driver=null;
	@BeforeTest
	public void setUpTest() {

		driver=new FirefoxDriver();

	}
	@Test(dataProvider="test1data")
	public void test1(String userName,String password) throws InterruptedException 
	{
		System.out.println(userName+" "+password);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("(//input[@name='username'])[1]")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(2000);
	}

	@ DataProvider(name="test1data")
	public static  Object[][] getData()
	{

		Object data[][]=testData("C:\\Users\\vigne\\eclipse-workspace\\SeleniumJavaFramework\\excel\\data.xlsx","Sheet1");
		return data;
	}
	public static Object[][] testData(String excelPath,String sheetName)
	{
		ExcelUtils excel=new ExcelUtils(excelPath,sheetName);
		int  rowCount=excel.getRowCount();
		int colCount=excel.getColCount();
		Object data[][]=new Object[rowCount-1][colCount];
		for(int i=1;i<rowCount;i++)
		{
			for(int j=0;j<colCount;j++)
			{
				String celldata=excel.getCellDataString(i, j);
				//System.out.println(celldata);
				data[i-1][j]=celldata;
			}
		}
		return data;
	}



}
