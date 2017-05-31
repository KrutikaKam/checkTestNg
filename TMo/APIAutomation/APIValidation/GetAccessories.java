package APIValidation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringWriter;
import java.sql.Driver;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class GetAccessories {
	private static final DocumentBuilder JSONValue = null;

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, JSONException, ParseException {
	WebDriver driver =  new FirefoxDriver();
	//String sresourceURL = "https://tmob-ecommerce-unlame-waxplant.cfapps.io/catalog/getAllAccessories/";
	String sresourceURL = "http://10.13.67.174:8080/Restapi/rest/api/applications";
	driver.manage().window().maximize();
	driver.get(sresourceURL);
	WebElement sResponsetxt = driver.findElement(By.xpath("//pre"));
	String sResponse = sResponsetxt.getText();
	System.out.println(sResponse);
	
	
	
	/*String strCurretDirPath = System.getProperty("user.dir");
	try (PrintStream out = new PrintStream(new FileOutputStream(strCurretDirPath + "\\Response.json"))) {
	    out.print(sResponse);
	}
	DocumentBuilderFactory fact= DocumentBuilderFactory.newInstance();
	DocumentBuilder docB= fact.newDocumentBuilder();
	Document doc = docB.parse(strCurretDirPath + "\\Response.json");
	*/

	/*JSONObject obj = (JSONObject)JSONValue.parse(sResponse);
	JSONArray arr = (JSONArray)obj.get("Records");
	for (int i = 0; i < arr.length(); i++) {
	 	   // String AppID = (String) jsonObject.get("App_ID");
	    String AppName = (String) obj.get("App_Name");
	    System.out.println(AppName);
	    //System.out.println("Person " + i +" : App_ID is = "+ AppID + ", App_Name = " + AppName);
	}
	*/
/*	JSONParser parser = new JSONParser();
	JSONObject jsonObject = (JSONObject) parser.parse(sResponse);
	String firstName = (String) jsonObject.get("App_ID");
	 System.out.println("The first name is: " + firstName);
*/
	
	JSONArray json = (JSONArray) new JSONParser().parse(sResponse);
       System.out.println(json);

/*
	JSONObject jsonObj = (JSONObject) parser.parse(response);
	 StringWriter out = new StringWriter();
	 obj.getJSONObject(arg0)
     
     String jsonText = out.toString();
     System.out.print(jsonText);*/
	/*
	 JSONParser parser = new JSONParser();
	 Object obj = parser.parse(sResponse);
     JSONArray array = (JSONArray)obj;
     JSONObject obj2 = (JSONObject)array.get(1);

     System.out.println(obj2.get("1"));  */
	
	}	
	
}	

