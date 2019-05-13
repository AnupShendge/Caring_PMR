package com.PMR.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PMR.base.TestBase;

public class Reminders extends TestBase {

	@FindBy(xpath = "//*[@type='search']")
	WebElement search;

	public Reminders() {
		PageFactory.initElements(driver, this);
	}

	public void SearchPatient() {
		search.sendKeys("Santosh");
	}

}
