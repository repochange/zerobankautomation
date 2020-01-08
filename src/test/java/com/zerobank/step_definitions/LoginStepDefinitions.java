package com.zerobank.step_definitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginStepDefinitions {
    LoginPage loginPage = new LoginPage();
    private WebDriverWait wait;


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("I am on the login page");
        Driver.get().get(ConfigurationReader.getProperty("url"));

    }

    @Then("user logs in with valid credentials")
    public void user_logs_in_with_valid_credentials() {
        loginPage.login();
    }

    @Then("user verifies that {string} page subtitle is displayed")
    public void user_verifies_that_page_subtitle_is_displayed(String expectedSubTitle) {
        wait = new WebDriverWait(Driver.get(), 10);
        wait.until(ExpectedConditions.titleIs(expectedSubTitle));
        String actualSubTitle = Driver.get().getTitle();
        Assert.assertEquals(actualSubTitle,expectedSubTitle, "Wrong title");
        System.out.println("Subtitle is: " +actualSubTitle);



    }

    @Then("user enters {string} username and {string} password")
    public void user_enters_username_and_password(String CheckUsername, String Password) {
        loginPage.login(CheckUsername, Password);

    }

    @And("user verifies that {string} error message is displayed")
    public void user_verifies_that_error_message_is_Displayed(String expectedMessage) {
        loginPage.verifyErrorMessage(expectedMessage);
    }
}
