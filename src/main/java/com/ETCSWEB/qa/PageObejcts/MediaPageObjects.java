package com.ETCSWEB.qa.PageObejcts;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MediaPageObjects {
	
	
	private WebDriver driver;
	public MediaPageObjects(WebDriver driver) {
		this.driver=driver;	}
	
	@FindBy (xpath="//div[@class=\"media_top clearfix\"]/div/a")
	private List<WebElement> topArticles;
	
	@FindBy (xpath="//div[@class=\"media_top clearfix\"]/div/a/img")
	private List<WebElement> topArticlesThumbnail;
	
	@FindBy (xpath="//div[@class=\"media_bottom clearfix\"]/div/a")
	private List<WebElement> botArticles;
	
	@FindBy (xpath="//div[@class=\"media_bottom clearfix\"]/div/a/img")
	private List<WebElement> botArticlesThumbnail;
	
	@FindBy (xpath="//div[@class=\"more_articles_sec clearfix\"]/a/h2")
	private List<WebElement> viewmoreArticleHeadline;
	
	@FindBy (xpath="//div[@class=\"more_articles_sec clearfix\"]/a/div/img")
	private List<WebElement> viewmoreArticleThumbnail;
	
	@FindBy (xpath="//div[@id=\"mediaMoreBtn\"]/button")
	private WebElement ViewMoreArticle;
	
	
	
	public List<WebElement> meidaTopArticle(){
		return topArticles;
	}
	
	public List<WebElement> mediaTopArticleThmbnail(){
		return topArticlesThumbnail;
	}
	
	public List<WebElement> mediaBotArticle(){
		return botArticles;
	}
	
	public List<WebElement> mediaBotArticleThumbnail(){
		return botArticlesThumbnail;
	}
	
	public WebElement viewMore() {
		return ViewMoreArticle;
	}
	
	public List<WebElement> viewMoreArticle(){
		return viewmoreArticleHeadline;
	}
	
	public List<WebElement> viewMoreArticleThumbanil(){
		return viewmoreArticleThumbnail;
	}

}
