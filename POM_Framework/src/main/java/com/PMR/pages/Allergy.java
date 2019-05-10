package com.PMR.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.PMR.base.TestBase;

public class Allergy extends TestBase {
	
	@FindBy(xpath="//*[text()='Allergy']")
	WebElement allergy;
	
	@FindBy(xpath="(//*[text()='Add New'])[2]")
	WebElement addnew;
	
	@FindBy(xpath="//*[@id='allergyId']")
	WebElement id;
	
	@FindBy(xpath="(//*[text()='Abdominal Pain'])[1]")
	WebElement reaction;
	
	@FindBy(xpath="(//*[@name='severity'])[1]")
	WebElement severity;
	
	@FindBy(xpath="(//*[@name='description'])[1]")
	WebElement description;
	
	@FindBy(xpath="(//*[text()='SAVE'])[4]")
	WebElement save;
	
	public Allergy() {
		PageFactory.initElements(driver, this);
	}
	
	public void addAllergy() throws InterruptedException {
		allergy.click();
		Thread.sleep(3000);
		addnew.click();
		Thread.sleep(3000);
		id.sendKeys("a");
		
		driver.findElement(By.xpath("//*[text()='1,3-diphenylgu']")).click();
		 
	
		
		reaction.click();
		
		Select oSelect1 = new Select(driver.findElement(By.xpath("(//*[@name='outcomeId'])[1]")));
		 
		oSelect1.selectByVisibleText("Improved");
		
		severity.sendKeys("High");
		
		description.sendKeys("No");
		
		save.click();
		
		
	}
	
	
	
	
	
	
	
	

}
