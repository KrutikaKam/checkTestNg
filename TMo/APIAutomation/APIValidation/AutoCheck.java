package APIValidation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


import java.net.URL;


public class AutoCheck {
                
                //authentication
                
                public static final String USERNAME = "gm_sl";
                  public static final String ACCESS_KEY = "288e535b-2c49-46f2-b089-127c67a22038";
                  public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

                  public static void main(String[] args) throws Exception {
                                  
                                  
                                  
                                 //DesiredCapabilities caps = DesiredCapabilities.iphone();
                
                             /*     caps.setCapability("appiumVersion", "");
                                  caps.setCapability("deviceName","iPhone 6");
                                  caps.setCapability("deviceOrientation", "portrait");
                                  caps.setCapability("platformVersion","9.2");
                                  caps.setCapability("platformName", "iOS");
                                  caps.setCapability("browserName", "safari");
                                // caps.setCapability("app","sauce-storage:demo");
                                  */
                                  
                                  DesiredCapabilities caps = DesiredCapabilities.chrome();
                          //        caps.setCapability("platform", "Windows XP");
                                  caps.setCapability("version", "43.0");
                      WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
                      driver.get("https://wiki.saucelabs.com/display/DOCS/Common+Error+Messages");
                                  
                                  
                    driver.quit();
                  }
                }
