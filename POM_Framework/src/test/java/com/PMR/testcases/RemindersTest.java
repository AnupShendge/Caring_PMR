package com.PMR.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.PMR.base.TestBase;
import com.PMR.pages.Login;
import com.PMR.pages.Reminders;
import com.PMR.pages.Welcome;

public class RemindersTest extends TestBase {

	Login lg;
	Welcome wc;
	Reminders rm;

	@BeforeTest
	public void setup() throws IOException, InterruptedException {
		initialise();
		lg = new Login();
		wc = lg.ClickLogin(null, null);
		rm = wc.ClickOnReminders();
	}

	@Test
	public void SearchPatient() {
		rm.SearchPatient();
	}

}
