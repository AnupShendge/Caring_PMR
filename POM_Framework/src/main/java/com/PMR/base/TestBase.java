package com.PMR.base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
public static WebDriver driver;

	public static  void initialise() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anup\\workspace\\Selenium\\POM_Framework\\driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://caringpmr.spurtreetech.com/#/");
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		
	}
	
	public static void teardown() {
		
		driver.quit();
	}

}


