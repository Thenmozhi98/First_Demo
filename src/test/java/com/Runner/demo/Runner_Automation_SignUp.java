package com.Runner.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Utility_Files.Demo.Base_Implementation_Demo;

public class Runner_Automation_SignUp extends Base_Implementation_Demo {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		driver = getBrowser("chrome");
		geturl("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement loginbtn = driver.findElement(By.xpath("//a[@href='http://automationpractice.com/index.php?controller=my-account']"));
		click_Method(loginbtn);
	
		WebElement email = driver.findElement(By.xpath("(//input[contains(@class,'is_required validate')])[1]"));
		send_Keys(email,"purple@gmail.com");	
		
		WebElement create_Btn = driver.findElement(By.xpath("//button[@id='SubmitCreate']"));
		click_Method(create_Btn);
		
		WebElement gender = driver.findElement(By.xpath("//input[@value='2']"));
		click_Method(gender);
		
		WebElement name_F = driver.findElement(By.xpath("//input[@name='customer_firstname']"));
		send_Keys(name_F,"sumi");	
		
		WebElement name_L = driver.findElement(By.xpath("//input[@name='customer_lastname']"));
		send_Keys(name_L,"Rathi");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='passwd']"));
		send_Keys(password,"983331");
		
		WebElement drop_Btn = driver.findElement(By.xpath("//div[@class='form-group']"));
		click_Method(drop_Btn);
		
		
		WebElement date_D = driver.findElement(By.id("days"));
		WebElement date_M = driver.findElement(By.id("months"));
		WebElement date_Y = driver.findElement(By.id("years"));
		
		Select s = new Select(date_D);
		s.selectByIndex(1);
		Select s1 = new Select(date_M);
		s1.selectByIndex(8);
		Select s2 = new Select(date_Y);
		s2.selectByIndex(25);
		Thread.sleep(9000);
		WebElement check_Box = driver.findElement(By.id("optin"));
		click_Method(check_Box);
		Thread.sleep(9000);
		
		WebElement address = driver.findElement(By.id("address1"));
		send_Keys(address,"No.18 ABC");
		
		
		WebElement city_N = driver.findElement(By.xpath("//input[@name='city']"));
		send_Keys(city_N,"Chennai");
	
		
		WebElement state = driver.findElement(By.id("id_state"));
		Select s3 = new Select(state);
		s3.selectByIndex(26);
		
		
		WebElement code = driver.findElement(By.xpath("//input[@name='postcode']"));
		send_Keys(code,"00217");
		
		
		WebElement country = driver.findElement(By.id("id_country"));
		Select s4 = new Select(country);
		s4.selectByIndex(1);
		
		
		WebElement mobile = driver.findElement(By.xpath("//input[@name='phone_mobile']"));
	    send_Keys(mobile,"9826338212");
		
		
		WebElement ref = driver.findElement(By.id("alias"));
		send_Keys(ref,"NEW STREET");
		
		
		WebElement register = driver.findElement(By.xpath("//button[@name='submitAccount']"));
		click_Method(register);
		
		
	}
	

	}

