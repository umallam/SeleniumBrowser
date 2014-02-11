package com.seek.util;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class browser {
	
	public WebDriver driver;
	
	public void openbrowser(){
		String brsname="firefox";
		openbrowser(brsname);
	}
	
	public void openbrowser(String browsername){
		
		if(browsername.equalsIgnoreCase("firefox"))
		  {
		   driver = new FirefoxDriver();
		  }
		  else if((browsername.toLowerCase()).matches("ie(.*)"))
		  {
		// Update the driver path with your location
		   System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//src//data//IEDriverServer.exe");
		   driver = new InternetExplorerDriver();
		  }
		  else if(browsername.equalsIgnoreCase("chrome"))
		  {
		// Update the driver path with your location
		   System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//data//chromedriver.exe");
		   driver = new ChromeDriver();
		  }else{
			  driver = new HtmlUnitDriver(true);
		  }
		
		  driver.manage().window().maximize();
	}
	
	
	public void openurl(String url){
		driver.get(url);
	}
	
	/*	
	public void openurl(){
		Properties config= new Properties();
		try{
			FileInputStream fs = new FileInputStream(OR.config_path);
			config.load(fs);
			} catch (Exception e){
				System.out.println("File not found");
			}
		openurl(config.getProperty("baseurl"));
	}
	*/
	
	public void closebrowser(){
		driver.close();
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
        // browser br = new browser();
        // br.openbrowser();
        // br.openurl("linkedin.com");
	}

}
