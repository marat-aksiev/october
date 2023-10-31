package com.carina.step_definitions;

import com.carina.pages.HomePage;
import com.carina.pages.SearchPage;
import com.carina.utilities.ConfigurationReader;
import com.carina.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchFunction_StepDefinitions {

    HomePage homePage = new HomePage();
    SearchPage searchPage = new SearchPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    @Given("user is one the USAA main page")
    public void user_is_one_the_usaa_main_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("users clicks search button")
    public void users_clicks_search_button() {
        wait.until(ExpectedConditions.elementToBeClickable(homePage.searchBtn));
        homePage.searchBtn.click();
    }
    @When("user prints {string} in the search box")
    public void user_prints_in_the_search_box(String searchWord) {
        wait.until(ExpectedConditions.elementToBeClickable(homePage.searchBar));
        homePage.searchBar.sendKeys(searchWord);
    }
    @When("user clicks search submit button")
    public void user_clicks_search_submit_button() {
        wait.until(ExpectedConditions.elementToBeClickable(homePage.searchSubmit));
        homePage.searchSubmit.click();
    }
    @When("user clicks on the link")
    public void user_clicks_on_the_link() {
        wait.until(ExpectedConditions.elementToBeClickable(searchPage.searchElem));
        searchPage.searchElem.click();
    }
    @Then("user is on the needed page")
    public void user_is_on_the_needed_page() {
        wait.until(ExpectedConditions.titleIs("Start a Small Business Insurance Quote | USAA | USAA"));
        Assert.assertEquals(Driver.getDriver().getTitle(), "Start a Small Business Insurance Quote | USAA | USAA");
        Driver.closeDriver();
    }
}
