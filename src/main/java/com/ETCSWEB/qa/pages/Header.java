package com.ETCSWEB.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import com.ETCSWEB.qa.PageObejcts.HeaderObjects;
import com.ETCSWEB.qa.util.CommonMethod;

public class Header {

	private WebDriver driver;
	public HeaderObjects headerobj;
	
	public Header(WebDriver driver) {
		this.driver=driver;
		headerobj=PageFactory.initElements(driver, HeaderObjects.class);
	}
	
	
	
	public String clickOnProgramAbout() {

		CommonMethod.dragNdrop(headerobj.progame(), driver);
		headerobj.programeAbout().click();
		return driver.getCurrentUrl();
	}
	
     public String medialinkRedirection() {
		headerobj.media().click();
		return driver.getCurrentUrl();		
	}   
     public String clickonFAQ() {
    	 CommonMethod.dragNdrop(headerobj.progame(), driver);
    	 headerobj.FAQ().click();
    	 return driver.getCurrentUrl();
     }   
     public String clickonStructure() {
    	 CommonMethod.dragNdrop(headerobj.progame(), driver);
     	 headerobj.structure().click();
     	 return driver.getCurrentUrl();
      }
     public String clickonjuryPanel() {
    	 CommonMethod.dragNdrop(headerobj.progame(), driver);
      	 headerobj.juryPanel().click();
      	 return driver.getCurrentUrl();
       }
     public String clickoncodingStar() {
    	 CommonMethod.dragNdrop(headerobj.progame(), driver);
      	 headerobj.codingStar().click();
      	 return driver.getCurrentUrl();
       } 
     public String clickonpartnes() {
    	 CommonMethod.dragNdrop(headerobj.progame(), driver);
      	 headerobj.partners().click();
      	 return driver.getCurrentUrl();
       }

	
	
	}

