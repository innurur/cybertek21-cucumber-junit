package com.cybertek.step_defenitions;

import com.cybertek.pages.SmartBearPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import com.cybertek.utilities.WebOrderUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SmartBear_StepDefinitions {

    SmartBearPage smartPage = new SmartBearPage();


    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {
        String url = ConfigurationReader.getProperty("smartBearUrl");
        Driver.getDriver().get(url);
        WebOrderUtils.loginToSmartBear(Driver.getDriver());
        smartPage.orderButton.click();

    }



    @And("User fills out the form as followed from the table below:")
    public void user_fills_out_the_form_as_followed_from_the_table_below() {

    }



    @And("User selects {string} from product dropdown")
    public void user_selects_from_product_dropdown(String string) {
        Select select = new Select(smartPage.dropDown);
        select.selectByVisibleText(string);
    }


    @And("User enters {string} to quantity")
    public void user_enters_to_quantity(String string) {
        smartPage.quantity.clear();
        BrowserUtils.sleep(2);
        smartPage.quantity.sendKeys(string);
    }


    @And("User enters {string} to costumer name")
    public void user_enters_to_costumer_name(String string) {
        smartPage.customerName.sendKeys(string);
    }

    @And("User enters {string} to street")
    public void user_enters_to_street(String string) {
        smartPage.streetName.sendKeys(string);
    }


    @And("User enters {string} to city")
    public void user_enters_to_city(String string) {
        smartPage.city.sendKeys(string);
    }


    @And("User enters {string} to state")
    public void user_enters_to_state(String string) {
        smartPage.state.sendKeys(string);
    }


    @And("User enters {string} to zip")
    public void user_enters_to_zip(String string) {
        smartPage.zipCode.sendKeys(string);
    }


    @And("User selects {string} as card type")
    public void user_selects_as_card_type(String string) {
        smartPage.cardType.click();
    }


    @And("User enters {string} to card number")
    public void user_enters_to_card_number(String string) {
        smartPage.cardNumber.sendKeys(string);
    }


    @And("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String string) {
        smartPage.expireDate.sendKeys(string);
    }


    @And("User clicks process button")
    public void user_clicks_process_button() {
        smartPage.processButton.click();
    }


    @And("User verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String string) {

        for (WebElement costumerName : smartPage.orderList) {
            if(smartPage.orderList.contains(string)){
                Assert.assertTrue(smartPage.orderList.contains(string));
            }
        }
    }


}
/*
@Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {

        String url = ConfigurationReader.getProperty("smartBearUrl");
        Driver.getDriver().get(url);
        WebOrderUtils.loginToSmartBear(Driver.getDriver());
        smartPage.orderButton.click();

    }

  @And("User selects “product” from product dropdown")
    public void user_selects_product_from_product_dropdown() {
        Select select = new Select(smartPage.dropDown);
        select.selectByVisibleText("ScreenSaver");

    }


    @And("User enters “quantity” to quantity")
    public void user_enters_quantity_to_quantity() {

        smartPage.quantity.clear();
        smartPage.quantity.sendKeys("5");
        BrowserUtils.sleep(2);
    }


    @And("User enters “customername” to costumer name")
    public void user_enters_customername_to_costumer_name() {

        smartPage.customerName.sendKeys("Inik Nur ");
    }


    @And("User enters “street” to street")
    public void user_enters_street_to_street() {

        smartPage.streetName.sendKeys("Manhattan St");
    }


    @And("User enters “city” to city")
    public void user_enters_city_to_city() {

        smartPage.city.sendKeys("New York");
    }


    @And("User enters “state” to state")
    public void user_enters_state_to_state() {
        smartPage.state.sendKeys("Delaware");
    }


    @And("User enters “zip” to zip")
    public void user_enters_zip_to_zip() {
        smartPage.zipCode.sendKeys("45612");
    }


    @And("User selects “cardType” as card type")
    public void user_selects_card_type_as_card_type() {
        smartPage.cardType.click();
    }


    @And("User enters “card number” to card number")
    public void user_enters_card_number_to_card_number() {
        smartPage.cardNumber.sendKeys("123987456321");
    }


    @And("User enters “expiration date” to expiration date")
    public void user_enters_expiration_date_to_expiration_date() {
        smartPage.expireDate.sendKeys("12/23");
    }

 @And("User clicks process button")
    public void user_clicks_process_button() {
        smartPage.processButton.click();
    }



    @Then("User verifies “Paul Brown” is in the list")
    public void user_verifies_paul_brown_is_in_the_list() {

    }

 */
