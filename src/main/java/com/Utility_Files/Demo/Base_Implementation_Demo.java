package com.Utility_Files.Demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Implementation_Demo {

	public static WebDriver driver;

	public static WebDriver getBrowser(String name) {

		if (name.equalsIgnoreCase("Chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} 
		else if (name.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		return driver;

	}

	public static void geturl(String url) {

		driver.get(url);

	}

	public static void click_Method(WebElement ele) {

		ele.click();
	}

	public static void send_Keys(WebElement ele, String value) {

		ele.sendKeys(value);

	}

	public static void clear_Method(WebElement ele) {

		ele.clear();
	}

	public static String get_Title() {

		String title = driver.getTitle();
		return title;
	}

	public static String get_Text(WebElement ele) {

		String text = ele.getText();
		return text;
	}

	public static boolean is_Displayed(WebElement element) {

		boolean displayed = element.isDisplayed();
		return displayed;
	}
	public static boolean is_Selected(WebElement ele) {
		boolean selected = ele.isSelected();
		return selected;
	}

	public static boolean is_Enabled(WebElement ele) {
		boolean enabled = ele.isEnabled();
		return enabled;
	}
	public static String get_Attribute(WebElement ele, String Value) {
		
		String attribute = ele.getAttribute(Value);
		return attribute;
	}
	public static void robot_Class() throws AWTException {
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	public static void close() {
		driver.close();
	}
	public static void quit() {
		driver.quit();
	}
	public static String get_Currenturl() {
		String url = driver.getCurrentUrl();
		return url;
	}
	public static void navigate_To(String url) {

		driver.navigate().to(url);
		
	}
	
	public static void navigate_Back() {
		driver.navigate().back();
	}
	public static  void navigate_Forward() {

		driver.navigate().forward();
	}
	public static void navigate_Refresh() {

		driver.navigate().refresh();
	}
    public static void alert() {

    	driver.switchTo().alert();
    	driver.switchTo().alert().accept();
    	driver.switchTo().alert().dismiss();
	}
   
    public static void dropdown(String type,WebElement element,String value) {

    	Select s = new Select(element);
    	if(type.equalsIgnoreCase("index")) {
    		int index = Integer.parseInt(value);
    		s.selectByIndex(index);
    	}
    	else if(type.equalsIgnoreCase("visible text")) {
    		s.selectByVisibleText(value);
    	}
    	else if(type.equalsIgnoreCase("value")) {
    		s.selectByValue(value);
    	}
	}
    
	public static Actions actions() {

		Actions a = new Actions(driver);
		a.keyDown(Keys.CONTROL);
	    a.sendKeys("a");
	    a.keyUp(Keys.CONTROL);
	    a.build().perform();      
	    
	    
	    a.keyDown(Keys.CONTROL);
	    a.sendKeys("c");
	    a.keyUp(Keys.CONTROL);
	    a.build().perform();
	    
	    
	    a.sendKeys(Keys.TAB);
	    a.build().perform();
	    
	    
	    a.keyDown(Keys.CONTROL);
	    a.sendKeys("v");
	    a.keyUp(Keys.CONTROL);
	    a.build().perform();
	 
	       
	    return a;
	}
	
	public static  void takesScreenshot() throws IOException {
		
		  TakesScreenshot ts = (TakesScreenshot)driver;
		  File source = ts.getScreenshotAs(OutputType.FILE);
		  File destination = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Maven_Demo\\Snaps\\creek.jpg");
		  FileUtils.copyFile(source, destination);
	
      }
	
	public static void implicit_Wait() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
}
