package com.application.Team11NewBatch.Amazon_WebApplication_Project;


import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsClass {
	
	// Annotations ---- Annotations are those which help the testng framework to recognise the order and structure of the test ca
	
	// @Test --- will reprasent the method to be tested 
	// @BeforeSuite ---- will exicute the method before Suite initiation
	// @BeforeClass----  will exicute the method before Test Class initiation
	// @BeforeMethod---  will exicute the method  before every  test method initation
	// @AfterMethod ---  will exicute the method after every the test method initation
	// @AfterClass----   will exicute the method after test class initation
	// @AfterSuite---    will exicute the method after test suite initation
	@Test
	  public void ValidatePin() {
		  Reporter.log("Pin Validation done-->@Test used", true);
	  }

	  @Test(priority=1)
	  public void ValidateUserId() {
		  Reporter.log("UserId Validation done--> @Test used", true);
	  }
	  @BeforeMethod
	  public void EnterUserIdAndPassword() {
		  Reporter.log("UserIdPasswordEntered  done--> @BeforeMethod used", true);
	  }

	  @AfterMethod
	  public void Logout() {
		  Reporter.log("Logout  done--> @AfterMethod used", true);
	  }

	  @BeforeClass
	  public void BrowserLaunch() {
		  Reporter.log("Launch Browser--> @BeforeClass used", true);
	  }

	  @AfterClass
	  public void CloseBrowser() {
		  Reporter.log("Closed Browser--> @AfterClass used", true);
	  }


}
