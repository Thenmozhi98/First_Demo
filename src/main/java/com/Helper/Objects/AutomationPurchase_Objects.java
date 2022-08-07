package com.Helper.Objects;

import org.openqa.selenium.WebDriver;

import com.Automationpractice.Purchase.Dresses_Page;
import com.Automationpractice.Purchase.Filter_Option_Page;
import com.Automationpractice.Purchase.Home_Page;
import com.Automationpractice.Purchase.Proceed_Page;
import com.Automationpractice.Purchase.SignIn_Page;

public class AutomationPurchase_Objects {

	
	public WebDriver driver;
	
	public AutomationPurchase_Objects(WebDriver driver2) {

	          this.driver = driver2;
	
	}
	
	
	
     private Home_Page page;
     
     
     public Home_Page getPage() {
    	 
    	 if(page == null) {
 			page = new Home_Page(driver);
 		}
 		return page;
 	}
     
     private SignIn_Page sign_in;
     
     
	public SignIn_Page getSign_in() {
		 
   	 if(sign_in == null) {
			sign_in = new SignIn_Page(driver);
		}
		
		return sign_in;
	}
	
    private Dresses_Page dresses;
    
    
	public Dresses_Page getDresses() {
		 
   	 if(dresses == null) {
			dresses = new Dresses_Page(driver);
		}
		
		return dresses;
	}

	private Filter_Option_Page option_Page;
  
    public Filter_Option_Page getOption_Page() {
    	
    	if(option_Page == null) {
			option_Page = new Filter_Option_Page(driver);
		}
    	
		return option_Page;
	}



	private Proceed_Page checkOut_Page ;
    
	public Proceed_Page getCheckOut_Page() {
		
		 
   	 if(checkOut_Page == null) {
			checkOut_Page = new Proceed_Page(driver);
		}
		
		return checkOut_Page;
	}



	
	
	
}
