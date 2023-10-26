package com.carina.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//input[@id='nav-bb-search']")
    public WebElement searchBar;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement searchGoButton;

}
