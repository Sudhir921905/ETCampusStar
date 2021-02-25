package com.ETCSWEB.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.ETCSWEB.qa.PageObejcts.FaqObjects;
import com.ETCSWEB.qa.PageObejcts.HeaderObjects;
import com.ETCSWEB.qa.util.CommonMethod;

public class FAQPage {
	
	private WebDriver driver;
	HeaderObjects headerobj;
	FaqObjects faqobj;
	public FAQPage(WebDriver driver) {
		this.driver=driver;
		faqobj=PageFactory.initElements(driver, FaqObjects.class);
		headerobj=PageFactory.initElements(driver, HeaderObjects.class);
	}
	
	public String headerText() {
		CommonMethod.dragNdrop(headerobj.progame(), driver);
		headerobj.FAQ().click();
		String header=faqobj.headerText().getText();
		return header;
	}
	
	public String HeadingText() {
		CommonMethod.dragNdrop(headerobj.progame(), driver);
		headerobj.FAQ().click();
		String HeadingText=faqobj.headingText().getText();
		return HeadingText;
	}
	
	public void clickonArrow() {
		int count=0;
		CommonMethod.dragNdrop(headerobj.progame(), driver);
		headerobj.FAQ().click();
		for(WebElement arrowicon :faqobj.downArrow() ) {
			arrowicon.click();
			count=count+1;
		}System.out.println(count);
	}
	
	public void selectedText() {
		CommonMethod.dragNdrop(headerobj.progame(), driver);
		headerobj.FAQ().click();
		for(WebElement selecttext: faqobj.selectedText()) {
			selecttext.click();
		}
	}
	

}
