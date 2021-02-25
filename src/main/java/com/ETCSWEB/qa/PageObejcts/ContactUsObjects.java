package com.ETCSWEB.qa.PageObejcts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsObjects {
	
	
	private WebDriver driver;
	public ContactUsObjects(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy (xpath="//input[@id='name']")
	private WebElement Name; 
	
	@FindBy(xpath="//span[@id='msgcontact_name']")
	private WebElement nameErrorMessage;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement Email;
	
	@FindBy(xpath="//span[@id='msgcontact_email']")
	private WebElement emailErrorMessage;
	
	@FindBy(xpath="//input[@id='mobile']")
	private WebElement mobile;
	
	@FindBy(xpath="//span[@id='msgcontact_mobile']")
	private WebElement mobileErrorMessage; 
	
	@FindBy(xpath="//select[@id='queryCategory']")
	private WebElement queryCategory;
	
	@FindBy(xpath="//span[@id='msgcontact_category']")
	private WebElement queryCategoryErrorMsg;
	
	@FindBy(xpath="//textarea[@id='queryText']")
	private WebElement queryText;
	
	@FindBy(xpath="//span[@id='msgcontact_message']")
	private WebElement queryTextErrorMsg;
	
	@FindBy(xpath="//button[@id='submitQuery']")
	private WebElement submitbutton;
	
	  
	  public WebElement Name() {
		  return Name;
	  }
	  
	  public WebElement nameErrorMsg() {
		  return nameErrorMessage;
	  }
	  
	  public WebElement Email() {
		  return Email;
	  }
	  
	  public WebElement emailErrorMsg() {
		  return emailErrorMessage;
	  }
	  
	  public WebElement Mobile() {
		  return mobile;
	  }
	  
	  public WebElement mobileErrorMsg() {
		  return mobileErrorMessage;
	  }
	  
	  public WebElement querycategory() {
		  return queryCategory;
	  }
	  
	  public WebElement queryCategoryErrorMsg() {
		  return queryCategoryErrorMsg;
	  }
	  
	  public WebElement querytext() {
		  return queryText;
	  }
	  
	  public WebElement queryTextErrorMsg() {
		  return queryTextErrorMsg;
	  }
	  
	  public WebElement Submit() {
		  return submitbutton;
	  }

	
}
