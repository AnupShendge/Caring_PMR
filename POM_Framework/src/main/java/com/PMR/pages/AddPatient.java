package com.PMR.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.PMR.base.TestBase;

public class AddPatient extends TestBase {
	
	@FindBy(xpath="//*[contains(text(),'ADD PATIENT')]")
	static
	WebElement addnewuser;
	
	@FindBy(xpath="//*[@name='mobile']")
	static
	WebElement mobile;
	
	@FindBy(xpath="//*[@name='first_name']")
	static WebElement fullname;
	
	@FindBy(xpath="//*[contains(text(),'Male')]")
	 static WebElement gender;
	
	@FindBy(xpath="//*[@name='passport_number']")
	static WebElement pn;
	
	@FindBy(xpath="//*[@type='submit']")
	static WebElement add;
	
	public AddPatient() {
		PageFactory.initElements(driver, this);
	}
	
	
	public static void AP() throws InterruptedException {
		addnewuser.click();
		Thread.sleep(2000);
		Select oSelect = new Select(driver.findElement(By.name("countryId")));
		oSelect.selectByVisibleText("+62");
		Select oSelect1 = new Select(driver.findElement(By.name("bloodgroupId")));
		oSelect1.selectByVisibleText("O+");
		mobile.sendKeys("9876543247");
		fullname.sendKeys("Santosh");
		gender.click();
		pn.sendKeys("9876543247");
		add.click();
	}
	
	public HealthRecords addpatient() throws InterruptedException {
		AddPatient.AP();
		return new HealthRecords();
	}
	
	public Allergy addPatient1() throws InterruptedException {
		AddPatient.AP();
		return new Allergy();
		
	}
	
	public MedicalCondition addPatient2() throws InterruptedException {
		AddPatient.AP();
		return new MedicalCondition();

	}
	
	public Notes addPatient3() throws InterruptedException {
		AddPatient.AP();
		return new Notes();
	}
	
	

}
