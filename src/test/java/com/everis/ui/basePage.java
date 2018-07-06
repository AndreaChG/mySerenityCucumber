package com.everis.ui;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;

public class basePage extends PageObject {
	
	private WebDriver webDriver;

	/**
	 * Default Constructor.
	 */  
    public basePage(final WebDriver driver) {
    	super(driver);
    	webDriver = driver;
    }

}
