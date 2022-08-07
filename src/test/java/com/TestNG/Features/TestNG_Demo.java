package com.TestNG.Features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo {
	
	@Test
	public void main_Demo() {
		System.setProperty("webdriver.chrome.driver", 
"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.quit();
	}
	@Test
	private void test_Demo() {
		System.out.println("TestNG DEMO");
		System.out.println("TEST !");
	}
	@BeforeMethod
	public void test_Before() {
		System.out.println("TestNG Intro");
	}
	@AfterMethod
	public void test_After() {
		System.out.println("TestNG");
	}
	@BeforeSuite
	private void before_Suite() {
		
		System.out.println("Before Suite");
	}
	@AfterSuite
    private void after_Suite() {
		System.out.println("After Suite");
	}
	@BeforeTest
	public void before_Test() {
		System.out.println("Before Test");
	}
	@AfterTest
	public void after_Test() {
		System.out.println("After Test");
	}
	@BeforeClass
	public void before_Class() {
		System.out.println("Before Class");
	}
	@AfterClass
	public void after_Class() {
		System.out.println("After Class");
	}
	@BeforeGroups
	public void before_Group() {
		//System.out.println("TESTNG METHODS");
	}
	
	@AfterGroups
	public void after_group() {
		
	}
}