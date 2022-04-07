package com.demotours.pagesfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	
	
	WebDriver driver;
	 
	@FindBy(name="userName")
	WebElement Username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(name = "submit")
	WebElement submit;
	
	public SignInPage(WebDriver driver) {
		//super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

public void setUsername(String uname) {
	this.Username.sendKeys(uname);
	System.out.println("Usernmae is entered");
	
}
	
public void setPassword(String pswd) {
	this.password.sendKeys(pswd);
	System.out.println("Password is entered");
}

public void clicksubmit(String username , String password) {
	this.setUsername(username);
	this.setPassword(password);
	this.submit.click();
	System.out.println("Submit is clicked");
	
}
public String getPageTitle() {
	String title = driver.getTitle();
	return (title);
}

}
