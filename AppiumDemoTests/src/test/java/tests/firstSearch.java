package tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class firstSearch extends BaseClass{
	
	@Test
	public void searchAji() throws InterruptedException, IOException {
		
		// creates a toggle for the given test, adds all log events under it    
        ExtentTest googleTest = extent.createTest("Google Search Test", "Google Search Test in Chrome Browser");
        googleTest.log(Status.INFO, "Google Search Test Started");
        
		driver.get("http://google.com");
		googleTest.log(Status.PASS, "Navigate to http://google.com");
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Aji Vinister");
		googleTest.log(Status.PASS, "Enter Search text 'Aji Vinister' ");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys(Keys.ENTER);
		googleTest.log(Status.PASS, "Do Keyboard action Enter ");
		Thread.sleep(6000);
		googleTest.addScreenCaptureFromPath("GoogleSearch.png");
		
		System.out.println("Google Results for Aji Vinister displayed!");
		googleTest.log(Status.INFO, "Google Search Test is Completed' ");
	}
	
	@Test
	public void demoOrgHRM() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@name='txtUsername']")).sendKeys("Admin");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys("admin123");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys(Keys.ENTER);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id='welcome']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
	    Thread.sleep(5000);
	}
	

}
