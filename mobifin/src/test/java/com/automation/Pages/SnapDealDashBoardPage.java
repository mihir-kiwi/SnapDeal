package com.automation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SnapDealDashBoardPage extends AbstractPage {

	
	
	@FindBy(id="logout-account")
	private WebElement logout;
	@FindBy(id="loggedOutAccount")
	private WebElement loginButton;
	

	public boolean isLogin(){
		loginButton.click();
		if(logout.isDisplayed()){
			return true;
		}else{
			return false;
		}
 	}
	
	public SnapDealDashBoardPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
}
