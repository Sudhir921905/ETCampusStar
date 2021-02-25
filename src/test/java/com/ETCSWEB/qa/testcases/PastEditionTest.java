/**
 * 
 */
package com.ETCSWEB.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ETCSWEB.qa.base.TestBase;
import com.ETCSWEB.qa.pages.PastEditionPage;

/**
 * @author C-Sudhir.Kumar
 *
 */
public class PastEditionTest extends TestBase{
	
	public PastEditionPage pasteditionpage;
	public PastEditionTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initlization();
		pasteditionpage= new PastEditionPage(driver);
	}
	
	@Test
	public void verifyTitle() {
		pasteditionpage.HeaderText();
	}
	
	@Test
	public void verifyEdition201920() {
		pasteditionpage.edition201920();
	}
	
	@AfterMethod
	public void tearUp() {
		driver.quit();
	}
	
	

}
