package com.TestNG.Features;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_MultipleData {


	@DataProvider
	private String[][] mutiple_Data() {

		String [][] data = {
				{"jimin"," 26","busan"},
				{"jhope","27","dwangju"},
				{"suga","28","daegu"},
				{"jin","30","dwacheon-si"}
		};
		
		return data;
		
	}
	
	@Test(dataProvider = "mutiple_Data")
	private void demo_Method(String email, String password,String value) {

		System.out.println("Email_ID:"  +email);
		System.out.println("Password:"  +password);
		System.out.println("HomeTown:"  +value);
		
		
	}
	
	
}
