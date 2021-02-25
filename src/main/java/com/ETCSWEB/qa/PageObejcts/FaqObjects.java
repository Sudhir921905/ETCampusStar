package com.ETCSWEB.qa.PageObejcts;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.google.j2objc.annotations.RetainedLocalRef;

public class FaqObjects {
	
	
	private WebDriver driver;
	public FaqObjects(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(xpath="//div[@class='topBar wapHide']")
	private WebElement HeaderText;
		
	@FindBy(xpath="//div[@class='heading']")
	private WebElement HeadingText;
	
	@FindBy(xpath="//ul[@class='clearfix']/li")
	private List<WebElement> selectedText;
	
	@FindBy(xpath="//div[@class='downArr']")
	private List<WebElement> downArrow;
		    
		 
		public WebElement headerText() {
			return HeaderText;
			}
		
		public WebElement headingText() {
			return HeadingText;
		}
		
		public List<WebElement> selectedText(){
			return selectedText;
		}
		
		public List<WebElement> downArrow(){
			return downArrow;
		}
	

}
