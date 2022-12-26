package com.application.Team11NewBatch.Amazon_WebApplication_Project;

import java.util.Arrays;

public class working {
	
	
	
	
	public static void main(String[]args) {
		
		working s=new working();
		s.method();
		
		
	}
	

	public void method() {
	String str="@#ganesh6434";
	char [] c=str.toCharArray();
	System.out.println(Arrays.toString(c));
//	System.out.println(str.length());
//	System.out.println(+c[7]);
	
	for(int i=0;i<str.length();i++)
	{
		// 64 to 122
		if(c[i]>64 &&c[i]<122)
		{
			System.out.print(c[i]);
		}
		
		
	}
	
	
	
	
	
	
	
	}
	
			
}
