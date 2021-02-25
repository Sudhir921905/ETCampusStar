/**
 * 
 */
package com.ETCSWEB.qa.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ETCSWEB.qa.base.TestBase;
import com.ETCSWEB.qa.pages.ContactUs;

/**
 * @author C-Sudhir.Kumar
 *
 */
public class ContactUsTest extends TestBase{
	
	
	ContactUs contactus;
	public ContactUsTest() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	
	@BeforeMethod
	public void setUp() {
		initlization();
		contactus=new ContactUs(driver);
	}

	@Test(priority = 1, groups = "Fields")
	public void verifyFields() {
		boolean status=contactus.fields();
		assertEquals(status, true);
	}
	
	@Test(dependsOnMethods = {"verifyFields"}, groups = "Fields" )
	public void verifyErrorMessage() {
		boolean status=contactus.errorMsg();
		assertEquals(status, true);
	}
	
	@Test(dependsOnGroups = "Fields")
	public void verifyFormErrorMesages() {
		String errorMsg=contactus.FormsubmitErrormessgae("Sunny", "accetqa@gmail.com", "Checking Error Message");
		assertEquals(errorMsg, "Please enter valid mobile number.");
	}
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
