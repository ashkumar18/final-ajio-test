package com.amdocs.ajio.pageobjects;

import com.amdocs.ajio.actiondriver.Action;
import com.amdocs.ajio.base.Base;


import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage extends Base {
	
	@FindBy(xpath="//*[@id=\"appContainer\"]/div[1]/div/header/div[3]/div[2]/form/div/div/input")
	WebElement searchBox;
	
	@FindBy(xpath="//*[@id=\"appContainer\"]/div[1]/div/header/div[3]/div[2]/form/div/button/span")
	WebElement searchButton;
	
	@FindBy(xpath="//*[@id=\"appContainer\"]/div[1]/div/header/div[3]/div[2]/div[2]/a/div")
	WebElement Cart;
	
	@FindBy(xpath="//*[@id=\"products\"]/div[3]/div[1]/div/div[1]/a/div/div[1]/div[1]/img")
	WebElement firstItem;
	
	@FindBy(xpath="//*[@id=\"appContainer\"]/div[1]/div/header/div[3]/div[2]/div[1]/a/img")
	WebElement wishList;
	
	@FindBy(xpath="//*[@id=\"appContainer\"]/div[1]/div/header/div[1]/ul/li[3]/a")
	WebElement signOut;
	
	@FindBy(xpath = "//*[@id=\"appContainer\"]/div[2]/div/div/div[2]/div/div[3]/div/div[9]/div[1]/div[1]/div/span[2]")
	WebElement addToBag;
	
	@FindBy(xpath = "//*[@id=\"appContainer\"]/div[2]/div/div/div[2]/div/div[3]/div/div[6]/div[2]/div/div/div[3]/div")
	WebElement size8;
	
	@FindBy(xpath = "//*[@id=\"appContainer\"]/div[2]/div/div/div[2]/div/div[3]/div/div[6]/div[2]/div/div/div[4]/div")
	WebElement size9;
	
	public homePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void SearchProduct(String prod) throws Throwable {
		Action.type(searchBox, prod);
		Action.click(driver, searchButton);
	}
	
	public cart SelectProduct() throws Exception {
		Action.click(driver, firstItem);
	      Action.Wait(driver, 5);

	      ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
	     driver.switchTo().window(newTb.get(1));
	     // System.out.println("tab switched");
	      Action.Wait(driver, 5);
	      Action.click(driver, size9);
			Thread.sleep(1500);
	      Action.click(driver, addToBag);	
	      return new cart();
	}
	
	
	

}

