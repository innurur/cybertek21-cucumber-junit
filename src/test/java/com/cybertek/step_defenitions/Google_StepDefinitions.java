package com.cybertek.step_defenitions;

import com.cybertek.pages.GoogleSearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Google_StepDefinitions {

    GoogleSearchPage page = new GoogleSearchPage();

    @Given("User is on Google home page")
    public void user_is_on_google_home_page() {
        Driver.getDriver().get("https://www.google.com");
 }


    @When("User searched for an apple")
    public void user_searched_for_an_apple() {


        page.searchBar.sendKeys("apple" + Keys.ENTER);

    }


    @Then("USer should see apple in the title")
    public void u_ser_should_see_apple_in_the_title() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "apple - Google Search";

        Assert.assertTrue(actualTitle.equals(expectedTitle));
    }

    @Then("User should see title is Google")
    public void userShouldSeeTitleIsGoogle() {
        
    }

    @Then("User should see apple in the title")
    public void userShouldSeeAppleInTheTitle() {
        
    }

    @When("User searches for apple")
    public void userSearchesForApple() {
        
    }

    @When("User searches for {string}")
    public void userSearchesFor(String string) {

        page.searchBar.sendKeys(string + Keys.ENTER);
    }

    @Then("User should see {string} in the title")
    public void userShouldSeeInTheTitle(String string) {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedInTitle = string;
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

    @Then("User should see following links")
    public void userShouldSeeFollowingLinks(List<String> expectedFooterLinks) {

            System.out.println("footerLinks = " + expectedFooterLinks);

            for (WebElement eachLink : page.footerLinks) {
                System.out.println("eachLink = " + eachLink.getText());
            }

            //Create a list of strings (as place holder)
            //Loop through List of WebELements, pass all text into place holder list
            //Then compare 2 List of Strings : actual vs expected

    }
}
