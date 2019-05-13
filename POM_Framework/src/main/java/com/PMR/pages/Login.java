package com.PMR.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PMR.Library.ExcelDataConfig;
import com.PMR.base.TestBase;

public class Login extends TestBase {
	
	@FindBy(xpath="(//*[text()='Login'])[1]")
	WebElement login;
	
	@FindBy(xpath="//*[@name='username']")
	WebElement username;
	
	@FindBy(xpath="//*[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//*[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath="//*[contains(text(),'Welcome, Anup')]")
	WebElement element;
	
	
	
	
	
	public Login() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public String WelcomePageTitle() {
		
		return element.getText();
	}
	
	
	
	public Welcome ClickLogin(String un, String pwd) throws InterruptedException {
		login.click();
		Thread.sleep(3000);
		
		ExcelDataConfig excel = new ExcelDataConfig("C:\\Users\\Anup\\git\\Caring_PMR\\POM_Framework\\data\\PMR Login (1).xlsx");
		un = excel.getData(0, 1, 0);
	 	pwd=excel.getData(0, 1, 1);
	 	
	 	username.sendKeys(un);
	 	password.sendKeys(pwd);
	 	
		submit.click();
		return new Welcome();
		
	}

	
	
	
	
	
	
	
	
	

}
