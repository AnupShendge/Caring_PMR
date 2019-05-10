package com.PMR.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.PMR.base.TestBase;
import com.PMR.pages.AddPatient;
import com.PMR.pages.Allergy;
import com.PMR.pages.HealthRecords;

public class AllergyTest extends TestBase {
	AddPatient ap;
	HealthRecords hr;
	Allergy al;
	
	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		initialise();
		ap = new AddPatient();
		hr = ap.addpatient();
		}
	
	@Test(description="Add allergy for patient")
	public void addAllergy() throws InterruptedException {
		al = new Allergy();
		al.addAllergy();
		
	}
	

}
