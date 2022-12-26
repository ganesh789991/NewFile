package com.application.Team11NewBatch.Amazon_WebApplication_Project;

import org.testng.annotations.Test;

public class GroupMethodsSub {
	
	@Test(groups = "Regression")
	public void verifyAddToCart()
	{
		System.out.println("Added to cart");
	}
	@Test(groups = "Sanity")
	public void verifyItemDetails()
	{
		System.out.println("Item");
	}
	@Test()
	public void verifyPriceOfItem()	{
		System.out.println("Price detials");
	}

}
