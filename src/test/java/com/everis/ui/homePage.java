package com.everis.ui;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class homePage extends PageObject {

	@FindBy(xpath="//mat-sidenav//button//span[contains(text(),'Sign Up')]")
	public WebElementFacade signUpButton;



}
