package com.ETCSWEB.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.ETCSWEB.qa.PageObejcts.HeaderObjects;
import com.ETCSWEB.qa.PageObejcts.JuryPanelObjects;
import com.ETCSWEB.qa.util.CommonMethod;

public class JuryPanelPage {
	
	private WebDriver driver;
	HeaderObjects headerobjects;
    JuryPanelObjects jurypanelobject;
    List <String> juryImage;
    List <String> juryName;
    List <String> juryDesignation;
    
	
	public JuryPanelPage(WebDriver driver) {
		this.driver=driver;
		jurypanelobject =  PageFactory.initElements(driver, JuryPanelObjects.class);
		headerobjects=PageFactory.initElements(driver, HeaderObjects.class);
		}
	
	
	public List<String> JuryPanelImage() {
	    CommonMethod.dragNdrop(headerobjects.progame(), driver);
		headerobjects.juryPanel().click();
		juryImage=new ArrayList<String>();	
		for(WebElement juryimagelist: jurypanelobject.jurypanelImages()) {
			juryImage.add(juryimagelist.getAttribute("src"));
		}
		return juryImage;
		
		
	}
	public List<String> juryPanelDesignation() {
	    CommonMethod.dragNdrop(headerobjects.progame(), driver);
		headerobjects.juryPanel().click();
		juryDesignation=new ArrayList<String>();	
		for(WebElement jurydesignationlist: jurypanelobject.juryPanelDesignation()) {
			juryDesignation.add(jurydesignationlist.getText());
		}return juryDesignation;
	}

	public List<String> juryPanelName() {
	    CommonMethod.dragNdrop(headerobjects.progame(), driver);
		headerobjects.juryPanel().click();
		juryName=new ArrayList<String>();	
		for(WebElement juryimagelist: jurypanelobject.juryPanelName()) {
			juryName.add(juryimagelist.getText());
		}return juryName;
	}
	
}


