package com.demotours.pagesfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	@FindBy(xpath="//a[text()='SIGN-ON']")
	WebElement Signon;
	
	@FindBy(xpath = "//a[text()='REGISTER']")
	WebElement register;
	
	

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
				
		}
	public String getdrivertitle() {
		
		String title;
		title = driver.getTitle();
		return(title);
	}
	
	public void clickSignon() {
		this.Signon.click();
		System.out.println("Signon clicked");
		    
	}
	
	public void clickregister() {
		
		this.register.click();
		System.out.println("Register bittun is clicked");
		
	}
	}

	
