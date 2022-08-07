package com.TestNG.Features;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Parameter_SingleData {

	@Parameters({"id"})
	@Test
	private void single_Data(String email) {

		System.out.println("Email ID: " +email);
		
	}
	
	
	@Parameters({"Id"})
	@Test
	private void option_Data(@Optional("smith")String email) {

		System.out.println("Email ID: " +email);
		
	}
}
