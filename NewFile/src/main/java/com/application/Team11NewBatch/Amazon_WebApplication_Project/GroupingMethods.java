package com.application.Team11NewBatch.Amazon_WebApplication_Project;

import org.testng.annotations.Test;

public class GroupingMethods {

	@Test(groups = "Sanity")
	public void verifybrowserMethod()
	{
		System.out.println("Browser method 1");
	}
	
	@Test(groups = {"Sanity","Regression"})
	public void verifyloginMethod()
	{
		System.out.println("login Method 1");
	}
	
	@Test()
	public void verifyloginIcon()
	{
		System.out.println("LoginIcon verified ");
	}
	
	
}
