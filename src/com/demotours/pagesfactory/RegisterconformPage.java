package com.demotours.pagesfactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterconformPage {
	WebDriver driver;
	
	public RegisterconformPage(WebDriver driver) {
		//super();
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}

	@FindBy (xpath ="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/font/b")
	WebElement username;
	
	@FindBy (xpath="//a[text()='SIGN-OFF']")
	WebElement Signoff;

	public String getusername() {
		String uname = username.getText();
		return uname;
	}
	
	public void clicklogout() {
		Signoff.click();
		System.out.println("Sign off");
	}

}
