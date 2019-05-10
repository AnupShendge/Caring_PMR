package com.PMR.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.PMR.base.TestBase;
import com.PMR.pages.AddPatient;
import com.PMR.pages.HealthRecords;
import com.PMR.pages.Notes;

public class NotesTest extends TestBase {
	
	AddPatient ap;
	HealthRecords hr;
	Notes nt;
	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		initialise();
		ap = new AddPatient();
		hr = ap.addpatient();
		}
	
	@Test(description="Add Notes")
	public void add() throws InterruptedException {
		nt = new Notes();
		nt.addNotes();
	}
	
	

}
