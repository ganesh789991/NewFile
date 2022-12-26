package com.application.Team11NewBatch.Amazon_WebApplication_Project;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TypesOfTestNGKeywords{

   // discription--- to discribe wht tht method is about
	// inovcationCount ---- no of times the test is exicuted
	// group ----- groups= {"Sanity","Restecting"} ------ groups={"Sanity"}
	
	// 1. invocationCount---- some time a test case is tested multiple times then we use invocationCount Keyword	
	
	@BeforeMethod
	public void before()
	{
		Reporter.log("Before Method Running", true);
	}
	
	@Test(invocationCount = 5)
public void TC() {
	  Reporter.log("TC1 Running", true);
  }

	
	
	// 2. priority ----- If we want to change or alter the test exicution order then we use priority Keyword
   //             ----- priority can be 0,+,-,duplicate but cant be decimal or variable 
	
// ----------- with out priority-----------------------
	@Test
	public void C()
	{
		Reporter.log("C is running",true);
	  }
	
     @Test
public void A()
  {
	 Reporter.log("A is running",true);
  }
    @Test
public void B() 
  {
	 Reporter.log("B is running",true);
  }
    
 //------------- with priority -------------------------------
    
    @Test (priority = 1)
	public void C1()
	{
		Reporter.log("C1 is running",true);
	  }
	
@Test (priority = 3)
public void A1()
  {
	 Reporter.log("A1 is running",true);
  }
@Test (priority = 2)
public void B1() 
  {
	 Reporter.log("B1 is running",true);
  }


    
 // 3. enabled -----  disabling a test in testng fram woork is done by marking enable as false to and annotation
	

@Test 
public void TC1() {
	  Reporter.log("Running TC1",true);
  }
@Test (enabled = false)
public void TC2() 
  {
	  Reporter.log("Running TC2",true);
}
@Test
public void TC3() {
	  Reporter.log("Running TC3",true);
}


 // 4. TimeOut---  if a class has many methods and some methods take more time than expected then we use timeout method to skip it
 


@Test
public void TC11()
  {
	  Reporter.log("TC11 is running", true);
  }

@Parameters({"UserURL","SiteName"})
@Test ()

public void TC22(String user ,String sita )  throws InterruptedException 
  {
	// Thread.sleep(3000);
	  Reporter.log("TC22 is running", true);
	 System.out.println(user);
	 System.out.println(sita);
	 // if we give two parameter and two strings @Parameter({ parameter 1, parameter 2,...}) and it will take it in the order we given in the parameter
	 // if there is only one parameter (parameter 1)
	 // if we give two parameters and one string it will show a error that ther is 2 parameter and only one string is given
  }

@Test(dependsOnMethods= {"TC22"})
public void TC33()
  {
	  Reporter.log("TC33 is running", true);
  }



















}
