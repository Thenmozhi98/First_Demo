package com.Adactin.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public static WebDriver driver;
	
	@FindBy(name = "username")
	private WebElement userName; 
	
	
	@FindBy(name = "password")
	private WebElement passWord; 
	
	
	@FindBy(name = "login")
	private WebElement Login;
	
	
	public Login_Page(WebDriver driver) {
		
		Login_Page.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	
	public WebElement getUserName() {
		return userName;
	}


	public WebElement getPassWord() {
		return passWord;
	}


	public WebElement getLogin() {
		return Login;
	} 
	
	
	
	
}
