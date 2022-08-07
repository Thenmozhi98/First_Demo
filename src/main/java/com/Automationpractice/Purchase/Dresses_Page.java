package com.Automationpractice.Purchase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresses_Page {

	public static WebDriver driver;
	
	public Dresses_Page(WebDriver driver) {

		Dresses_Page.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@id='block_top_menu']/ul/li[2]/a")
	private WebElement dress_Btn;
	
	@FindBy(xpath = "//div[@id='block_top_menu']/ul/li[2]/ul/li[2]/a")
	private WebElement evening_Dress;
	
	@FindBy(xpath = "//span[text()='Quick view']")
	private WebElement quick_View;

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getDress_Btn() {
		return dress_Btn;
	}

	public WebElement getEvening_Dress() {
		return evening_Dress;
	}

	public WebElement getQuick_View() {
		return quick_View;
	}

}
