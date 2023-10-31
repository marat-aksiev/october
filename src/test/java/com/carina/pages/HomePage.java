package com.carina.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//button[@class='usaa-globalHeader-utilityButton'][1]")
    public WebElement searchBtn;

    @FindBy(xpath = "//input[@id='usaa-globalHeader-searchInput']")
    public WebElement searchBar;

    @FindBy(xpath = "//button[@class='usaa-globalHeader-searchSubmit']")
    public WebElement searchSubmit;
}
