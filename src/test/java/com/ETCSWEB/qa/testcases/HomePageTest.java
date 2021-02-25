package com.ETCSWEB.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ETCSWEB.qa.base.TestBase;
import com.ETCSWEB.qa.pages.HomePage;

public class HomePageTest extends TestBase {
	
	public HomePage homepage;
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initlization();
		homepage =new HomePage(driver);
	}
	
	@Test
	public void verifyEmailid() {
		boolean status=homepage.verifyEmailid();
		Assert.assertEquals(status, true);
	}
	@Test
	public void clickOnEmailid() {
	boolean status= homepage.clickEmailid();
	Assert.assertEquals(status, true);
	}
	
	@Test
	public void verifyMediaLink() {
		String page_Title=homepage.clickonMedialink();
		String orgin_Title="ET Campus Stars Media: ET Campus Stars 2020 latest news, ET Campus Stars Latest updates | The Economic Times";
		Assert.assertEquals(page_Title, orgin_Title);
	}
	
	
	
	@Test(priority=-1)
	public void verifyTermsConditionLink() {
		boolean status=homepage.verifyTermsConditionlink();
		Assert.assertEquals(status, true);	
	}
	@Test
	public void clickTermsConditionLink() {
		boolean status=homepage.clickTermsConditionlink();
		Assert.assertEquals(status, true);
	}
	
	
	
	
	
	@Test
	public void verifyName() {
		boolean status=homepage.verifyName();
		Assert.assertEquals(status, true);
	}
	@Test
	public void clickName() {
		boolean status=homepage.clickOnName();
		Assert.assertEquals(status, true);
	}
	
	
	
	
	@Test(priority=2)
	public void verifyMobileNo() {
		boolean status=homepage.verifyMobileNo();
		Assert.assertEquals(status, true);
	}
	@Test
	public void clickMobileNo() {
		boolean status=homepage.clickMobileNo();
		Assert.assertEquals(status, true);
	}
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
