package APIValidation;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

import javax.xml.parsers.ParserConfigurationException;

import org.json.simple.JSONArray;
import org.json.JSONException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;

import com.IO.Xls_Reader;

public class tmoCheck {
@Test
	public static void main() throws ParserConfigurationException, SAXException, IOException, JSONException, ParseException {
		
	WebDriver driver =  new FirefoxDriver();
	String sresourceURL = "https://tmob-ecommerce-unlame-waxplant.cfapps.io/catalog/getAllAccessories/";

	driver.manage().window().maximize();
	driver.get(sresourceURL);

	
		/*Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir")+"\\APIAutomation\\config\\TestData.xlsx");
		String sresourceURL= xls.getCellData("Input", "Resource URL", 2);
		
			
		WebDriver driver =  new FirefoxDriver();
		//String sresourceURL = "https://tmob-ecommerce-unlame-waxplant.cfapps.io/catalog/getAllAccessories/";
	
		driver.manage().window().maximize();
		driver.get(sresourceURL);
		WebElement sResponsetxt = driver.findElement(By.xpath("//pre"));
		String sResponse = sResponsetxt.getText();
		int rowCount = xls.getRowCount("Input");
		
		//copy 
		String strCurretDirPath = System.getProperty("user.dir");
		try (PrintStream out = new PrintStream(new FileOutputStream(strCurretDirPath + "\\Response.json"))) {
		    out.print(sResponse);
		}
		 final String filepath = strCurretDirPath + "\\Response.json";
		 FileReader reader = new FileReader(filepath);
		 JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);

			// get an array from the JSON object
			JSONArray lang= (JSONArray) jsonObject.get("Records");
			
			// take the elements of the json array
			for(int i=0; i<lang.size(); i++){
				System.out.println("The " + i + " element of the array: "+lang.get(i));
			}
	
			ArrayList<String> sRespName = new ArrayList<String>();
			ArrayList<String> sRespIID = new ArrayList<String>();
			
			@SuppressWarnings("unchecked")
			Iterator i = ((Iterable<Throwable>) lang).iterator();
			
			// take each value from the json array separately
			while (i.hasNext()==true) {
			
				for(int j=2;j<=lang.size()+2; j++)
				{
					if(i.hasNext()==true)
					{
						JSONObject innerObj = (JSONObject) i.next();
						
						String sAppName = (String) innerObj.get("App_Name");
						sRespName.add(sAppName);
						String sAppID = (String) innerObj.get("App_ID");
						sRespIID.add(sAppID);
						
						
						
						xls.setCellData("AutomaticsAPI", "App_ID", j, sAppID);
						xls.setCellData("AutomaticsAPI", "App_Name", j, sAppName);
						String sInputAppName= xls.getCellData("Input", "InputApp_Name", j);
						String sInputAppID = xls.getCellData("Input", "InputApp_ID", j);
						if(sInputAppName.equals(sAppName) && sInputAppID.equals(sAppID))
						{
							xls.setCellData("AutomaticsAPI", "Status", j, "Pass");
						}
						else
						{
							xls.setCellData("AutomaticsAPI", "Status", j, "Fail");
						}
						
						
						System.out.println(innerObj.get("App_ID"));
						System.out.println("AppID is "+ innerObj.get("App_ID") + 
								" AppName " + sAppName);
					}
				}
			
			}
		
			driver.quit();
	}
*/
}
}
