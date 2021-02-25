package com.ETCSWEB.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ETCSWEB.qa.PageObejcts.HeaderObjects;
import com.ETCSWEB.qa.PageObejcts.ProgrameStructurePageObjects;
import com.ETCSWEB.qa.util.CommonMethod;

public class StructurePage {
	
	private WebDriver driver;
	ProgrameStructurePageObjects structurepageObj;
	HeaderObjects headerobj;
	public StructurePage(WebDriver driver) {
		this.driver=driver;
		structurepageObj=PageFactory.initElements(driver, ProgrameStructurePageObjects.class);
		headerobj=PageFactory.initElements(driver, HeaderObjects.class);			
	}
	
	public void click() {
		CommonMethod.dragNdrop(headerobj.progame(), driver);
		headerobj.structure().click();
		System.out.println(driver.getTitle());
		System.out.println(structurepageObj.headertext().getText());
		System.out.println(structurepageObj.getprText().getText());
		System.out.println(structurepageObj.getpr1Text().getText());
	}

}
