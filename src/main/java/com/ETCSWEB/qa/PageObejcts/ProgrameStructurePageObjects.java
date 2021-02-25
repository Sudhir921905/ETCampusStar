package com.ETCSWEB.qa.PageObejcts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProgrameStructurePageObjects {
	
	private WebDriver driver;
	public ProgrameStructurePageObjects(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(xpath="//div[@class='topBar wapHide']")
	private WebElement PageHeadertext;
	
	@FindBy(xpath="//div[@class='Normal'  and contains(text(),'The assessment is designed')]")
	private WebElement List2Text;
	
	@FindBy(xpath="//div[@class='Normal'  and contains(text(), 'Campus Stars is India’s biggest hunt')]")
	private WebElement pr1Text;
	/*
	@FindBy(xpath="gg")
	private WebElement ff;
	
	@FindBy(xpath="gg")
	private WebElement sd;
	*/
	
	public WebElement headertext() {
		return PageHeadertext;
	}
	
	public WebElement getprText() {
		return List2Text;
	}
	
	public WebElement getpr1Text() {
		return pr1Text;
	}
	
	public WebElement gg() {
		return gg();
	}
	
	

}
