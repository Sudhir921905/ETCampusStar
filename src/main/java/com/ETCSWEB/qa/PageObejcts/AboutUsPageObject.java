package com.ETCSWEB.qa.PageObejcts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutUsPageObject {
	
	private WebDriver driver;
	public AboutUsPageObject(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(xpath="//div[@class='topBar wapHide']")
	private WebElement PageTitleHeaderText;
	
	@FindBy(xpath="//iframe[@class='youtubeVideo']")
	private WebElement youtubeembed;
	
	@FindBy(xpath="//h2[@class='title article-heading']")
	private WebElement PageTitle;
	
	
	public WebElement pageTitleHeaderText() {
		return PageTitleHeaderText;
	}
	
	public WebElement youtubeEmbed() {
		return youtubeembed;
	}
	
	public WebElement pageTitle() {
		return PageTitle;
	}
	
	
	
	

}
