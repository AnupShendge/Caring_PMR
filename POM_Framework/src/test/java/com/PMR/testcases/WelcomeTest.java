package com.PMR.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.PMR.base.TestBase;
import com.PMR.pages.AddPatient;
import com.PMR.pages.AddPrescribers;
import com.PMR.pages.Login;
import com.PMR.pages.Reminders;
import com.PMR.pages.Welcome;

public class WelcomeTest extends TestBase {
	Login lg;
	Welcome wc;
	
	
	
	
	
	
	
	@BeforeTest
	public void setup() throws IOException, InterruptedException {
		initialise();
		lg = new Login();
	}
	
	
	@Test
	public void Patients() {
		AddPatient ap = wc.ClickOnPatients();
		}
	
	@Test
	public void Prescriber() {
		AddPrescribers pc = wc.ClickOnPrescriber();
	}
	
	@Test
	public void Reminder() {
		Reminders rm = wc.ClickOnReminders();
	}

}
