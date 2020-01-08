package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.BasePage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.List;

public class AccountActivityStepDefinitions {
    BasePage basePage = new BasePage();
    AccountActivityPage accountActivityPage = new AccountActivityPage();

    @Then("navigate to {string}")
    public void navigate_to(String string) {
        basePage.navigateToTab(string);
    }

    @Then("verify that default dropdown value is {string}")
    public void verify_that_default_dropdown_value_is(String string) {
        accountActivityPage.checkDropdownDefaultValue(string);

    }

    @Then("verify that dropdown has next options")
    public void verify_that_dropdown_has_next_options(List<String> dataTable) {
        accountActivityPage.verifyAccountDropdownOptions(dataTable);
    }

    @And("Verify that Transactions table has following columns")
    public void verify_that_Transactions_table_has_following_columns(List<String> dataTable) {
        accountActivityPage.verifyColumnsIsDisplayed(dataTable);
    }
    @Then("Verify that Account Activity page Title has {string} name")
    public void verify_that_Account_Activity_page_Title_has_name(String string) {
        String actualTitle = Driver.get().getTitle();
        System.out.println("Actual title is: "+actualTitle+"! Expected title is: "+string);
    }

}
