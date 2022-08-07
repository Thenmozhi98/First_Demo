package com.TestNG.Features;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Demo {

	@Test
	private void demo_A() {

		String firstName = "Jin";

		String actual = "jin";	
		
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals(actual, firstName);
		
	//	soft.assertAll();
		
		System.out.println("Validation Successfully");
	}
	
	@Test
	private void demo_B() {

		String lastName = "Seok";

		String actual = "Seok";	
		
		Assert.assertEquals(actual, lastName);
		
		System.out.println("Validation Successfully");
		
	}
}
