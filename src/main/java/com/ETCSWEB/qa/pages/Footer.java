package com.ETCSWEB.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ETCSWEB.qa.PageObejcts.FooterObjects;

public class Footer {
	
	private WebDriver driver;
	public FooterObjects footerobjects;
	public Footer(WebDriver driver) {
		this.driver=driver;
		footerobjects=PageFactory.initElements(driver, FooterObjects.class);		
	}
	
	public String clickonAboutUS() {
		footerobjects.aboutETCampusStar().click();
		String currentUrl= driver.getCurrentUrl();
		return currentUrl;
	}
	
	public String clickonProgramStructre() {
		footerobjects.programeStructure().click();
		String currentUrl=driver.getCurrentUrl();
		return currentUrl;
	}
	
	public String clickonJuryPanel() {
		footerobjects.juryPanel().click();
		String currentUrl=driver.getCurrentUrl();
		return currentUrl;
	}
	
	public String clickonFAQ() {
		footerobjects.faq().click();
		String currentUrl=driver.getCurrentUrl();
		return currentUrl;
	}

	public String clickonContactUs() {
		footerobjects.contactUs().click();
		String currentUrl=driver.getCurrentUrl();
		return currentUrl;
	}
	
	public String clickonSocialFB() {
		footerobjects.socialFB().click();
		String currentUrl=driver.getCurrentUrl();
		return currentUrl;
	}
	
	public String clickonSocialInsta() {
		footerobjects.socialInsta().click();
		String currentUrl=driver.getCurrentUrl();
		return currentUrl;
	}
	
	public String clickonSocalLinkedin() {
		footerobjects.socialLinkedin().click();
		return driver.getCurrentUrl();
	}

	public String clickonSocialTwiiter() {
		footerobjects.socialtwiiter().click();
		String currentUrl=driver.getCurrentUrl();
		return currentUrl;
	}
	
	public boolean clickonContactUsMail() {
		footerobjects.contactUs().click();
		return true;
	}
	
	public boolean subscriptionEmailID(String emailID) {
		footerobjects.subscriptionUserName().sendKeys(emailID);
		return true;
		
	}
	
	public boolean clickonSubscription() {
		footerobjects.subscriptionbutton().click();
		return true;
	}
	
	public String clickonPrivacypolicy() {
		footerobjects.privacypolicylink().click();
		String currentUrl=driver.getCurrentUrl();
		return currentUrl;
	}
	
	public String clickonTermsCondition() {
		footerobjects.termsConditionlink().click();
		String currentUrl=driver.getCurrentUrl();
		return currentUrl;
	}

	public String clickonProgrameTC() {
		footerobjects.ProgrameTClink().click();
		String currentUrl=driver.getCurrentUrl();
		return currentUrl;
	}
	
}
