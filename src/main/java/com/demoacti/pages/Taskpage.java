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
public class Taskpage extends DriverScript {
	
	 //*******************Page initialization****************************//
		public Taskpage() {
			PageFactory.initElements(driver,this);
		}
	  //*******************Page Elements****************************// 
		
	@FindBy(xpath ="//div[@class='title ellipsis']") WebElement buttonaddnew;
	@FindBy(xpath="//div[@class='item createNewCustomer']") WebElement  itemnewcustomer;
	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")WebElement textboxenterCustomername;
	@FindBy(xpath="//div//textarea[@placeholder='Enter Customer Description']")WebElement textareadescription;
	@FindBy(xpath="//div[contains(text(),'Create Customer')]")WebElement buttoncreatecustomer;
	@FindBy(xpath="//span[@class='innerHtml']")WebElement textsuccessmessage;
	@FindBy(xpath="(//input[@placeholder='Start typing name ...'])[1]")WebElement textboxstarttyping;
	@FindBy(xpath="//span[@class='highlightToken']")WebElement searchedcustomer;
	@FindBy(xpath="//div[@class='titleEditButtonContainer']//div[@class='editButton']")WebElement editbutton; 
	@FindBy(xpath="(//div[@class='action'])[1]")WebElement buttonactions;  
	@FindBy(xpath="(//div[@class='deleteButton'])[1]")WebElement buttondelete;
	@FindBy(xpath="//span[contains(text(),'Delete permanently')]")WebElement buttondeletepermanently;
	
	//"(//div[@class='actionButtonWrapper']//div[@class='action'])[1]"  buttonaction;
	//(//div[@class='dropdownContainer actionsMenu']//div[@class='deleteButton'])[1]    deleteaction
	//*******************Page Actions****************************//
	
	
	public void searchcustomerusingtextbox(String customername) {
		textboxstarttyping.sendKeys(customername);
	}
	public void clickoncustomername() {
		searchedcustomer.click();
	}
	public void clickoneditbutton() {
		editbutton.click();
	}
	public void clickonactions() {
		buttonactions.click();
	}
	public void clickondeletebutton() {
		buttondelete.click();
	}
	public void deletepermanently() {
		buttondeletepermanently.click();
	}
	
	public void clickonaddcustomer() {
		buttonaddnew.click();
		
	}
	public void clickonnewcustomer() {
		itemnewcustomer.click();
	}
	public void entercustomername(String name) {
		textboxenterCustomername.sendKeys(name);
	}
	public void enterDescription(String des) {
		textareadescription.sendKeys(des);
	}
	public void clickoncreatenewcustomeraccount() {
		buttoncreatecustomer.click();
	}
	public String getsuccessmessage() {
		return textsuccessmessage.getText();
	}
	
	public String gettaskpagetitle() {
		return driver.getTitle();
	}
	public void entercustomertype(String customername) {
		textboxstarttyping.sendKeys(customername);
	}
	
}
