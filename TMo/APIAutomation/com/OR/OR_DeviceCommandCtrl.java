package com.OR;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.IO.Xls_Reader;

public class OR_DeviceCommandCtrl {
	Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir")+"\\APIAutomation\\config\\TestData.xlsx");
	
	String sCtrlUrl = xls.getCellData("Input", "Controller", 2);
	String sReqType = xls.getCellData("Input", "InputRequestType", 2);
	/*---------------------------
	 * Link objects add below
	 *---------------------------*/
	
	//a[@class='toggleOperation' and contains(text,'')]
	
	@FindBy(xpath="//a[contains(text(),'sCtrlUrl'")
	public static WebElement lnkSelectController;
	
	//li[@id='device-command-controller_getDeviceDetailsUsingGET'] 
	//@FindBy(xpath="//a[@class='toggleOperation' and contains(text,sReqType)]")
	@FindBy(xpath="//li[@id='device-command-controller_getDeviceDetailsUsingGET']")
	public static WebElement btnRequestType;

	@FindBy(xpath="//*[@id='device-command-controller_getDeviceDetailsUsingGET_content']//input[@name='imei']")
	public static WebElement inpIMEI;
	
	@FindBy(xpath="//*[@id='device-command-controller_getDeviceDetailsUsingGET_content']//input[@type='button']")
	public static WebElement btnTryOut;
	
	@FindBy(xpath="//div[@class='block response_body json']/pre/code")
	public static WebElement txtStatusCode;
	
	@FindBy(xpath="//div[@class='block response_body json']/pre/code")
	public static WebElement txtResponseCode;
	
	WebDriver driver;
	
	public OR_DeviceCommandCtrl(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


}

