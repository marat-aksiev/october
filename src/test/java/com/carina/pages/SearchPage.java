package com.carina.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{

    @FindBy(xpath = "//a[@href='https://www.usaa.com/insurance/small-business?SearchRanking=1&SearchLinkPhrase=insurance']")
    public WebElement searchElem;

}
