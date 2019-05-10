package com.PMR.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.PMR.base.TestBase;
import com.PMR.pages.AddPatient;
import com.PMR.pages.HealthRecords;
import com.PMR.pages.Login;

public class AddPatientTest extends TestBase {
	Login lg;
	AddPatient ap;
	HealthRecords hr;
	
	
	
	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		initialise();
		lg = new Login();
		ap = lg.ClickLogin(null, null);
	}
	
	
	@Test(description="Add patient scenario")
	public void login() throws InterruptedException {
		 hr = ap.addpatient();
		
		
	}
	
	@AfterMethod
	public void close() {
		//teardown();
	}
	
	
	
	
	
	

}
