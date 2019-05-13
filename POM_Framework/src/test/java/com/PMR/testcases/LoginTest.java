package com.PMR.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.PMR.base.TestBase;
import com.PMR.pages.AddPatient;
import com.PMR.pages.Login;
import com.PMR.pages.Welcome;

import junit.framework.Assert;

public class LoginTest extends TestBase {
		Login lg;
		Welcome wc;
		
		
		
		@BeforeTest
		public void setup() throws IOException {
			initialise();
			lg = new Login();
		}
		
		@Test(priority=1)
		public void login() throws InterruptedException {
			 wc = lg.ClickLogin(null, null);
		}
	
		
		@Test(priority=2)
		public void VerifyWelcomePageTitle() {
			String title = lg.WelcomePageTitle();
			Assert.assertEquals(title, "Welcome, Anup");
		}
		
		
	

}
