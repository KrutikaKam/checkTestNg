package APIValidation;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

import javax.xml.parsers.ParserConfigurationException;

import org.json.JSONException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.xml.sax.SAXException;

import com.IO.Xls_Reader;
import com.OR.OR_DeviceCommandCtrl;

public class DeviceControllerGet {
	public static void main() throws ParserConfigurationException, SAXException, IOException, JSONException, ParseException {
	Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir")+"\\APIAutomation\\config\\TestData.xlsx");
	String sresourceURL= xls.getCellData("Input", "Resource URL", 2);
	
	WebDriver driver =  new FirefoxDriver();
	OR_DeviceCommandCtrl oR_DeviceCommandCtrl = PageFactory.initElements(driver,OR_DeviceCommandCtrl.class);
	
	//String sresourceURL = "https://tmob-ecommerce-unlame-waxplant.cfapps.io/catalog/getAllAccessories/";

	driver.manage().window().maximize();
	driver.get(sresourceURL);
	
	oR_DeviceCommandCtrl.lnkSelectController.click();
	
	oR_DeviceCommandCtrl.btnRequestType.click();
	
	String sIMEI = xls.getCellData("Input", "IMEI", 2);
	
	oR_DeviceCommandCtrl.inpIMEI.sendKeys(sIMEI);
	
	oR_DeviceCommandCtrl.btnTryOut.click();
	
	//Status code validation
	String sCode = oR_DeviceCommandCtrl.txtStatusCode.getText();
	if(sCode.contains("200"))
	{
		System.out.println("Success response code");
	}
	if(sCode.contains("404"))
	{
		System.out.println("Forbidden");
	}

	//fetch response
	String sResponse= oR_DeviceCommandCtrl.txtResponseCode.getText();
	String strCurretDirPath = System.getProperty("user.dir");
	try (PrintStream out = new PrintStream(new FileOutputStream(strCurretDirPath + "\\Response.json"))) {
	    out.print(sResponse);
	}
	 final String filepath = strCurretDirPath + "\\Response.json";
	 FileReader reader = new FileReader(filepath);
	 JSONParser jsonParser = new JSONParser();
	 JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);

	 
	
	
	
	
	
	
	
}
}