package com.Adactin.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Entry_Page {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Booked Itinerary']")
	private WebElement Entry;

	@FindBy(xpath ="//input[@value='657166']")
	private WebElement value_Num;
	
	@FindBy(xpath = "//input[@id='order_id_657166']")
	private WebElement cpy_OrderId;
	
	@FindBy(xpath = "//input[@id='order_id_text']")
	private WebElement paste_Id; 

	@FindBy(id ="search_hotel_id")
	private WebElement go_Btn;
	
	@FindBy(id ="search_hotel")
	private WebElement agn_Btn;
	
	@FindBy(xpath ="//a[text()='Logout']")
	private WebElement logOut_Btn;
	
	public Entry_Page(WebDriver driver) {
		Entry_Page.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	public WebElement getEntry() {
		return Entry;
	}
	
	
	public WebElement getValue_Num() {
		return value_Num;
	}
	
	public WebElement getcpy_OrderId() {
		return cpy_OrderId;
	}
	
	
	
	public WebElement getpaste_Id() {
		return paste_Id;
	}


	public WebElement getgo_Btn() {
		return go_Btn;
	}
	
	public WebElement getagn_Btn() {
		return agn_Btn;
	}

	public WebElement getLogOut_Btn() {
		return logOut_Btn;
	}
	
	

}
