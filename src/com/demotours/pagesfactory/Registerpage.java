package com.demotours.pagesfactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Registerpage {

	WebDriver driver;
	
	public Registerpage(WebDriver driver) {
		//super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "firstName")
	WebElement firstname;
	
	@FindBy(name ="lastName")
	WebElement lstname;
	@FindBy(name ="phone")
	WebElement phone;
	@FindBy(id ="email")
	WebElement email;
	@FindBy (id = "userName")
	WebElement username;
	
	@FindBy(name = "address1")
	WebElement address;
	@FindBy(name = "city")
	WebElement city;
	
	@FindBy(name = "postalCode")
	WebElement postalCode;
	@FindBy(name="state")
	WebElement state;
	@FindBy(name ="country")
	WebElement country;
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(name="confirmPassword")
	WebElement conf;
	@FindBy(name="submit")
	WebElement submit;
	
	public String gettitle() {
		String title = driver.getTitle();
		return (title);
	}

	
	public void entercredentials(String fn, String ln, String ph, String email, String Address, 
			String city, String state, String pc, String country, String Usnm, String pwsd, String conpswd) {
		Registerpage rp = new Registerpage(driver);
		
		rp.firstname.sendKeys(fn);
		rp.lstname.sendKeys(ln);
		rp.phone.sendKeys(ph);
		rp.email.sendKeys(email);
		rp.address.sendKeys(Address);
		rp.city.sendKeys(city);
		rp.state.sendKeys(state);
		Select s = new Select(rp.country);
		s.selectByValue(country);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		rp.postalCode.sendKeys(pc);
		rp.username.sendKeys(Usnm);
		rp.password.sendKeys(pwsd);
		rp.conf.sendKeys(conpswd);
		System.out.println("Form entered");
		rp.submit.click();
		System.out.println("Submit clicked");
		
			
	}


}