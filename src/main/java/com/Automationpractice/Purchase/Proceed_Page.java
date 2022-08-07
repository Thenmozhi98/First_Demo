package com.Automationpractice.Purchase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed_Page {
	
	public static WebDriver driver;

	public Proceed_Page(WebDriver driver) {

		Proceed_Page.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement checkOut1_Btn;
	
	@FindBy(xpath = "//div[@id='center_column']/p[2]/a[1]/span")
	private WebElement proceed_Check1;
	
	@FindBy(xpath = "//button[@name='processAddress']")
    private WebElement proceed_Address;
	
	@FindBy(id = "cgv")
	private WebElement t_C_CheckOut;
	
	@FindBy(xpath = "//button[@name='processCarrier']")
	private WebElement carrier;
	
	@FindBy(xpath = "//div[@id='HOOK_PAYMENT']/div[2]/div/p[1]/a")
	private WebElement payment;
	
	@FindBy(xpath = "//p[@id='cart_navigation']/button/span")
	private WebElement cnfrm_Btn;
	
	@FindBy(xpath = "//div[@id='center_column']/p[2]/a")
	private WebElement back_Orders;

	public WebElement getCheckOut1_Btn() {
		return checkOut1_Btn;
	}

	public WebElement getProceed_Check1() {
		return proceed_Check1;
	}

	public WebElement getProceed_Address() {
		return proceed_Address;
	}

	public WebElement getT_C_CheckOut() {
		return t_C_CheckOut;
	}

	public WebElement getCarrier() {
		return carrier;
	}

	public WebElement getPayment() {
		return payment;
	}

	public WebElement getCnfrm_Btn() {
		return cnfrm_Btn;
	}

	public WebElement getBack_Orders() {
		return back_Orders;
	}
	
}
