package com.Automationpractice.Purchase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn_Page {
	
	public static WebDriver driver;

	public SignIn_Page(WebDriver driver) {

	SignIn_Page.driver = driver;
	PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='passwd']")
	private WebElement pass;
	
	@FindBy(id = "SubmitLogin")
	private WebElement submit_Btn;

	public WebElement getEmail() {
		
		
		
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getSubmit_Btn() {
		return submit_Btn;
	}
	
	
	
	

}
