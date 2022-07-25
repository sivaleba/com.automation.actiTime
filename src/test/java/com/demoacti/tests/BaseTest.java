package com.demoacti.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.demoacti.base.DriverScript;
import com.demoacti.pages.EnterTimePage;
import com.demoacti.pages.Loginpage;
import com.demoacti.pages.Taskpage;

public class BaseTest extends DriverScript{

	Loginpage loginpage;
	EnterTimePage entertimepage;
	Taskpage taskpage;
	@BeforeMethod
	public void setup() {
		launchbrowser();
		 loginpage=new Loginpage();
		 entertimepage= new EnterTimePage();
		 taskpage = new Taskpage();
		 
		}
	@AfterMethod
	public void teardown() {
		quitDriver();
	}
}
