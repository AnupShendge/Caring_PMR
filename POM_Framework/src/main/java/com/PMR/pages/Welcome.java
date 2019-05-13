package com.PMR.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PMR.base.TestBase;

public class Welcome extends TestBase {
	
	@FindBy(xpath="//*[contains(text(),'Patients')]")
	WebElement patients;
	
	@FindBy(xpath="//*[text()='Prescribers']")
	WebElement prescriber;
	
	@FindBy(xpath="//*[text()='Reminders']")
	WebElement reminders;
	
	public Welcome() {
		PageFactory.initElements(driver, this);
	}
	
	
	public AddPatient ClickOnPatients(){
		patients.click();
		return new AddPatient();
	}
	
	
	public AddPrescribers ClickOnPrescriber() {
		prescriber.click();
		return new AddPrescribers();
		
	}
	
	public Reminders ClickOnReminders() {
		reminders.click();
		return new Reminders();
		
		
	}

}
