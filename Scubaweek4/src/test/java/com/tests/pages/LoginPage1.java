/**
 * 
 */
package com.tests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Lenovo
 *PageObjectmodel Page Factory implementation
 */
public class LoginPage1 {
	WebDriver driver;
	@FindBy(id="txtUsername") 
	WebElement username;
	@FindBy(how=How.ID, using="txtPassword") 
	@CacheLookup
	WebElement password;
	@FindBy(how=How.XPATH, using="//input[@id='btnLogin']") 
	WebElement Login;
	
	
	public LoginPage1(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void LoginHRM_new(String uid,String pswd) {
		username.sendKeys(uid);
		password.sendKeys(pswd);
		Login.click();
		
	}

}
