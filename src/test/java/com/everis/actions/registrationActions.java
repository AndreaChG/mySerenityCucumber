package com.everis.actions;

import static org.junit.Assert.assertTrue;

import com.everis.ui.registrationPage;

import net.thucydides.core.annotations.Step;

public class registrationActions {
	
	registrationPage registration;
	
	@Step
	public void enter_account_verification(String dateOfBirth, String socialSecurityNumber) {
		registration.txtDateOfBirth.type(dateOfBirth);
		registration.dlIdentificationMethod.click();
		registration.optionSocialSecurity.click();
		registration.txtIdentifier.type(socialSecurityNumber);
		registration.btnContinue.click();
	}
	
	@Step
	public void verify_the_account_is_new() {
		String message = registration.alertCustomerMessage.getText();
		assertTrue(message.contentEquals("No customer found"));
	}
	
	@Step
	public void click_on_create_new_button() {
		registration.btnCreateNew.click();
	}
	

}
