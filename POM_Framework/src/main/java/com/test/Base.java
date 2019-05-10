package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver = null;
	public static void main(String[] args) {
			
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anup\\workspace\\Selenium\\POM_Framework\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.facebook.com");
	}
	}


