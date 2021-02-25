package com.ETCSWEB.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ETCSWEB.qa.base.TestBase;
import com.ETCSWEB.qa.pages.Header;

public class HaderPageTest extends TestBase {
	
	public HaderPageTest() {
		super();
	}
	public Header header;
	
	@BeforeMethod
	public void setUp() {
		initlization();
		header= new Header(driver);
	}
	@Test
	public void verifyMediaLink() {
		String expectedURL="https://economictimes.indiatimes.com/etcampusstars/media";
		String pageURL=header.medialinkRedirection();
		Assert.assertEquals(pageURL, expectedURL);
		
	}
	
	@Test
	public void verifyProgrameAbout() {
		String expectedURL="https://economictimes.indiatimes.com/etcampusstars/about";
		String currentURL=header.clickOnProgramAbout();
		Assert.assertEquals(expectedURL, currentURL);
	}
	
	@Test
	public void verifyFAQLink() {
		String actualUrl="https://economictimes.indiatimes.com/etcampusstars/faqs";
		String currentUrl=header.clickonFAQ();
		Assert.assertEquals(actualUrl, currentUrl);
	}
	
	@Test
	public void verifyStructureLink() {
		String actualUrl="https://economictimes.indiatimes.com/etcampusstars/programstructure";
		String currentUrl=header.clickonStructure();
		Assert.assertEquals(actualUrl, currentUrl);
	}
	
	@Test
	public void verifyjuryPanelLink() {
		String actualUrl="https://economictimes.indiatimes.com/etcampusstars/jurypanel";
		String currentUrl=header.clickonjuryPanel();
		Assert.assertEquals(actualUrl, currentUrl);
	}
	
	@Test
	public void verifycodingStarLink() {
		String actualUrl="https://economictimes.indiatimes.com/etcampusstars/codingstars";
		String currentUrl=header.clickoncodingStar();
		Assert.assertEquals(actualUrl, currentUrl);
	}
	
	@Test
	public void verifypartnersLink() {
		String actualUrl="https://economictimes.indiatimes.com/etcampusstars/partners";
		String currentUrl=header.clickonpartnes();
		Assert.assertEquals(actualUrl, currentUrl);
	}
	
	@AfterMethod
	public void tearUp() {
		driver.quit();
	}

}
