package com.example.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends com.example.selenium.pages.BasePage {

    @FindBy(how = How.CSS, using = "h2")
    private WebElement titleLocator;
    @FindBy(how = How.CSS, using = ".icon-2x")
    private WebElement logoutLocator;


    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getTitle() {
        return titleLocator.getText();
    }

    public MainPage clickLogout() {
        logoutLocator.click();
        return this;
    }
}
