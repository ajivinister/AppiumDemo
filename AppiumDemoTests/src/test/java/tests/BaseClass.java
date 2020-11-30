package tests;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass extends ExtentReportAppiumDemo {
	
	AppiumDriver<MobileElement> driver;

	@BeforeTest
	public void setup()  {
		try {
			DesiredCapabilities cap = new DesiredCapabilities();
			
			cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
			cap.setCapability(MobileCapabilityType.UDID, "J5AAGF00C850D5D");
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "AZEN");
			cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
			cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
			cap.setCapability(MobileCapabilityType.BROWSER_VERSION, "87.0.4280.66");
			cap.setCapability("chromedriverExecutable", "C:\\Users\\ajivi\\Desktop\\sdk-root\\chromedriver_87\\chromedriver.exe");
			//cap.setCapability("appPackage","org.mozilla.firefox");
			//cap.setCapability("appActivity","org.mozilla.firefox.App");
			//cap.setCapability(MobileCapabilityType.BROWSER_VERSION, "83.1.0");
			
			
			
			
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AppiumDriver<MobileElement>(url, cap);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
		catch(Exception ex){
			System.out.println("Cause is: "+ex.getCause());
			System.out.println("Message is: "+ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	@Test
	public void sampleTest()
	{
		System.out.println("Chrome Test is OK");
	}

	@AfterTest
	public void teardown()  {
		driver.close();
		driver.quit();
	}

}
