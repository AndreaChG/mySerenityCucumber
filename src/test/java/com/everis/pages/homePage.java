package com.everis.pages;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class homePage extends basePage {

	public homePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//mat-sidenav-content//button//span[contains(text(),'Sign Up')]")
	private WebElementFacade signUpButton;


}
