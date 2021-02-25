package com.ETCSWEB.qa.PageObejcts;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderObjects {
	
	private WebDriver driver;
	public HeaderObjects(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy (xpath="//div[@class='program']")
	private WebElement progame;
	
	@FindBy (xpath="//a[@class='subsec2 ']")
	private List<WebElement> navprogamelink;
	
	@FindBy(xpath="//nav[@id='topnav']/div/a[contains (@href,'spotlight/campusstarmedia4.cms')]")
	private WebElement media;
	
	@FindBy(xpath="//a[@class='subsec2 ' and contains(@href, 'campusstarabout4.cms')]")
	private WebElement programeAbout;
	
	@FindBy(xpath="//a[@class=\"subsec2 \" and contains(@href,\"campusstarprogram4.cms\")]")
	private WebElement Structure;
	
	@FindBy (xpath="//a[@class='subsec2 ' and contains(@href, 'campusstarjury4.cms')]")
	private WebElement juryPanel;
	
	@FindBy (xpath="//a[@class='subsec2 ' and contains(@href, 'campusstarlogos4.cms')]")
	private WebElement partners;
	
	@FindBy (xpath="//a[@class='subsec2 ' and contains(@href, 'campusstarfaq4.cms')]")
	private WebElement FAQ;
	
	@FindBy (xpath="//a[@class='subsec2 ' and contains(@href, 'campusstarpastevents4.cms')]")
	private WebElement pastEdition;
	
	@FindBy (xpath="//a[@class='subsec1 ' and contains(@href, 'campusstarcoding4.cms')]")
	private WebElement codingStar;
	
	@FindBy(xpath="//nav[@id='topnav']/div/a[contains (@href,'spotlight/campusstarcontact4.cms')]")
	private WebElement contactUs;
	
	
	public WebElement juryPanel() {
		return juryPanel;
	}
	
	public WebElement structure() {
		return Structure;
	}
	
	public WebElement partners() {
		return partners;
	}
	public WebElement pastEdition() {
		return pastEdition;
	}
	
	public WebElement progame() {
		return progame;
	}
	
	public WebElement programeAbout() {
		return programeAbout;				
	}
	
	public WebElement media() {
		return media;
	}
	
	public WebElement codingStar() {
		return codingStar;
	}
	
	public WebElement FAQ() {
		return FAQ;
	}
	
	public WebElement contactUs() {
		return contactUs;
	}
	
	/*public List<WebElement> navprogramelink(){
		return navprogamelink;
	}*/
	
	

}
