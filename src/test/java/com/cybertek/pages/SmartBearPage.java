package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SmartBearPage {

    public SmartBearPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='Process.aspx']")
    public WebElement orderButton;

    @FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement dropDown;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement quantity;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtName")
    public WebElement customerName;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement streetName;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
    public WebElement city;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
    public WebElement state;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
    public WebElement zipCode;

    @FindBy(xpath = "//table[@id='ctl00_MainContent_fmwOrder_cardList']//td[1]")
    public WebElement cardType;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement cardNumber;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement expireDate;

    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processButton;

    @FindBy(xpath = "//table[@id='ctl00_MainContent_orderGrid']//td[2]")
    public List<WebElement> orderList;
}
