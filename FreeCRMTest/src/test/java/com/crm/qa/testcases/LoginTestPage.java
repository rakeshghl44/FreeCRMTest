package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginTestPage extends TestBase{
		
	LoginPage loginPage;
	HomePage homepage;
	
	public LoginTestPage() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		
		loginPage = new LoginPage();
	}
	
	@Test (priority = 0)
	public void loginPageTitleTest() {
		String title = loginPage.ValidateLoginPageTitle();
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");
	}
	@Test (priority = 1)
	public void crmLogoImageTest() {
		boolean flag = loginPage.ValidateCRMLogo();
		Assert.assertTrue(flag);
	}
	
	@Test (priority = 2)
	public void loginTest() throws InterruptedException
	{
		homepage = loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@AfterMethod	
	public void closeBrowser() {
		driver.quit();
	}
	

}
