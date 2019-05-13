package com.PMR.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PMR.base.TestBase;

public class AddPrescribers extends TestBase {

	@FindBy(xpath = "//*[text()='ADD prescriber']")
	WebElement addprescriber;

	@FindBy(xpath = "//*[@ng-reflect-name='PrescriberName']")
	WebElement PrescriberName;

	@FindBy(xpath = "//*[@formcontrolname='RegistrationNumber']")
	WebElement RegistrationNumber;

	@FindBy(xpath = "//*[@formcontrolname='Contact']")
	WebElement Contact;

	@FindBy(xpath = "//*[@formcontrolname='Clinic']")
	WebElement Clinic;

	@FindBy(xpath = "//*[@type='submit']")
	WebElement Save;

	public AddPrescribers() {
		PageFactory.initElements(driver, this);
	}

	public void ClickOnAddPrescriber() throws InterruptedException {
		addprescriber.click();
		Thread.sleep(3000);
		PrescriberName.sendKeys("Sharath");
		RegistrationNumber.sendKeys("123");
		Contact.sendKeys("987654321");
		Clinic.sendKeys("Good");
		Thread.sleep(8000);
		Save.click();

	}

}
