package Reusablecomponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverHelper {


	
	//This is base for all classes
	//This will choose browser
	public static WebDriver driver;
	public Properties prop;
	public WebDriver intializeDriver() throws IOException
	{
		
		prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\config.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		
		//chrome
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		//firefox
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"P:/Selenium/cucumber_programs/AtlanticCucumber/Drivers/chromedriver.exe");
			driver = new FirefoxDriver();
		}
		//edge
		else if(browserName.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver",
					"P:/Selenium/cucumber_programs/AtlanticCucumber/Drivers/chromedriver.exe");
			
			driver=new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
		
		return driver;
		
	}

	



}
