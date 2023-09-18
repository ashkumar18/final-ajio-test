package com.amdocs.ajio.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.ajio.actiondriver.Action;
import com.amdocs.ajio.base.Base;


public class indexPage extends Base {

	@FindBy(xpath="//*[@id=\"appContainer\"]/div[1]/div/header/div[1]/ul/li[1]/span")
	WebElement signIn;
	
	public indexPage() {
		PageFactory.initElements(driver, this);
	}
	
	public signInPage clickSignIn() throws Throwable{
		
		Action.click(driver, signIn);
		return new signInPage();		
	}
}
