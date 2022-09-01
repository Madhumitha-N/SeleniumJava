package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.testNG;

public class PropertiesFile {
	
	  static Properties prop=new Properties();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getProperties();
		//setProperties();
		//getProperties();

	}
	public static void getProperties() 
	{
		try 
		{
			
			InputStream input=new FileInputStream ("C:\\Users\\vigne\\eclipse-workspace\\SeleniumJavaFramework\\src\\test\\java\\config\\config.properties");
			prop.load(input);
			String  browser=prop.getProperty("browserName");
			System.out.println(browser);
			testNG.browserName=browser;
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
	public static void setProperties() 
	{
		try 
		{
			
			OutputStream output=new  FileOutputStream("C:\\Users\\vigne\\eclipse-workspace\\SeleniumJavaFramework\\src\\test\\java\\config\\config.properties");
			prop.setProperty("browser", "chrome");
			prop.store(output, null);
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}

}
