/**
 * 
 */
package com.ETCSWEB.qa.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ETCSWEB.qa.base.TestBase;
import com.ETCSWEB.qa.pages.FAQPage;

/**
 * @author C-Sudhir.Kumar
 *
 */
public class FAQTest extends TestBase{
	
	public FAQTest() {
		super();
	}
	public FAQPage faqpage;
	
	@BeforeMethod
	public void setUp() {
		initlization();
		faqpage=new FAQPage(driver);
	}
	
	@Test
	public void verifyPage() {
		String expected_Header=faqpage.headerText();
		String expected_Heading=faqpage.HeadingText();
		assertEquals("FREQUENTLY ASKED QUESTIONS", expected_Header);
		assertEquals("STILL HAVE A QUESTION? THESE MAY HELP", expected_Heading);
	}
	
	@Test
	public void verifySelectText() {
		faqpage.selectedText();
	}
	
	@Test
	public void verifyArrowicon() {
		faqpage.clickonArrow();
	}
	
	
	
	@AfterMethod
	public void tearUp(){
		driver.quit();
		
	}

}
