package com.ETCSWEB.qa.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ETCSWEB.qa.base.TestBase;
import com.ETCSWEB.qa.pages.Footer;

public class footerTest extends TestBase {
	
	
	public footerTest() {
		super();
	}
	public Footer footer;
	
	@BeforeMethod
	public void setUp() {
	initlization();
	footer=new Footer(driver);
	}
	
	@Test
	public void verifyAboutUslink() {
		String expectedUrl="https://economictimes.indiatimes.com/etcampusstars/about";
		String currentUrl=footer.clickonAboutUS();
		assertEquals(currentUrl, expectedUrl);
		
	}
	
	@Test
	public void verifyProgramStructurelink() {
		String expectedUrl="https://economictimes.indiatimes.com/etcampusstars/programstructure";
		String currentUrl=footer.clickonProgramStructre();
		assertEquals(currentUrl,expectedUrl);
	}
	
	@Test
	public void verifyJuryPanellink() {
		String expectedUrl="https://economictimes.indiatimes.com/etcampusstars/jurypanel";
		String currentUrl=footer.clickonJuryPanel();
		assertEquals(currentUrl,expectedUrl);
	}
	
	@Test
	public void verifyFaqlink() {
		String expectedUrl="https://economictimes.indiatimes.com/etcampusstars/faqs";
		String currentUrl=footer.clickonFAQ();
		assertEquals(currentUrl, expectedUrl);
	}
	
	@Test
	public void verifyContactUslink() {
		String expectedUrl="https://economictimes.indiatimes.com/etcampusstars/contact";
		String currentUrl=footer.clickonContactUs();
		assertEquals(currentUrl, expectedUrl);
	}
	
	@Test
	public void verifyFacebooklink() {
		String expectedUrl="https://www.facebook.com/ETCampusStar/";
		String currentUrl=footer.clickonSocialFB();
		assertEquals(currentUrl, expectedUrl);
		
	}

	@Test
	public void verifyInstgarmlink() {
		String expectedUrl="https://www.instagram.com/etcampusstars/";
		String currentUrl=footer.clickonSocialInsta();
		assertEquals(currentUrl, expectedUrl);
	}

	@Test
	public void verifyLinkedinlink() {
		String expectedURL="https://www.linkedin.com/showcase/etcampusstars";
		String currentURL=footer.clickonSocalLinkedin();
		assertEquals(currentURL, expectedURL);
	}
	
	@Test
	public void verifyTwitterlink() {
		String expectedUrl="https://twitter.com/ETCampusStars";
		String currentUrl=footer.clickonSocialTwiiter();
		assertEquals(currentUrl, expectedUrl);
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
