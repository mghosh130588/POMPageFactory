package com.demotours.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demotours.pagesfactory.HomePage;
import com.demotours.pagesfactory.RegisterconformPage;
import com.demotours.pagesfactory.Registerpage;
import com.demotours.pagesfactory.SignInPage;

public class RegisterTestPF {
	
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
	public void clickregister0() {
		HomePage hm = new HomePage(driver);
		hm.clickregister();
	}

	@Test(priority = 1 )
	public void verifytitle() {
		Registerpage rp = new Registerpage(driver);
		Assert.assertEquals(rp.gettitle(),"Register: Mercury Tours");
		System.out.println("Successfully on Register page");
	}
	
	@Test(priority = 2)
	public void enterform() {
		Registerpage rp = new Registerpage(driver);
		rp.entercredentials("MousumiTest", "GhoshTest", "31645719089", "test.test@gmail.com", "Spuelderbos 27", "Hoofddorp", "Hoofddorp", "2134 JJ", "NETHERLANDS", "test.test@gmail.com", "12345", "12345");

	}
	
	@Test(priority = 3)
		public void verifyusername () {
		RegisterconformPage rcm = new RegisterconformPage(driver);
		System.out.println(rcm.getusername());
		rcm.clicklogout();
		}
		
		
	@AfterTest
	public void closebrowser() {
		driver.close();
		
	}
	
}
