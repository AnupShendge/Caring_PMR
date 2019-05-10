package com.PMR.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.PMR.base.TestBase;

public class AddPatient extends TestBase {
	
	@FindBy(xpath="//*[contains(text(),'Patients')]")
	WebElement patients;
	
	@FindBy(xpath="//*[contains(text(),'ADD PATIENT')]")
	WebElement addnewuser;
	
	@FindBy(xpath="//*[@name='mobile']")
	WebElement mobile;
	
	@FindBy(xpath="//*[@name='first_name']")
	WebElement fullname;
	
	@FindBy(xpath="//*[contains(text(),'Male')]")
	WebElement gender;
	
	@FindBy(xpath="//*[@name='passport_number']")
	WebElement pn;
	
	@FindBy(xpath="//*[@type='submit']")
	WebElement add;
	
	
	
	
	
	public AddPatient() {
		PageFactory.initElements(driver, this);
	}
	
	
	public HealthRecords addpatient() throws InterruptedException {
		patients.click();
		Thread.sleep(2000);
		addnewuser.click();
		Thread.sleep(2000);
		Select oSelect = new Select(driver.findElement(By.name("countryId")));
		 
		oSelect.selectByVisibleText("93");
		
		Select oSelect1 = new Select(driver.findElement(By.name("bloodgroupId")));
		 
		oSelect1.selectByVisibleText("O+");
		
		mobile.sendKeys("9876543235");
		fullname.sendKeys("girish");
		gender.click();
		pn.sendKeys("9876543235");
		add.click();
		return new HealthRecords();
	}
	
	

}
