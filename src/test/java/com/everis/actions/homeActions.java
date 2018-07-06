package com.everis.actions;

import com.everis.ui.homePage;
import net.thucydides.core.annotations.Step;

public class homeActions{
	
	homePage home;
	
	@Step
	public void open_nevada_home_page() {
		home.open();
	}
	
	@Step
	public void the_hunter_click_on_signUp() {
		home.signUpButton.click();
	}
	

}
