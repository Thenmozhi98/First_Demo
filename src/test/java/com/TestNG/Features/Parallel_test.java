package com.TestNG.Features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_test {
	
	public static WebDriver driver;
	
	@Test
	private void m1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		System.out.println("Hello");
		
		driver.get("https://www.facebook.com/");
	}
	
	
	@Test
	private void m2() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		System.out.println("Hello");
		
		driver.get("https://www.instagram.com/");
	}

}
