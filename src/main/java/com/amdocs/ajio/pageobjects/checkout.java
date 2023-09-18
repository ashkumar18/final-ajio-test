package com.amdocs.ajio.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.ajio.actiondriver.Action;
import com.amdocs.ajio.base.Base;


public class checkout extends Base {
	
	@FindBy(xpath = "//*[@id=\"card_number\"]")
	WebElement cardNumber;
	
	@FindBy(xpath = "//*[@id=\"name_on_card\"]")
	WebElement cardName;
	
	@FindBy(xpath = "//*[@id=\"form_id\"]/div[4]/div/div[1]/div/div/div/div")
	WebElement mm;
	
	@FindBy(xpath = "//*[@id=\"form_id\"]/div[4]/div/div[2]/div/div/div/span/i/svg")
	WebElement yy;
	
	@FindBy(xpath = "//*[@id=\"cvv\"]")
	WebElement cvv;
	
	@FindBy(xpath = "//*[@id=\"form_id\"]/div[6]/div/button")
	WebElement payMoney;
	
	public checkout() {
		PageFactory.initElements(driver, this);
	}
	
	public void checkoutProcess() throws Throwable {
		Action.click(driver, cardNumber);
		Thread.sleep(1000);
		Action.type(cardNumber, "1234 1234 1234 1234");
		Action.click(driver, cardName);
		Action.type(cardName, "Ashwani Kumar");
	//	Action.click(driver, useThisPayment);
		Action.Wait(driver, 7);
		
		//Action.click(driver, placeYourOrder);
	}
	
	
	
	
	
	

}
