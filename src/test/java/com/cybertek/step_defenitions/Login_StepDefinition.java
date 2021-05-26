package com.cybertek.step_defenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinition {

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("User is on the login page.");
    }



    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("User enters LIBRARIAN username");

        //Intentionally failing this step
        //Assert.fail("INTENTIONAL FAIL!!!!!!!");

    }
    
    
    @When("user enter librarian password")
    public void user_enter_librarian_password() {
        System.out.println("User enters LIBRARIAN password");
    }
    
    
    @Then("user should see dashboard")
    public void user_should_see_dashboard() {
        System.out.println("User sees dashboard");
    }



    @When("user enters student username")
    public void userEntersStudentUsername() {
        System.out.println("User enters STUDENT username");
    }

    @And("user enters student password")
    public void userEntersStudentPassword() {
        System.out.println("User enters STUDENT password");
    }



    @When("user enters admin username")
    public void userEntersAdminUsername() {
        System.out.println("User enters ADMIN username");
    }

    @And("user enters admin password")
    public void userEntersAdminPassword() {
        System.out.println("User enters ADMIN password");
    }
}
