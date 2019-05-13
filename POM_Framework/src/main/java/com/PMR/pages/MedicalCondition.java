package com.PMR.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PMR.base.TestBase;

public class MedicalCondition extends TestBase {

	@FindBy(xpath = "//*[text()='Medical Condition']")
	WebElement medicalcondition;

	@FindBy(xpath = "(//*[text()='Add New'])[3]")
	WebElement addnew;

	@FindBy(xpath = "//*[@id='conditionVal']")
	WebElement condition;

	@FindBy(xpath = "//*[@id='remarksVal']")
	WebElement remarks;

	@FindBy(xpath = "//*[@id='commentsVal']")
	WebElement comments;

	@FindBy(xpath = "(//*[text()='SAVE'])[4]")
	WebElement save;

	public MedicalCondition() {

		PageFactory.initElements(driver, this);
	}

	public void addMedicalCondition() throws InterruptedException {

		medicalcondition.click();
		addnew.click();
		condition.sendKeys("Good");
		Thread.sleep(2000);
		remarks.sendKeys("No");
		Thread.sleep(2000);
		comments.sendKeys("No comments");
		Thread.sleep(5000);
		save.click();
	}

}
