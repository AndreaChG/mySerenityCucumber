package com.everis.pages;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class registrationPage extends basePage {

	public registrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(css="input[placeholder='Enter your date of birth (MM/DD/YYYY)']")
	public WebElementFacade txtDateOfBirth; 
	

}
