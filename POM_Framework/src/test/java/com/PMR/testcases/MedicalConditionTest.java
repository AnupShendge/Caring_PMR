package com.PMR.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.PMR.base.TestBase;
import com.PMR.pages.AddPatient;
import com.PMR.pages.HealthRecords;
import com.PMR.pages.MedicalCondition;

public class MedicalConditionTest extends TestBase {
	
	AddPatient ap;
	HealthRecords hr;
	MedicalCondition mc;
	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		initialise();
		ap = new AddPatient();
		hr = ap.addpatient();
		}
	
	@Test(description="Add medical condition")
	public void add() throws InterruptedException {
		mc = new MedicalCondition();
		mc.addMedicalCondition();
	}

}
