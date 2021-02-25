package com.ETCSWEB.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ETCSWEB.qa.PageObejcts.AboutUsPageObject;
import com.ETCSWEB.qa.PageObejcts.HeaderObjects;
import com.ETCSWEB.qa.util.CommonMethod;

public class AboutUs {
	
	private WebDriver driver;
	AboutUsPageObject aboutus;
	HeaderObjects headerobj;
	public AboutUs(WebDriver driver) {
		this.driver=driver;
		aboutus=PageFactory.initElements(driver, AboutUsPageObject.class);
		headerobj=PageFactory.initElements(driver, HeaderObjects.class);
		
	}

	public String pageHeaderText() {
		CommonMethod.dragNdrop(headerobj.progame(), driver);
		headerobj.programeAbout().click();
		String pageheadertext=aboutus.pageTitleHeaderText().getText();
		return pageheadertext;
		
	}

	public String pageTitleText() {
		CommonMethod.dragNdrop(headerobj.progame(), driver);
		headerobj.programeAbout().click();
		String pagetitletext=aboutus.pageTitle().getText();
		return pagetitletext; 
	}

	public boolean youtubeEmbed() {
		CommonMethod.dragNdrop(headerobj.progame(), driver);
		headerobj.programeAbout().click();
		boolean status= aboutus.youtubeEmbed().isDisplayed();
		return status;
		
	}



}
