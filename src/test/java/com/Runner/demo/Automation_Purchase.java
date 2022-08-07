package com.Runner.demo;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Helper.Objects.AutomationPurchase_Objects;
import com.Utility_Files.Demo.Base_Implementation_Demo;

public class Automation_Purchase extends Base_Implementation_Demo{
	
	public static WebDriver driver = Automation_Purchase.getBrowser("Chrome");
	public static AutomationPurchase_Objects manager = new AutomationPurchase_Objects(driver);
	public static Logger log = Logger.getLogger(Automation_Purchase.class);

 public static void main(String[] args) {
	    geturl("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		click_Method(manager.getPage().getHomepage());
		
		send_Keys(manager.getSign_in().getEmail(),"bbbts7@gmail.com");
	    send_Keys(manager.getSign_in().getPass(),"bangtan");
		click_Method(manager.getSign_in().getSubmit_Btn());
		
		Actions a = new Actions(driver);
		a.moveToElement(manager.getDresses().getDress_Btn()).build().perform();

		a.moveToElement(manager.getDresses().getEvening_Dress());
		a.click().build().perform();

		JavascriptExecutor js  = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView()",manager.getDresses().getQuick_View());
		
		js.executeScript("arguments[0].click()",manager.getDresses().getQuick_View());
		
	//	WebElement select_Dress = driver.findElement(By.xpath("//img[@itemprop = 'image']"));
		
	//	js.executeScript("arguments[0].scrollIntoView()",select_Dress);
		
	//	js.executeScript("arguments[0].click()",select_Dress);
		
     	click_Method(manager.getOption_Page().getQuantity());
		
     	WebElement group = manager.getOption_Page().getGroup();
		dropdown("value",group, "3");
	
     
		click_Method(manager.getOption_Page().getColor());
		
		
		js.executeScript("arguments[0].click()",manager.getOption_Page().getSubmit_Btn());
		
		
	    js.executeScript("arguments[0].click()",manager.getCheckOut_Page().getCheckOut1_Btn());
	    
	    
	    js.executeScript("arguments[0].scrollIntoView()", manager.getCheckOut_Page().getProceed_Check1());
	    js.executeScript("arguments[0].click()", manager.getCheckOut_Page().getProceed_Check1());
	
	  js.executeScript("arguments[0].scrollIntoView()", manager.getCheckOut_Page().getProceed_Address());
	    js.executeScript("arguments[0].click()", manager.getCheckOut_Page().getProceed_Address());
	
	    js.executeScript("arguments[0].click()", manager.getCheckOut_Page().getT_C_CheckOut());
	    
		  js.executeScript("arguments[0].scrollIntoView()", manager.getCheckOut_Page().getCarrier());
		    js.executeScript("arguments[0].click()", manager.getCheckOut_Page().getCarrier());
		
	    
	    js.executeScript("arguments[0].scrollIntoView()", manager.getCheckOut_Page().getPayment());
	    js.executeScript("arguments[0].click()", manager.getCheckOut_Page().getPayment());
	    
	    
		  js.executeScript("arguments[0].scrollIntoView()", manager.getCheckOut_Page().getCnfrm_Btn());
		    js.executeScript("arguments[0].click()", manager.getCheckOut_Page().getCnfrm_Btn());
		    
		    
			  js.executeScript("arguments[0].scrollIntoView()", manager.getCheckOut_Page().getBack_Orders());
			    js.executeScript("arguments[0].click()", manager.getCheckOut_Page().getBack_Orders());    
	 
	 
			    
	 
	 
	 
}
	
}
