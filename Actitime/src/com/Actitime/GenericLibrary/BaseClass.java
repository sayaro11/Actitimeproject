package com.Actitime.GenericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.Actitime.ObjectRepostory.HomePage;
import com.Actitime.ObjectRepostory.LoginPage;

public class BaseClass {
	public static WebDriver driver;
	public  FileLibrary f;
	
@BeforeSuite
 public void databaseConnection() {
	Reporter.log("database connected",true);

	
}
	@BeforeTest
		public void LaunchBrowesr() throws IOException {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			f=new FileLibrary();
			String URL=f.readDataFromePropertyFile("url");
			driver.get(URL);
			Reporter.log("Browser is Launched successfully",true);
			
			
		}
		@BeforeMethod
		public void login() throws IOException {
			
			LoginPage lp=new LoginPage(driver);
			String un=f.readDataFromePropertyFile("username");
			lp.getUsernamefield().sendKeys(un);
			  
			String pw=f.readDataFromePropertyFile("password");
			lp.getPasswordfield().sendKeys(pw);		
			
			lp.getSelectcheckbox().click();
			lp.geLoginbutton();
			Reporter.log("Logges in sucessfully",true);
	
		}
		@AfterMethod
		public void logout() {
			HomePage hp= new HomePage(driver);
			hp.getLogoutlink();
			Reporter.log("logoout sucessfully",true);
			
		}
		@AfterTest
		public void closeBrowser() {
			driver.close();
			Reporter.log("logout sucessfully",true);
			
			
			
		}
		}


