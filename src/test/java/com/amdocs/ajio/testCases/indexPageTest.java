package com.amdocs.ajio.testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amdocs.ajio.actiondriver.Action;
import com.amdocs.ajio.base.Base;
import com.amdocs.ajio.pageobjects.cart;
import com.amdocs.ajio.pageobjects.checkout;
import com.amdocs.ajio.pageobjects.homePage;
import com.amdocs.ajio.pageobjects.indexPage;
import com.amdocs.ajio.pageobjects.signInPage;

public class indexPageTest extends Base {

	private indexPage indexPg;
	
	
	 @BeforeMethod
	    public void setup() {
		 	loadConfig();
			launch();
	      
	        indexPg = new indexPage();
	    }
	  
	 @Test
	    public void loginTest() throws Throwable {
	        signInPage signin= indexPg.clickSignIn();
	        homePage home= signin.login(getUN());
	        Thread.sleep(2000);
	  //   homePage home= new homePage();  
		 home.SearchProduct("shoes");
		 Thread.sleep(2000);
	      cart item=home.SelectProduct();
	      item.proceedToBuy();
	      Thread.sleep(1500);
	      checkout check=new checkout();
	      check.checkoutProcess();
	      
	        
	        
	        
	        
	        
	    }
}
