package com.zerobank.step_definitions;

import com.zerobank.pages.AccountSummaryPage;
import io.cucumber.java.en.Then;

import java.util.List;

public class AccountSummaryStepDefinitions {
    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();

    @Then("verify that account types are displayed")
    public void verify_that_account_types_are_displayed(List<String> dataTable) {
        accountSummaryPage.verifyAccountTypesIsDisplayed(dataTable);
    }

    @Then("verify that Credit Accounts table columns are displayed")
    public void verify_that_Credit_Accounts_table_columns_are_displayed(List<String> dataTable) {
        accountSummaryPage.creditAccountsTableColumnsAreDisplayed(dataTable);

    }

}
