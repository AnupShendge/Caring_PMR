package com.PMR.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.PMR.base.TestBase;
import com.PMR.pages.AddPrescribers;
import com.PMR.pages.Login;
import com.PMR.pages.Welcome;

public class AddPrescriberTest extends TestBase {
	Login lg;
	AddPrescribers ap;
	Welcome wc;
	
	
	
	@BeforeTest
	public void setup() throws IOException, InterruptedException {
		initialise();
		lg = new Login();
		wc = lg.ClickLogin(null, null);
		ap = wc.ClickOnPrescriber();
		
	}
	
	@Test
	public void AddPrescriber() {
		ap.ClickOnAddPrescriber();
	}
	

}
