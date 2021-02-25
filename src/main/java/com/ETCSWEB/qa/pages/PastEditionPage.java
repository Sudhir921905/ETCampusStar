package com.ETCSWEB.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ETCSWEB.qa.PageObejcts.HeaderObjects;
import com.ETCSWEB.qa.PageObejcts.PastEditionObject;
import com.ETCSWEB.qa.util.CommonMethod;

public class PastEditionPage {
	
	private WebDriver driver;
	public PastEditionObject pasteditionobj;
	public HeaderObjects headerobj;
	Select select;
	public PastEditionPage(WebDriver driver) {
		this.driver=driver;
		pasteditionobj=PageFactory.initElements(driver, PastEditionObject.class);
		headerobj= PageFactory.initElements(driver, HeaderObjects.class);
	}
	
	
	public void HeaderText() {
		CommonMethod.dragNdrop(headerobj.progame(), driver);
		headerobj.pastEdition().click();
		System.out.println(pasteditionobj.HeaderText().getText());
		System.out.println(pasteditionobj.header().getText());
		
	}
	
	public void edition201920(){
		CommonMethod.dragNdrop(headerobj.progame(), driver);
		headerobj.pastEdition().click();
		select=new Select(pasteditionobj.edition());
		select.selectByVisibleText("2019-2020");
		pasteditionobj.campusAmbessodorLoadMore().isDisplayed();
		pasteditionobj.campusStarLoadMore().isDisplayed();
		pasteditionobj.codingStarLoadMore().isDisplayed();
		pasteditionobj.juryLoadMore().isDisplayed();
		System.out.println(pasteditionobj.photoText().getText()+" "+pasteditionobj.galleryText().getText());
		pasteditionobj.photoLeftClick().isDisplayed();
		pasteditionobj.photoRightClick().isDisplayed();
		
	}
	
	

}
