package com.cybertek.step_defenitions;

import com.cybertek.pages.CybertekPracticePage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DropdownPractice_StepDefinitions {

    CybertekPracticePage cyberPage = new CybertekPracticePage();

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {

        Driver.getDriver().get(ConfigurationReader.getProperty("cybertekPracticeUrl"));
    }


    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List <String> expectedListOfMonth) {

        Select select = new Select(cyberPage.monthBox);

        List<WebElement> ListOfMonth = select.getOptions();

        List <String> actualTextOfMonth = new ArrayList<String>();

        for (WebElement eachMonth :ListOfMonth) {
            actualTextOfMonth.add(eachMonth.getText());
        }

        Assert.assertEquals(expectedListOfMonth, actualTextOfMonth);

    }

}
