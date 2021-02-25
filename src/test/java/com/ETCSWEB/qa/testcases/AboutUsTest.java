package com.ETCSWEB.qa.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ETCSWEB.qa.base.TestBase;
import com.ETCSWEB.qa.pages.AboutUs;

public class AboutUsTest extends TestBase{

	
  /*VerifyPageTitle
	Verify"PageTitleText"Heading and pargraph
	VerifyVideo    
	VerifyKeTakewayWidget
	VerifyHighlightWidget
	VerifyFAQ Widget
	VerifyFAQKnowMoreWidget
	*/
	
	public AboutUs aboutus;
	public AboutUsTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initlization();
		aboutus=new AboutUs(driver);
	}
	
	@Test
	public void verifyPageTitle() {
		String pageheadertext=aboutus.pageHeaderText();
		String pagetitletext= aboutus.pageTitleText();
		//System.out.println(pageheadertext+"  "+pagetitletext);
		assertEquals(pageheadertext, "ABOUT THE PROGRAM");
		assertEquals(pagetitletext, "WHAT IS ET CAMPUS STARS?");
		
	}
	
	
	@Test
	public void verifyYoutubEmbed() {
		boolean actualstatus=aboutus.youtubeEmbed();
		assertEquals(actualstatus, true);
	}
	
	
	
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
	
	
	
	
}
