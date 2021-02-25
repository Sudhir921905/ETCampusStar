package com.ETCSWEB.qa.pages;

import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.ETCSWEB.qa.PageObejcts.HomePageObjects;
import com.ETCSWEB.qa.PageObejcts.MediaPageObjects;
import com.ETCSWEB.qa.base.TestBase;

public class MediaPage{
	
	private WebDriver driver;
	MediaPageObjects mediapageobj;
	HomePageObjects homepageobjects;

	public MediaPage( WebDriver driver) {
		this.driver=driver;
	mediapageobj=	PageFactory.initElements(driver, MediaPageObjects.class);
	homepageobjects=	PageFactory.initElements(driver, HomePageObjects.class);
	}
	
	public boolean clickOnViewMore() {
		homepageobjects.topnavmedia().click();
		mediapageobj.viewMore().isDisplayed();
		return true;
	}
	
	public boolean verfifyViewMore() {
		homepageobjects.topnavmedia().click();
		mediapageobj.viewMore().click();
		return true;
	}
	
	public void articleHeadline(){
		homepageobjects.topnavmedia().click();
		for(int count=1; count<=mediapageobj.meidaTopArticle().size(); count++) {
            Iterator<WebElement> toparticle= mediapageobj.meidaTopArticle().iterator();
			while(toparticle.hasNext()) 
				System.out.println(toparticle.next().getAttribute("href"));
			}
		}
	}
	
	


