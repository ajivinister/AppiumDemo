package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
public class ExtentReportAppiumDemo {
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	
	@BeforeSuite
	public void extRepSetup()
	{
		htmlReporter = new ExtentHtmlReporter("extent.html");
	    
        // create ExtentReports and attach reporter(s)
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
	}
	
	@AfterSuite
	public void extRepTearDown()
	{
		// calling flush writes everything to the log file
        extent.flush();
	}

}
