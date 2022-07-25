package com.demoacti.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest{
	
	@Test
	public void testLoginpage() {
	String actual="actiTIME - Login";
	String expected = loginpage.getLogInPageTitle();
	Assert.assertEquals(actual,expected);
	}
	@Test
	public void testlogin() {
		String expected=loginpage.getLogInPageTitle();
		Assert.assertTrue(expected.contains("Login"));
		
	}
	@Test
	public void testForgotPasswordLiknDispalyed() {
		boolean flag=loginpage.isForgotPasswordLinkIsDisplayed();
		Assert.assertTrue(flag);
	}
	@Test
	public void testLogoDisplayed() {
		boolean flag=loginpage.logoDisplayed();
		Assert.assertTrue(flag);
	}
	@Test
	public void testloginFunction() throws Exception {
		loginpage.enterusername("admin");
    	loginpage.enterpassword("manager");
		//loginpage.clickkeepMeLoggedIn();
		loginpage.clickLogIn();
	}
	
	
}
