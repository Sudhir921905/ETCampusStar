package com.ETCSWEB.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ETCSWEB.qa.base.TestBase;
import com.ETCSWEB.qa.pages.MediaPage;

public class MediaPageTest extends TestBase{
	
	public MediaPage mediapage;
	public MediaPageTest() {
		super();
		
	}
	
	@BeforeMethod
	public void setUp() {
		initlization();
		mediapage= new MediaPage(driver);
	}
	
	@Test
	public void verifyLoadMoreButton() {
		boolean status= mediapage.clickOnViewMore();
		Assert.assertEquals(status, true);
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
