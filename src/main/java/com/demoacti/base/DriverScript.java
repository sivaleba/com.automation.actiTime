package com.demoacti.base;
import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*

 */
public class DriverScript {

	public static WebDriver driver;
	Properties prop;

	public DriverScript() 
	{                          
		try{                        
			File file= new File("./acconfig/config.properties");  
			FileInputStream fis= new FileInputStream(file);
			prop= new Properties();
			prop.load(fis);

		}catch(Exception e) {

			System.out.println("Unable to load properties file : "+e.getMessage());
		}
	}

	public void getURL() {
		String url=prop.getProperty("url");
		driver.get(url);
	}

	public void launchbrowser() {

		String browser= prop.getProperty("browser");

		if(browser.trim().equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\jay_l\\eclipse-workspace\\com.demoacti\\acbrowsers\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.trim().equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.driver","C:\\Users\\jay_l\\eclipse-workspace\\com.demoacti\\acbrowsers\\geckodriver.exe");
			driver= new FirefoxDriver();
		}else if(browser.trim().equalsIgnoreCase("edge")){
			System.setProperty("webdriver.edge.driver","C:\\Users\\jay_l\\eclipse-workspace\\com.demoacti\\acbrowsers\\msedgedriver.exe");
			driver= new EdgeDriver();
		}
		else {
			System.err.println("Browser name provided is not supported.Please check config File");
		}
		getURL();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		//quitDriver();
	}

	public void quitDriver() {
		driver.close();
	}

}
	
	
	
	
	
	

