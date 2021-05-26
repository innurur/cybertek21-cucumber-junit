package com.cybertek.step_defenitions;

import com.cybertek.pages.EtsyPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Etsy_StepDefinitions {

    EtsyPage page = new EtsyPage();


    @Given("user is on Etsy landing page")
    public void user_is_on_etsy_landing_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("etsyUrl"));
    }




    @Then("user should see Etsy title as expected")
    public void user_should_see_etsy_title_as_expected() {

        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);

        BrowserUtils.sleep(2);

    }


    @When("user types word in the search box")
    public void userTypesWordInTheSearchBox() {
        page.searchBox.sendKeys("wooden spoon");
    }

    @And("user click search button")
    public void userClickSearchButton() {
        page.searchButton.click();
    }

    @Then("user seed word in the title")
    public void userSeedWordInTheTitle() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Wooden spoon"));
    }

    @When("user types {string} in the search box")
    public void userTypesInTheSearchBox(String word) {
        page.searchBox.sendKeys(word);

    }

    @Then("user seed {string} in the title")
    public void userSeedInTheTitle(String word) {
        String expectedTitle = Driver.getDriver().getTitle();
        String actualTitle = word+" | Etsy";
        Assert.assertEquals(expectedTitle, actualTitle);
    }
}
