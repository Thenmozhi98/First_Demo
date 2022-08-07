package com.Automationpractice.Purchase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Filter_Option_Page {
public static WebDriver driver;
	
	public Filter_Option_Page(WebDriver driver) {

	Filter_Option_Page.driver = driver;
	PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath = "//p[@id='quantity_wanted_p']/a[2]")
	private WebElement quantity;
	
	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getGroup() {
		return group;
	}

	public WebElement getColor() {
		return color;
	}

	public WebElement getSubmit_Btn() {
		return submit_Btn;
	}

	@FindBy(id = "group_1")
	private WebElement group;
	
	@FindBy(xpath = "//a[@id='color_24']")
	private WebElement color;
	
	@FindBy(xpath = "//button[@name='Submit']")
	private WebElement submit_Btn;


}
