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
public class EnterTimePage extends DriverScript{
	
	 //*******************Page initialization****************************//
	public EnterTimePage() {
		PageFactory.initElements(driver,this);
	}
	//*******************Page Elements****************************// 
	@FindBy(xpath="//a[@class='content tasks']")WebElement menutask;
	@FindBy(id="logoutLink")WebElement linkLogOut;
	                                     
	//*******************Page Actions****************************//
	public void task() {
		menutask.click();
	}
	
	
	
	public void logout() {
		linkLogOut.click();
	}
	public String getEnterTimeTittle() {
		return driver.getTitle();
	}
}
