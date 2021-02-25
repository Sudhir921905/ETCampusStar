package com.ETCSWEB.qa.testcases;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ETCSWEB.qa.base.TestBase;
import com.ETCSWEB.qa.pages.JuryPanelPage;

public class JuryPanelTest extends TestBase{
	
	
	

	String imagelist[]= {"https://img.etimg.com/photo/78400756.cms","https://img.etimg.com/photo/78400706.cms","https://img.etimg.com/photo/78021706.cms","https://img.etimg.com/photo/78021704.cms","https://img.etimg.com/photo/78021697.cms","https://img.etimg.com/photo/78021696.cms","https://img.etimg.com/photo/78021695.cms"};
	String juryNamelist[]= {"Yashas Karanam","Vineeta Singh","Rakesh Bhan" ,"Narayan Mahadevan","Gautam SInha","Prof. Dr. Frank Gielen","Atish Majumdar"};
	String juryDesignation[]= {"Co-founder, Bellatrix Aerospace" , "Co-founder & CEO, SUGAR Cosmetics" , "Head of Systems Engineering Division, Indian Space Research Organisation (ISRO)" , "Founder, BridgeLabz" , "Chief Executive Officer" , "Executive Board Member and Education Director, EIT InnoEnergy" , "President, Mankind Pharma"};
	List<String> expectedjuryimages;
	List<String> expectedjurynames;
	List<String> expectedjuryDesgination;
	public JuryPanelTest() {
		super();
	}
	public JuryPanelPage jurypanelpage;
	
	@BeforeMethod
	public void setUp(){
	initlization();
	jurypanelpage =new JuryPanelPage(driver);
	}
	
	@Test
	public void verifyJuryImages() {
		expectedjuryimages= new ArrayList<String>(Arrays.asList(imagelist));
		List<String> juryImages=jurypanelpage.JuryPanelImage();
		assertEquals(juryImages,expectedjuryimages);
	}
	
	@Test
	public void verifyJuryName() {
		expectedjurynames=new ArrayList<String>(Arrays.asList(juryNamelist));
		List<String> juryName=jurypanelpage.juryPanelName();
		//System.out.println(juryName.size()+"  "+ expectedjuryimages.size());
		assertEquals( juryName,expectedjurynames);
	}
	

	@Test
	public void verifyJuryDesignation() {
		expectedjuryDesgination = new ArrayList<String>(Arrays.asList(juryDesignation));
		List<String> juryDesignation=jurypanelpage.juryPanelDesignation();
		assertEquals(juryDesignation, expectedjuryDesgination);
		
		
	}
	
	
	@AfterMethod
	public void tearUp() {
		driver.quit();
	}
	

}
