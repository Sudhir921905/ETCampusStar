/**
 * 
 */
package com.ETCSWEB.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ETCSWEB.qa.base.TestBase;
import com.ETCSWEB.qa.pages.StructurePage;

/**
 * @author C-Sudhir.Kumar
 *
 */
public class ProgrameStructureTest extends TestBase{
	
	StructurePage strobj;
	public ProgrameStructureTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initlization();
		strobj=new StructurePage(driver);
	}
	
	@Test
	public void verifyTitle() {
	strobj.click();
	}
	
	@AfterMethod
	public void tearUp() {
		driver.quit();
	}
}