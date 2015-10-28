package com.automation.IndexPages;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

import com.automation.Pages.AbstractPage;
import com.automation.Pages.SnapDealDashBoardPage;


public class SnapDealIndexPage extends AbstractPage {
	
	
	public SnapDealIndexPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}	
		@FindBy(id="loggedOutAccount")
		private WebElement loginButton;
		@FindBy(xpath=".//*[@id='logInByEmailBtn']")
		private WebElement emailButton;
		@FindBy(id="j_username")
		private WebElement uName;
		@FindBy(id="j_password")
		private WebElement pwd;
		@FindBy(id="signin_submit")
		private WebElement submitButton;
		@FindBy(xpath=".//*[@id='sig']")
		private WebElement signinpopup;
		@FindBy(xpath=".//*[@id='log']")
		private WebElement register;
		@FindBy(xpath=".//*[@id='signin_box']/div")
		private WebElement popup;
		@FindBy(xpath=".//*[@id='tab22']/div[1]/div[2]/img")
		private WebElement img;
	
		
		
		public SnapDealDashBoardPage login(String userName,String Password){
		
			String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
			String subWindowHandler = null;
			loginButton.click();
			Set<String> handles = driver.getWindowHandles(); // get all window handles
			Iterator<String> iterator = handles.iterator();
			while (iterator.hasNext()){
			    subWindowHandler = iterator.next();
			}
			driver.switchTo().window(subWindowHandler); // switch to popup window
			 signinpopup.click();
		        //register.click();
				emailButton.click();
				uName.sendKeys(userName);
				pwd.sendKeys(Password);
				submitButton.click();                     // perform operations on popup

			driver.switchTo().window(parentWindowHandler);  
			
			
			
			/*
			//Get Parent window handle
			 String winHandleBefore = driver.getWindowHandle();
			 loginButton.click();
			 String winHandle = driver.getWindowHandle();
			 //Switch to chile window
			 driver.switchTo().window(winHandle);
			 
			 signinpopup.click();
		        //register.click();
				emailButton.click();
				uName.sendKeys(userName);
				pwd.sendKeys(Password);
				submitButton.click();
			//Do some operation on child window and get child window handle.
			String winHandleAfter = driver.getWindowHandle();

			//switch to child window of 1st child window.
			
			 

			//Do some operation on child window of 1st child window.
			//to close the child window of 1st child window.
			driver.close();
*/
			//to close the child window.
			driver.close();

			//to switch to parent window.
		//	driver.switchTo().window(winHandleBefore);
			
			
			
			/*	 String winHandleBefore = driver.getWindowHandle();
			loginButton.click();
			String mainWindow = driver.getWindowHandle();
			String winHandle = driver.getWindowHandle();
			driver.switchTo().window(winHandle);
			signinpopup.click();
	        
			emailButton.click();
			uName.sendKeys(userName);
			pwd.sendKeys(Password);
			submitButton.click();
*/
			return new SnapDealDashBoardPage(driver);
				
		}
		
		
		
	

}
