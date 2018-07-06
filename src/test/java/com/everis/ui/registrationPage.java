package com.everis.ui;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class registrationPage extends PageObject {

	@FindBy(css="input[placeholder='Enter your date of birth (MM/DD/YYYY)']")
	public WebElementFacade txtDateOfBirth; 
	
	@FindBy(css="[name=idMethod]")
	public WebElementFacade dlIdentificationMethod;
	
	@FindBy(xpath="//span[contains(text(),'Social Security')]")
	public WebElementFacade optionSocialSecurity;
	
	@FindBy(name="identifier")
	public WebElementFacade txtIdentifier;
	
	@FindBy(xpath="//button//span[contains(text(),'Continue')]")
	public WebElementFacade btnContinue;
	
	@FindBy(css=".alert--success.text--sm")
	public WebElementFacade alertCustomerMessage;
	
	@FindBy(xpath="//button//span[contains(text(),'Create New')]")
	public WebElementFacade btnCreateNew;
	
	

}
