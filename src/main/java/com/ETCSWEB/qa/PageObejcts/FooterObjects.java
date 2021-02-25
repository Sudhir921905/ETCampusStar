package com.ETCSWEB.qa.PageObejcts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FooterObjects {
	
	private WebDriver driver;
	public FooterObjects(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy (xpath="//div [ @class = 'footLinks' ]/a[ contains(text(), 'About ET Campus Stars')]  ")
	private WebElement About_ET_Campus_Star;
	
	@FindBy (xpath="//div [ @class = 'footLinks' ]/a[ contains(text(), 'Program Structure')]" ) 
	private WebElement Prorame_Struture;
	
	@FindBy (xpath="//div [ @class = \"footLinks\" ]/a[ contains(text(), \"Jury Panel\")]" ) 
	private WebElement Jury_Panel;
	
	@FindBy (xpath="//div [ @class = \"footLinks\" ]/a[ contains(text(), \"FAQs\")]" ) 
	private WebElement FAQ;
	
	@FindBy (xpath="//div [ @class = \"footLinks\" ]/a[ contains(text(), \"Contact Us\")]" ) 
	private WebElement Contact_US;
	 
	@FindBy (xpath="//div [ @class = \"flt box followUs\" ]/a[ contains(@href, \"facebook.com/ETCampusStar\")]" ) 
	private WebElement Social_FB_Link;
	
	@FindBy (xpath="//div [ @class = \"flt box followUs\" ]/a[ contains(@href, \"instagram.com/etcampusstars\")]" ) 
	private WebElement Social_Instagram_Link;
	
	@FindBy (xpath="//div [ @class = \"flt box followUs\" ]/a[ contains(@href, \"linkedin.com/showcase/etcampusstars\")]" ) 
	private WebElement Social_linkedin_Link;
	 
	@FindBy (xpath="//div [ @class = \"flt box followUs\" ]/a[ contains(@href, \"twitter.com/ETCampusStars\")]" ) 
	private WebElement Social_twitter_Link;
	
	@FindBy (xpath="//div [ @class = \"contactUsLinks\" ]/a[ contains(@href, \"mailto:etcs@economictimes.com\")]" ) 
	private WebElement Mail_contactUsLinks;
	
	@FindBy (xpath="//input[@class=\"subscription\"]" ) 
	private WebElement Newsletter_Subscription_input_box;
	
	@FindBy (xpath="//button[@class=\"btnNewsletter\"]" ) 
	private WebElement Newsletter_SubscribeNow_button;
	
	@FindBy (xpath="//li/a[@ href=\"https://economictimes.indiatimes.com/privacypolicy.cms\"] " ) 
	private WebElement privacy_policy;
	
	@FindBy (xpath="li/a[@href=\"https://economictimes.indiatimes.com/terms-conditions\"]" ) 
	private WebElement terms_and_condition;
	
	@FindBy (xpath="//li/a[@href=\"https://economictimes.indiatimes.com/photo/78783849.cms\"]" ) 
	private WebElement Progarme_TC;
	
	
	public WebElement aboutETCampusStar() {
		return About_ET_Campus_Star;
	}
	
	public WebElement programeStructure() {
		return Prorame_Struture;
	}
	
	public WebElement juryPanel() {
		return Jury_Panel;
	}
	
	public WebElement faq() {
		return FAQ;
	}
	
	public WebElement contactUs() {
		return Contact_US;
	}
	
	public WebElement socialFB() {
		return Social_FB_Link;
	}
	
	public WebElement socialInsta() {
		return Social_Instagram_Link;
	}
	
	public WebElement socialLinkedin() {
		return Social_linkedin_Link;
	}
	
	public WebElement socialtwiiter() {
		return Social_twitter_Link;
	}
	
	public WebElement contactUsmail() {
		return Mail_contactUsLinks;
	}
	
	public WebElement subscriptionUserName() {
		return Newsletter_Subscription_input_box;
	}
	
	public WebElement subscriptionbutton() {
		return Newsletter_SubscribeNow_button;
	}
	
	public WebElement privacypolicylink() {
		return privacy_policy;
	}
	
	public WebElement termsConditionlink() {
		return terms_and_condition;
	}
	
	public WebElement ProgrameTClink() {
		return Progarme_TC;
	}
	

}
