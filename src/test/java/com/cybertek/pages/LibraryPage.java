package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LibraryPage {

    public LibraryPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "inputEmail")
    public WebElement emailInput;

    @FindBy(id = "inputPassword")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@class='btn btn-lg btn-primary btn-block']")
    public WebElement signButton;
    
    @FindBy(xpath = "//nav[@class='navbar navbar-expand-md navbar-dark fixed-top bg-dark']//span")
    public List<WebElement> pageSelection;



 
}
