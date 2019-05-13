package com.PMR.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PMR.base.TestBase;

public class AddPrescribers extends TestBase{
	
	@FindBy(xpath="//*[text()='ADD prescriber']")
	WebElement addprescriber;
	
	public AddPrescribers() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void ClickOnAddPrescriber() {
		addprescriber.click();
	}

}
