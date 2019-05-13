package com.PMR.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.PMR.base.TestBase;
import com.PMR.pages.AddPatient;
import com.PMR.pages.HealthRecords;
import com.PMR.pages.Login;
import com.PMR.pages.MedicalCondition;
import com.PMR.pages.Welcome;

public class MedicalConditionTest extends TestBase {

	Login lg;
	Welcome wc;
	AddPatient ap;
	HealthRecords hr;
	MedicalCondition mc;

	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		initialise();
		lg = new Login();
		wc = lg.ClickLogin(null, null);
		ap = wc.ClickOnPatients();
		mc = ap.addPatient2();
	}

	@Test(description = "Add medical condition")
	public void add() throws InterruptedException {
		mc.addMedicalCondition();
	}

}
