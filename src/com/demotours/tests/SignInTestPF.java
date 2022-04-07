package com.demotours.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demotours.pagesfactory.HomePage;
import com.demotours.pagesfactory.LoginPage;
import com.demotours.pagesfactory.SignInPage;

public class SignInTestPF {

	WebDriver driver;
	public String driverpath = "//Users//mousumighosh//Selenium//Driver//chromedriver";
	
	@BeforeTest
	public void launchchrome()
	{
		System.setProperty("webdriver.chrome.driver",driverpath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		
	}
	
	@Test(priority = 0)
	public void clickonSignIn() {
		 HomePage hm = new HomePage(driver);
		 hm.clickSignon();
		
	}
	
	@Test(priority = 1)
	public void enterCredentialsandsubmit() {
		SignInPage sn = new SignInPage(driver);
		Assert.assertEquals(sn.getPageTitle(),"Sign-on: Mercury Tours");
		System.out.println("Successfully on SignIn page");
		sn.clicksubmit("mousumi.nit@gmail.com", "12345");
	}
	
	@Test(priority = 2)
	public void signoff() {
		LoginPage ln = new LoginPage(driver);
		Assert.assertEquals(ln.verifyTitle(),"Login: Mercury Tours");
		System.out.println("Sucessfully on login page");
		ln.clicksignoff();
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
		System.out.println("Browser closed");
	}
}
