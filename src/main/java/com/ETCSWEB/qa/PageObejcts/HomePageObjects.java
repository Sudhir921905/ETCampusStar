package com.ETCSWEB.qa.PageObejcts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObjects {

private WebDriver driver;
public HomePageObjects(WebDriver driver) {
	this.driver=driver;	
	 
		// TODO Auto-generated constructor stub
	}
@FindBy(xpath = "//span/a[contains (@href,'78783849.cms')]")
 private WebElement ProgrameTandC;
 
 @FindBy(xpath="//input[@id= 'reg_email']")
 private WebElement emailid;
 
 @FindBy(xpath="//input[@id='reg_name']")
 private WebElement username;
 
 @FindBy(xpath= "//input[@id='reg_mobile']")
 private WebElement mobileno;
 
 @FindBy(xpath="//nav[@id='topnav']/div/a[contains (@href,'spotlight/campusstarmedia4.cms')]")
 private WebElement media;
 
 
 
 public WebElement topnavmedia() {
	 return media;
 }
 
 public WebElement programTermslink() {
	 return ProgrameTandC;	 
	 }
 public WebElement emailID() {
	 return emailid;
	 }
 public WebElement username() {
	 return username;
	 }
 public WebElement mobileno() {
	 return mobileno;
	 }
 
 

}
 


