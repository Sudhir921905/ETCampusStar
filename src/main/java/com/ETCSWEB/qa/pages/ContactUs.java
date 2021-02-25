package com.ETCSWEB.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ETCSWEB.qa.PageObejcts.ContactUsObjects;
import com.ETCSWEB.qa.PageObejcts.HeaderObjects;

public class ContactUs {
	
	private WebDriver driver;
	ContactUsObjects contactus;
	HeaderObjects headerObj;
	public ContactUs(WebDriver driver) {
		this.driver=driver;
		contactus=PageFactory.initElements(driver, ContactUsObjects.class);
		headerObj=PageFactory.initElements(driver, HeaderObjects.class);
	}
	
	public boolean fields() {
		headerObj.contactUs().click();
		contactus.Name().isDisplayed();
		contactus.Email().isDisplayed();
		contactus.Mobile().isDisplayed();
		contactus.querytext().isDisplayed();
		contactus.querycategory().isDisplayed();
		contactus.Submit().isEnabled();
		return true;
	}
	
	public boolean errorMsg() {
		headerObj.contactUs().click();
		contactus.Submit().click();
		contactus.nameErrorMsg().isDisplayed();
		contactus.emailErrorMsg().isDisplayed();
		contactus.mobileErrorMsg().isDisplayed();
		contactus.queryCategoryErrorMsg().isDisplayed();
		contactus.queryTextErrorMsg().isDisplayed();
		return true;
	}
	
	public String FormsubmitErrormessgae(String Name,String Email, String query) {
		headerObj.contactUs().click();
		contactus.Name().sendKeys(Name);
		contactus.Email().sendKeys(Email);
		Select select=new Select(contactus.querycategory());
		select.selectByVisibleText("Issue with registration");
		contactus.querytext().sendKeys(query);
		contactus.Submit().click();
		String Msg = contactus.mobileErrorMsg().getText();
		return Msg;
		
	}

}
