package com.PMR.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PMR.base.TestBase;

public class HealthRecords extends TestBase{
	
	@FindBy(xpath="(//*[contains(@class,'btn btn-default editHealthRec')])[1]")
	WebElement add;
	
	@FindBy(xpath="(//*[@type='number'])[1]")
	WebElement height;
	
	@FindBy(xpath="(//*[@type='number'])[2]")
	WebElement weight;
	
	@FindBy(xpath="(//*[@type='number'])[3]")
	WebElement bp;
	
	@FindBy(xpath="(//*[@type='number'])[4]")
	WebElement pulse;
	
	@FindBy(xpath="(//*[@type='number'])[5]")
	WebElement uric;
	
	@FindBy(xpath="(//*[@type='number'])[6]")
	WebElement body;
	
	@FindBy(xpath="(//*[@type='number'])[7]")
	WebElement waist;
	
	@FindBy(xpath="(//*[@type='number'])[8]")
	WebElement peak;
	
	@FindBy(xpath="(//*[@type='number'])[9]")
	WebElement fbs;
	
	@FindBy(xpath="(//*[@type='number'])[10]")
	WebElement rbs;
	
	@FindBy(xpath="(//*[@type='number'])[11]")
	WebElement hba;
	
	@FindBy(xpath="(//*[@type='number'])[12]")
	WebElement cholestrol;
	
	@FindBy(xpath="(//*[@type='number'])[13]")
	WebElement hdl;
	
	@FindBy(xpath="(//*[@type='number'])[14]")
	WebElement trigly;
	
	@FindBy(xpath="(//*[@type='number'])[15]")
	WebElement ldl;
	
	@FindBy(xpath="(//*[@type='submit'])[1]")
	WebElement submit;
	
	@FindBy(xpath="//*[contains(text(),'VIEW ALL')]")
	WebElement view;
	
	@FindBy(xpath="(//*[@type='button'])[9]")
	WebElement close;
	
	@FindBy(xpath="//*[contains(text(),'EDIT')]")
	WebElement edit;
	
	@FindBy(xpath="//*[text()='UPDATE']")
	WebElement update;
	
	@FindBy(xpath="(//*[@class='checkmark labeldesign1'])[2]")
	WebElement checkbox;
	
	@FindBy(xpath="(//*[text()='DELETE'])[3]")
	WebElement delete;
	
	@FindBy(xpath="//*[text()='YES']")
	WebElement yes;
	
	
	public HealthRecords() {
		PageFactory.initElements(driver, this);
	}
	
	/*public void add() throws InterruptedException {
		add.click();
		Thread.sleep(300);
		height.sendKeys("1");
		weight.sendKeys("2");
		bp.sendKeys("3");
		pulse.sendKeys("4");
		uric.sendKeys("5");
		body.sendKeys("6");
		waist.sendKeys("7");
		peak.sendKeys("8");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		fbs.sendKeys("9");
		rbs.sendKeys("10");
		hba.sendKeys("11");
		cholestrol.sendKeys("12");
		hdl.sendKeys("13");
		trigly.sendKeys("14");
		ldl.sendKeys("15");
		js.executeScript("window.scrollBy(0,-1000)");
		submit.click();
		view.click();
		Thread.sleep(3000);
		close.click();
		Thread.sleep(3000);
		edit.click();
		weight.clear();
		weight.sendKeys("22");
		pulse.clear();
		pulse.sendKeys("85");
		update.click();
		Thread.sleep(3000);
		view.click();
		Thread.sleep(4000);
		checkbox.click();
		delete.click();
		yes.click();
		Thread.sleep(4000);
		close.click();
		
		
	}*/
	
	public void add() throws InterruptedException {
		add.click();
		Thread.sleep(300);
		height.sendKeys("1");
		weight.sendKeys("2");
		bp.sendKeys("3");
		pulse.sendKeys("4");
		uric.sendKeys("5");
		body.sendKeys("6");
		waist.sendKeys("7");
		peak.sendKeys("8");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		fbs.sendKeys("9");
		rbs.sendKeys("10");
		hba.sendKeys("11");
		cholestrol.sendKeys("12");
		hdl.sendKeys("13");
		trigly.sendKeys("14");
		ldl.sendKeys("15");
		js.executeScript("window.scrollBy(0,-1000)");
		submit.click();
		view.click();
		Thread.sleep(3000);
		close.click();
	}
	
	public void update() throws InterruptedException {
		Thread.sleep(3000);
		edit.click();
		Thread.sleep(5000);
		weight.clear();
		weight.sendKeys("22");
		pulse.clear();
		pulse.sendKeys("85");
		update.click();
	}
	
	public void delete() throws InterruptedException {
		Thread.sleep(5000);
		view.click();
		Thread.sleep(4000);
		checkbox.click();
		delete.click();
		yes.click();
		Thread.sleep(4000);
		close.click();
	}
	
	

}
