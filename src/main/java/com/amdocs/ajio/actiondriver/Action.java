package com.amdocs.ajio.actiondriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.amdocs.ajio.base.Base;
public class Action extends Base {
	
	public static void click(WebDriver driver, WebElement locator)
	{
		Actions action = new Actions(driver);
		action.moveToElement(locator).click().build().perform();
		System.out.println("clicked on" + locator);
	}
	
	 	 
	 public static void Wait(WebDriver driver,int sec) {
			driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
		}
	 
	 public static boolean type(WebElement ele, String text)
	    {
	        boolean flag =false;
	        try
	        {
	            flag=ele.isDisplayed();
	            ele.clear();
	            ele.sendKeys(text);
	            flag=true;
	        }
	        catch(Exception e)
	        {
	            System.out.println("location not found");
	            flag=false;
	        }
	        finally
	        {
	            if(flag)
	            {
	                System.out.println("successfully enetered");
	            }
	            else
	            {
	                System.out.println("unable to enter value");
	            }
	        }
	        return flag;
	    }
		

}
