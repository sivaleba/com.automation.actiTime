package com.demoacti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoacti.base.DriverScript;


/*
 Name: DriverScript
 Developed By: Siva
 Reviewed by: Si
 Created By: 06/29/22
 updated:
 description:This is responsible for all delivery activities. 
 */
public class Loginpage extends DriverScript{
	
  //*******************Page Elements****************************// 
	
	@FindBy(id="username")WebElement txtusername ;
	@FindBy(name="pwd")WebElement txtpassword;
	@FindBy(id="loginButton")WebElement btnlogin;
	@FindBy(xpath="//input[@type='checkbox']")WebElement chkboxKeepMeLoggedIn; 
	@FindBy(xpath="//div[@class='atLogoImg']")WebElement imglogo;
	@FindBy(linkText="Forgot your password?")WebElement linkForForgot;
    @FindBy(xpath="//span[text()='Username or Password is invalid. Please try again.']")WebElement errormsg;
	
	 //*******************Page initialization****************************//
	public Loginpage() {
		PageFactory.initElements(driver,this);
	}
	
	 //*******************Page Actions****************************//
	public String isErrorMsgDisplayed() {
		return errormsg.getText();
	}
	public void enterusername(String username) throws Exception {
		txtusername.sendKeys(username);
		Thread.sleep(2000);
	}
	public void enterpassword(String password) throws Exception {
		txtpassword.sendKeys(password);
		Thread.sleep(2000);
	}
	public void clickLogIn() throws Exception {
		btnlogin.click();
		Thread.sleep(2000);
	}
	public boolean isForgotPasswordLinkIsDisplayed() {
		return linkForForgot.isDisplayed();
	}
	public boolean logoDisplayed() {
		return imglogo.isDisplayed();
	}
    public void clickkeepMeLoggedIn() {
	chkboxKeepMeLoggedIn.click();
    }
    public String getLogInPageTitle() {
    	return driver.getTitle();
    }



}
