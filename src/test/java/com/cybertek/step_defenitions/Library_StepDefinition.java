package com.cybertek.step_defenitions;

import com.cybertek.pages.LibraryPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Library_StepDefinition {
    
    LibraryPage page = new LibraryPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    

    @Given("the user login as a {string}")
    public void the_User_Login_As_A(String role) {
        String url = ConfigurationReader.getProperty("libraryUrl");
        Driver.getDriver().get(url);
        System.out.println(role + " is logging in");
    }

    @When("user type {string}")
    public void user_type(String email) {
       
        page.emailInput.sendKeys(email);
    }
    
    @And("user type the {string}")
    public void user_Type_The(String password) {
       
        page.passwordInput.sendKeys(password);
        page.signButton.click();
    }
    
   

    @Then("the user on  {string}")
    public void the_User_On(String expectedPage) {

        for (WebElement eachSelection : page.pageSelection) {
            if(eachSelection.getText().equals(expectedPage)){
                Assert.assertTrue(eachSelection.getText().equals(expectedPage));
                System.out.println("True");
            }
        }
        
    }
}
