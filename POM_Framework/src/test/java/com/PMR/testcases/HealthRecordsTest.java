package com.PMR.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.PMR.base.TestBase;
import com.PMR.pages.AddPatient;
import com.PMR.pages.HealthRecords;
import com.PMR.pages.Login;
import com.PMR.pages.Welcome;

public class HealthRecordsTest extends TestBase {
	Login lg;
	AddPatient ap;
	HealthRecords hr;
	Welcome wc;

	@BeforeTest
	public void setup() throws IOException, InterruptedException {
		initialise();
		lg = new Login();
		wc = lg.ClickLogin(null, null);
		ap = wc.ClickOnPatients();
		hr = ap.addpatient();

	}

	@Test(priority = 1)
	public void AddingHealthRecords() throws InterruptedException {
		hr.add();
	}

	@Test(priority = 2)
	public void UpdateHealthRecords() throws InterruptedException {
		hr.update();
	}

	@Test(priority = 3)
	public void DeleteHealthRecords() throws InterruptedException {
		hr.delete();
	}

}
