package com.ETCSWEB.qa.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	
	public  WebDriver driver;  
	public static Properties prop;
	
	public TestBase() {
	try	{
		prop = new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\c-sudhir.kumar\\eclipse-workspace\\ETCSWEB\\src"+
		"\\main\\java\\com\\ETCSWEB\\qa\\config\\config.properties");
		prop.load(fis);
		}
	catch(Exception e){
		System.out.println("File not Found");
	}	

}
	public  void initlization() {
		String browser= prop.getProperty("browser");
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\java\\Driver\\New Driver\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);	
	}
}