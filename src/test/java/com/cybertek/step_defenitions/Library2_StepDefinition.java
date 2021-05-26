package com.cybertek.step_defenitions;

import com.cybertek.pages.LibraryPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Library2_StepDefinition {

    LibraryPage page = new LibraryPage();

    @Given("The user login as a {string}")
    public void theUserLoginAsA(String user) {
        
        if(user.equals("student")){
            page.emailInput.sendKeys();
        }
    }

    @Then("The user on  {string}")
    public void theUserOn(String page) {
    }

    
}
