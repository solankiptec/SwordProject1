package Sword;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class MySwordStepDefs extends BasePage{
    HomePage homePage = new HomePage();
    @Given("^I am on homepage$")
    public void i_am_on_homepage()  {
        homePage.getUrl();

    }

    @When("^I enter valid \"([^\"]*)\" in search box$")
    public void i_enter_valid_in_search_box(String search)  {
        homePage.serchProduct(search);
    }
    @Then("^I should able to search successfully$")
    public void iShouldAbleToSearchSuccessfully()  {
        SoftAssert softAssert = new SoftAssert();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        softAssert.assertAll();
        System.out.println("All the links in search are working");

    }
}
