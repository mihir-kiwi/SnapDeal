package com.automation.Verifications;

import org.testng.annotations.Test;

import com.automation.Init.Common;
import com.automation.Init.SeleniumInit;

public class VerifySnapDealIndex extends SeleniumInit{


	@Test
	public void verifySnapDealLogin(){
		
		Common common =new Common(driver);
	//	int numberOfFilure= 0;
		log("<br/><b><ul> JIRA Testcase ID <a href='http://192.168.2.53:8080/jira/browse/MTCREPO-669' target='_new'>MTCREPO-669</a></b></ul>");
		log("<br></br> Step 1:Go to link of <a href='www.snapdeal.com' target='_new'>Transaction switch</a> and Enter Username and password");
		log("<br></br> UserName:'"+userName+"'");
		log("<br></br> Password:'"+password+"'");
		snapDealDashBoardPage = snapDealIndexPage.login(userName, password);
		log("<br></br> Step 2:Verify Dashboard Page");
		if(snapDealDashBoardPage.isLogin()){
			log("<br><Strong><font color=#008000>Pass</font></strong>");
			System.out.println("TEST CASE PASSED");
		}else{
			log("<br><Strong>fail</strong>");
			System.out.println("TEST CASE FAILED");
		}
		
		
	}
	

}
