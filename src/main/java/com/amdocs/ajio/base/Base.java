package com.amdocs.ajio.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
    public static Properties prop;
    
    public static void loadConfig()
    {
        try {
            prop=new Properties();
            System.out.println("super construtor invoked");
            FileInputStream ip=new FileInputStream("C:\\Users\\olive\\eclipse\\java-2022-12\\eclipse\\AmdocsAQE\\firstTestProject\\Configuration\\Config.properties");
            prop.load(ip);
            }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
    public static void launch() {
    	
    	WebDriverManager.edgedriver().setup();
        String browserName=prop.getProperty("browser");
        if(browserName.contains("Chrome"))
        {
            driver=new ChromeDriver();
        }
        else if(browserName.contains("Edge"))
        	
        {
            driver=new EdgeDriver();
        }
        
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(prop.getProperty("url"));
    }
    
    public static String getUN() {
        return prop.getProperty("username");
       }
       
      
}
