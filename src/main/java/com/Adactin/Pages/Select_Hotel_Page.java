package com.Adactin.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel_Page {
	
	public static WebDriver driver;
	
	@FindBy(id = "radiobutton_0")
	private WebElement Radio_Btn;
	
	@FindBy(id = "continue")
	private WebElement Continue;


	public Select_Hotel_Page(WebDriver driver) {

		Select_Hotel_Page.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getRadio_Btn() {
		return Radio_Btn;
	}


	public WebElement getContinue() {
		return Continue;
	}
	

	
	

	
	
	
	
}
