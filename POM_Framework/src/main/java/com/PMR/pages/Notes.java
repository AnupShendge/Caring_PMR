package com.PMR.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PMR.base.TestBase;

public class Notes extends TestBase {

	@FindBy(xpath = "//*[text()='Notes']")
	WebElement notes;

	@FindBy(xpath = "(//*[text()='Add New'])[4]")
	WebElement addnew;

	@FindBy(xpath = "(//*[@id='usr'])[2]")
	WebElement title;

	@FindBy(xpath = "(//*[@id='comment'])[2]")
	WebElement comment;

	@FindBy(xpath = "(//*[text()='SAVE'])[5]")
	WebElement save;

	public Notes() {

		PageFactory.initElements(driver, this);
	}

	public void addNotes() throws InterruptedException {
		notes.click();
		addnew.click();
		title.sendKeys("Good");
		Thread.sleep(3000);
		comment.sendKeys("bad");
		Thread.sleep(3000);
		save.click();

	}

}
