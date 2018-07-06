package com.everis.steps;

import com.everis.actions.homeActions;
import com.everis.actions.registrationActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class customerAccountStepsDefinitions {
	
	@Steps
	homeActions homeSteps;
	registrationActions registrationSteps;
	
	@Given("el cazador desea registrarse en Nevada")
	public void elCazadorDeseaRegistrarseEnNevada() {
		homeSteps.open_nevada_home_page();
		homeSteps.the_hunter_click_on_signUp();
	}
	
	@When("confirme que no tiene un registro previamente creado")
	public void confirmaQueNoTieneUnRegistroPreviamenteCreado() {
		registrationSteps.enter_account_verification("12/12/1952", "697987365");
		registrationSteps.verify_the_account_is_new();
		registrationSteps.click_on_create_new_button();
	}
	
	@When("llena el formulario de registro")
	public void llenaElFormularioDeRegistro() {
		
	}
	
	@Then("el podra registrarse oficialmente en Nevada")
	public void elPodraRegistrarseOficialmenteEnNevada() {
		
	}
}
