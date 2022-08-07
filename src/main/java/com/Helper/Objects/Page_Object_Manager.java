package com.Helper.Objects;

import org.openqa.selenium.WebDriver;

import com.Adactin.Pages.BookNow_Page;
import com.Adactin.Pages.Entry_Page;
import com.Adactin.Pages.Login_Page;
import com.Adactin.Pages.Search_Hotel_Page;
import com.Adactin.Pages.Select_Hotel_Page;

public class Page_Object_Manager {

	public  WebDriver driver;

	

	public Page_Object_Manager(WebDriver driver2) {
 
		this.driver = driver2;
	
	}

	private Login_Page  page;
	public Login_Page getPage() {
		
		if(page == null) {
			page = new Login_Page(driver);
		}
		return page;
	}
	
	private Search_Hotel_Page search;
	
	public Search_Hotel_Page getSearch() {
		
		if(search == null) {
			search = new Search_Hotel_Page(driver);
		}
		return search;
	}
	
	private Select_Hotel_Page select;
	

	public Select_Hotel_Page getSelect() {
		
		if(select == null) {
			select = new Select_Hotel_Page(driver);
		}
		return select;
	}
	
	
	private BookNow_Page book;
	public BookNow_Page getBook() {
		
		if(book == null) {
			 book = new BookNow_Page(driver);
			 }
		return book;
	}
	
	private Entry_Page entry;

	public Entry_Page getEntry() {
		
		if(entry == null) {
			entry = new Entry_Page(driver);
		}
		return entry;
	}


	


	


	


	
	

}
