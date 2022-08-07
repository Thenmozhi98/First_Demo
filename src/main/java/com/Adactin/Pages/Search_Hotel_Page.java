package com.Adactin.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel_Page {

	public static WebDriver driver;
	@FindBy(xpath = "//select[@id='location']/option[9]")
	private WebElement Location;
	
	@FindBy(xpath = "//select[@id='hotels']/option[2]")
	private WebElement Hotels;
	
	@FindBy(xpath = "//select[@id='room_type']/option[3]")
	private WebElement RoomType;
	
	@FindBy(xpath = "//input[@id='datepick_in']")
	private WebElement Date_In;
	
	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement Date_Out;
	
	@FindBy(id = "Submit")
	private WebElement submit;
	
	
    public Search_Hotel_Page(WebDriver driver) {
		
		Search_Hotel_Page.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoomType() {
		return RoomType;
	}

	public WebElement getDate_In() {
		return Date_In;
	}

	public WebElement getDate_Out() {
		return Date_Out;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	
}
