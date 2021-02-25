package com.ETCSWEB.qa.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CommonMethod {
	
	public static void dragNdrop(WebElement target, WebDriver driver) {
		
		
		Actions act= new Actions(driver);
		act.moveToElement(target).build().perform();
		
	}

}
