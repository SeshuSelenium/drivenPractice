package com.dataDriven.util;

import java.util.ArrayList;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.annotations.VisibleForTesting;

public class Provider {
	
	@BeforeTest
	public void pre() {
		System.out.println("pre");
	}
	@Test(dataProvider = "getData")
	public void test1(String userName, String password) {
		System.out.println("ueser name : "+ userName);
		System.out.println("ueser name : "+ password);
	}
	
	@DataProvider
	public Object[][] getData(){
		
//		Object[][] data = new  Object[3][2];
//		
//		 data[0][0] = "9490072254";
//		 data[0][1] = "seshureddy";
//		 
//		 data[1][0] = "9515599998";
//		 data[1][1] = "seshureddy";
//		 
//		 data[2][0] = "7989620254";
//		 data[2][1] = "seshureddy";
		
		ArrayList<String> list = new ArrayList();
		
		
		
		
		return data;
	}
}
