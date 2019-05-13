package com.PMR.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.PMR.base.TestBase;
import com.PMR.pages.AddPatient;
import com.PMR.pages.HealthRecords;
import com.PMR.pages.Login;
import com.PMR.pages.Notes;
import com.PMR.pages.Welcome;

public class NotesTest extends TestBase {
	Login lg;
	Welcome wc;
	AddPatient ap;
	HealthRecords hr;
	Notes nt;
	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		initialise();
		lg = new Login();
		 wc = lg.ClickLogin(null, null);
		 ap = wc.ClickOnPatients();
		 nt = ap.addPatient3();
		}
	
	@Test(description="Add Notes")
	public void add() throws InterruptedException {
		nt.addNotes();
	}
	
	

}
