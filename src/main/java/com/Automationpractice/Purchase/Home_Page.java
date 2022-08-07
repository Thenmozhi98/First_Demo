package com.Automationpractice.Purchase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Home_Page {

	public static WebDriver driver;
	
		@FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?controller=my-account']")
		private WebElement homepage;

		public Home_Page(WebDriver driver) {

			Home_Page.driver = driver;
			PageFactory.initElements(driver, this);
			
		}

		public WebElement getHomepage() {
			return homepage;
		}
		
		
		

}
