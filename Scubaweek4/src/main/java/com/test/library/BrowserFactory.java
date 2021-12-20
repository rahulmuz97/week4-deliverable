package com.test.library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver StartBrowser (String browserName,String URL) {
	
		if(browserName.equals("chrome"))
			{
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
	}
		if(browserName.equals("firefox"))
	{
     WebDriverManager.firefoxdriver().setup();
     driver= new FirefoxDriver();
     }
		if(browserName.equals("microsoftedge"))
		{
	WebDriverManager.edgedriver().setup();
	 driver= new EdgeDriver();
}
		driver.manage().window().maximize();
		driver.get(URL);
		return driver;
}}
