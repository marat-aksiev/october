package com.carina.step_definitions;

import com.carina.pages.HomePage;
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
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    @Given("user is one the Amazon main page")
    public void user_is_one_the_amazon_main_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user prints {string} in the search box")
    public void user_prints_in_the_search_box(String product_name) {
        wait.until(ExpectedConditions.visibilityOf(homePage.searchBar));
        homePage.searchBar.sendKeys(product_name);
    }

    @When("users clicks search button")
    public void users_clicks_search_button() {
        homePage.searchGoButton.click();
    }

    @Then("user sees the result with {string}")
    public void user_sees_the_result_with(String product_name) {
        Assert.assertTrue(Driver.getDriver().getTitle().equals("Amazon : " + product_name.toLowerCase()));
        Driver.closeDriver();
    }
}
