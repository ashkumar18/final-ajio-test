package com.amdocs.ajio.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.ajio.actiondriver.Action;
import com.amdocs.ajio.base.Base;


public class signInPage extends Base {
	@FindBy(xpath="//*[@id=\"login-modal\"]/div/div/div[2]/div/form/div[2]/div[1]/label/input")
	WebElement phoneNumber;
	
	@FindBy(xpath="//*[@id=\"login-modal\"]/div/div/div[2]/div/form/div[2]/div[2]/input")
	WebElement cont;
	
	@FindBy(xpath="//*[@id=\"login-modal\"]/div/div/div[2]/div/form/div[5]/input")
	WebElement startShopping;

	public signInPage() { 
		PageFactory.initElements(driver, this);
	}
	
	public homePage login(String uname) throws Throwable{
		Action.type(phoneNumber, uname);
		Action.click(driver, cont);
		Thread.sleep(20000);
		Action.click(driver, startShopping);
		
		return new homePage();
	

}
	}
