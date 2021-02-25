package com.ETCSWEB.qa.PageObejcts;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JuryPanelObjects {
	
	private WebDriver driver;
	public JuryPanelObjects(WebDriver driver) {
		this.driver=driver;	
		 	// TODO Auto-generated constructor stub
		}
	
	@FindBy(xpath="//div[@class='jury_details']/div/div[@class='jury_name']")
	private List<WebElement> juryName;
	
	@FindBy(xpath="//ul[@class='clearfix']/li/img")
	private List<WebElement> juryImage;
	
	@FindBy(xpath="//div[@class='jury_details']/div/div[@class='jury_designation']")
	private List<WebElement> juryDesignation;
	
	
	
	public List<WebElement> jurypanelImages(){
		return juryImage;
	}
	
	public List<WebElement> juryPanelName(){
		return juryName;
	}
	
	public List<WebElement> juryPanelDesignation(){
		return juryDesignation;
	}
}


