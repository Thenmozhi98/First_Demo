package com.Runner.demo;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.Helper.Objects.Page_Object_Manager;
import com.Utility_Files.Demo.Base_Implementation_Demo;

public class Runner_Adactin_Hotel extends Base_Implementation_Demo {
	
	public static WebDriver driver = Runner_Adactin_Hotel.getBrowser("chrome");
	public static Page_Object_Manager object = new Page_Object_Manager(driver);
	public static Logger log = Logger.getLogger(Runner_Adactin_Hotel.class);

	
	public static void creek_Hotel() {
		
		geturl("https://adactinhotelapp.com/");
		
		log.info("url Launched");
		send_Keys(object.getPage().getUserName(),"Divya008");
		send_Keys(object.getPage().getPassWord(),"ThenuR@98");
		click_Method(object.getPage().getLogin());
	    
		
		click_Method(object.getSearch().getLocation());
		log.info("Location    " +  object.getSearch().getLocation().getText());
		click_Method(object.getSearch().getHotels());
		click_Method(object.getSearch().getRoomType());
		
		clear_Method(object.getSearch().getDate_In());
		send_Keys(object.getSearch().getDate_In(),"14/07/2022");
		clear_Method(object.getSearch().getDate_Out());
		send_Keys(object.getSearch().getDate_Out(),"18/07/2022");
		click_Method(object.getSearch().getSubmit());
        
		
		click_Method(object.getSelect().getRadio_Btn());
		click_Method(object.getSelect().getContinue());

	    
	    send_Keys(object.getBook().getFirst_Name(),"Divya");
	    
	    send_Keys(object.getBook().getLast_Name(),"T.R");
	    send_Keys(object.getBook().getAddress(),"No.18 Rajan Street");
	    send_Keys(object.getBook().getCC_Num(),"4384923047592745");
	    click_Method(object.getBook().getCC_Type());
	    click_Method(object.getBook().getCC_ExpMonth());
	    click_Method(object.getBook().getCC_ExpYear());
	    send_Keys(object.getBook().getCC_Cvv(),"4562");
	    click_Method(object.getBook().getBooking());
	    
	    
	    click_Method(object.getEntry().getEntry());
	    
	    
	    click_Method(object.getEntry().getValue_Num());
		
	}
	
	public static void order_Id1() throws IOException {

		
		click_Method(object.getEntry().getcpy_OrderId());
		actions();
		click_Method(object.getEntry().getpaste_Id());
		actions();
		actions().build().perform();
		
		implicit_Wait();
	
		click_Method(object.getEntry().getgo_Btn());
		
		implicit_Wait();
		
		takesScreenshot();
		
		implicit_Wait();
		
		click_Method(object.getEntry().getagn_Btn());
		
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		PropertyConfigurator.configure("log4j.properties");
		creek_Hotel();
		order_Id1();
	    click_Method(object.getEntry().getLogOut_Btn());
	    close();
	    
	}
}

