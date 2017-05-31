package APIValidation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;

import java.net.URL;


public class AppCheck3 {
	
	//authentication
	
	 public static final String USERNAME = "tmo_retail_inventory_serialization";
	  public static final String ACCESS_KEY = "39fe94e8-5fec-427d-a5dd-1d5da7ab1bdf";
	  public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";

	  public static void main(String[] args) throws Exception {
		  
		  
		  
		  DesiredCapabilities caps = DesiredCapabilities.iphone();
	
		  caps.setCapability("appiumVersion", "");
		  caps.setCapability("deviceName","iPhone 6");
		  caps.setCapability("deviceOrientation", "portrait");
		  caps.setCapability("platformVersion","9.2");
		  caps.setCapability("platformName", "iOS");
		 caps.setCapability("browserName", "");
		  //caps.setCapability("app","https://github.com/KrutikaKam/TestProject/raw/master/demo.ipa");
		  
		  caps.setCapability("app","https://github.com/KrutikaKam/TestProject/raw/master/helloworld.ipa");
		  
		  
	 
	      AppiumDriver driver = new IOSDriver(new URL(URL), caps);
	     // driver.get("https://wiki.saucelabs.com/display/DOCS/Common+Error+Messages");
	      driver.quit();
	  }
	}


