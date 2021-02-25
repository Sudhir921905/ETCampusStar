package com.ETCSWEB.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ETCSWEB.qa.PageObejcts.HomePageObjects;
import com.ETCSWEB.qa.base.TestBase;

public class HomePage {
	
	private WebDriver driver;
    HomePageObjects homepageobjects;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		homepageobjects =  PageFactory.initElements(driver, HomePageObjects.class);
		}
	
	public boolean verifyTermsConditionlink() {
		 homepageobjects.programTermslink().click();
		 return true;
		
	}
	public boolean clickTermsConditionlink() {
		homepageobjects.programTermslink().isDisplayed();
		return true;
		}
	
	public boolean verifyEmailid() {
		homepageobjects.emailID().isDisplayed();
		return true;
		}
	public boolean clickEmailid() {
		homepageobjects.emailID().click();
		return true;
	}
	
	public boolean verifyName() {
		homepageobjects.username().isDisplayed();
		return true;
	}
	
	public boolean clickOnName() {
		homepageobjects.username().click();
		return true;
	}
	
	public boolean verifyMobileNo() {
		homepageobjects.mobileno().isDisplayed();
		return true;
	}
	public boolean clickMobileNo() {
		homepageobjects.mobileno().click();
		return true;
	}
	
	public String clickonMedialink() {
		homepageobjects.topnavmedia().click();
		return driver.getTitle();
	}


}
	

	
//Registrartion Form



//button[@id="reg_ctn_btn"] //Conitnue button
//span/a[contains (@href, "78783849.cms")] //Program T&C link
//span/a[contains (@href, "terms-conditions")] //terms & condition link
//span/a[contains (@href, "privacypolicy.cms")] // Privacy Policy link
//div[@class="logoContainer"]/a/div/h2 // partenr name
//div[@class="logoContainer"]/a/div/img //partner logo

