package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	//Page Factory
	
	@FindBy(name = "username")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//input[@class='btn btn-small']")
	WebElement submitBtn;
	
	@FindBy(linkText = "Sign Up")
	WebElement signUpBtn;
	
	@FindBy(xpath = "//a[@class='navbar-brand']")
	WebElement crmLogo;
	
	
	//initialize page object
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public String ValidateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean ValidateCRMLogo() {
		return crmLogo.isDisplayed();
	}
	
	public HomePage Login(String un, String pwd) throws InterruptedException {
		username.sendKeys(un);
		password.sendKeys(pwd);
		Thread.sleep(5000);
		submitBtn.click();
		
		return new HomePage();
	}
	
}
