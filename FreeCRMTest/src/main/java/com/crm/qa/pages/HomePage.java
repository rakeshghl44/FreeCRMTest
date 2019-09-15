package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{
	
	LoginPage loginPage;
	
	@FindBy(xpath="//td[contains(text(),'User: Thripio Renner')]")
	WebElement userNameLabel;
	
	@FindBy(xpath= "//a[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath= "//a[contains(text(),'deals')]")
	WebElement dealsLink;
	
	public HomePage() {
		PageFactory.initElements(driver,this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyCorrectUsername() {
		return userNameLabel.isDisplayed();	
		
	}
	public ContactsPage clickOnContactLink() {
		contactsLink.click();
		return new ContactsPage();
	}
	

}
