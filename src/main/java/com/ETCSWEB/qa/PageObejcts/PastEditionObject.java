/**
 * 
 */
package com.ETCSWEB.qa.PageObejcts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author C-Sudhir.Kumar
 *
 */
public class PastEditionObject {
	
	private WebDriver driver;
	public PastEditionObject(WebDriver driver){
		this.driver=driver;
	}
	
	@FindBy(xpath="//div[@class='topBar']")
	private WebElement Header;
	
	@FindBy(xpath="//div[@class='past_event1_left']/h2")
	private WebElement HeaderText;
	
	@FindBy(xpath="//div[@class='edition']/select")
	private WebElement Edition;
	
	@FindBy(xpath="//div[@id='champStar']/div/button")
	private WebElement ETCampusStar_Load_More;
	
	@FindBy(xpath="//div[@id='jury']/div/button")
	private WebElement ETCampusStar_Jury_LoadMore;
	
	@FindBy(xpath="//div[@id='champCodingStar']/div/button")
	private WebElement ETCampus_CodingStar_LoadMore;
	
	@FindBy(xpath="//div[@id='campusAmbassadors']/div/button")
	private WebElement ETCampusStar_CampusAmbassador_LoadMore;

	@FindBy(xpath="//h1[@class='common_headng']/span")
	private WebElement Photo;    //      .gettext() 1st+""+2st
	
	@FindBy(xpath="//h1[@class='common_headng']")
	private WebElement Gallery;

	@FindBy(xpath="//span[@class='left_trigger']")
	private WebElement PhotoGallery_leftclick;
	
	@FindBy(xpath="//span[@class='right_trigger']")
	private WebElement PhotoGallery_RightClick;
	
	
	public WebElement header() {
		return Header;
		}
	
	public WebElement edition() {
		return Edition;
	}
	
	public WebElement HeaderText() {
		return HeaderText;
	}
	
	public WebElement campusStarLoadMore() {
		return ETCampusStar_Load_More;
	}

	public WebElement codingStarLoadMore() {
		return ETCampus_CodingStar_LoadMore;
	}
	
	public WebElement juryLoadMore() {
		return ETCampusStar_Jury_LoadMore;	
	}
	
	public WebElement campusAmbessodorLoadMore() {
		return ETCampusStar_CampusAmbassador_LoadMore;
	}
	
	public WebElement photoText () {
		return Photo;
	}

	public WebElement galleryText() {
		return Gallery;
	}
	public WebElement photoLeftClick() {
		return PhotoGallery_leftclick;
	}
	
	public WebElement photoRightClick() {
		return PhotoGallery_RightClick;
	}
	

}
