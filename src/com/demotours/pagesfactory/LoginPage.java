package com.demotours.pagesfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	

	WebDriver driver;
	
	@FindBy(xpath = "//a[text()='SIGN-OFF']")
	WebElement Signoff;
	
	public LoginPage(WebDriver driver) {
		//super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String verifyTitle() {
		String title = driver.getTitle();
		return(title);
	}
	
	public void clicksignoff() {
		this.Signoff.click();
		System.out.println("Signoff clicked");
	}
}
