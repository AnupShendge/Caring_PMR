package com.PMR.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.PMR.base.TestBase;
import com.PMR.pages.AddPatient;
import com.PMR.pages.Allergy;
import com.PMR.pages.HealthRecords;
import com.PMR.pages.Login;
import com.PMR.pages.Welcome;

public class AllergyTest extends TestBase {
	Login lg;
	Welcome wc;
	AddPatient ap;
	HealthRecords hr;
	Allergy al;
	
	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		initialise();
		lg = new Login();
		 wc = lg.ClickLogin(null, null);
		 ap = wc.ClickOnPatients();
		 al = ap.addPatient1();
		}
	
	@Test(description="Add allergy for patient")
	public void addAllergy() throws InterruptedException {
		al.addAllergy();
		
	}
	

}
