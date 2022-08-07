package com.Adactin.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookNow_Page {
	
	public static WebDriver driver;
	
	@FindBy(id  = "first_name" )
	private WebElement First_Name;
	
	@FindBy(id  = "last_name")
	private WebElement Last_Name;
	
	@FindBy(id = "address")
	private WebElement Address;
	
	@FindBy(id  = "cc_num")
	private WebElement CC_Num;
	
	@FindBy(xpath = "//select[@id='cc_type']/option[2]")
	private WebElement CC_Type;
	
	@FindBy(xpath = "//select[@id='cc_exp_month']/option[11]")
	private WebElement CC_ExpMonth;
	
	@FindBy(xpath = "//select[@id='cc_exp_year']/option[11]")
	private WebElement CC_ExpYear;
	
	@FindBy(id = "cc_cvv")
	private WebElement CC_Cvv;
	
	@FindBy(xpath = "//input[@value='Book Now']")
	private WebElement Booking;
	


	public BookNow_Page(WebDriver driver) {

		BookNow_Page.driver = driver;
		PageFactory.initElements(driver, this);
	
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirst_Name() {
		return First_Name;
	}

	public WebElement getLast_Name() {
		return Last_Name;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCC_Num() {
		return CC_Num;
	}

	public WebElement getCC_Type() {
		return CC_Type;
	}

	public WebElement getCC_ExpMonth() {
		return CC_ExpMonth;
	}

	public WebElement getCC_ExpYear() {
		return CC_ExpYear;
	}

	public WebElement getCC_Cvv() {
		return CC_Cvv;
	}

	public WebElement getBooking() {
		return Booking;
	}

	
	
	

}
