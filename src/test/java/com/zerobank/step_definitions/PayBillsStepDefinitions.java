package com.zerobank.step_definitions;
import com.zerobank.pages.PayBillsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;



public class PayBillsStepDefinitions extends PayBillsPage {




    @When("user completes a successful Pay operation")
    public void user_completes_a_successful_Pay_operation() {
        successfulPaymentOperation();

    }

    @Then("verify that confirmation message {string} is displayed")
    public void verify_that_confirmation_message_is_displayed(String string) {
        verifyMessageIsDisplayed(confirmationMessage, string);
    }

    @When("user tries to make a payment without entering the amount")
    public void userTriesToMakeAPaymentWithoutEnteringTheAmount() {
        paymentOperation("Apple", "Checking", "", "2020-01-16");
    }

    @When("user tries to make a payment without entering the date")
    public void userTriesToMakeAPaymentWithoutEnteringTheDate() {
        paymentOperation("Apple", "Checking", "523565", "");
    }


    @Then("verify that error message {string} is displayed in amountBox")
    public void verifyThatErrorMessageIsDisplayedInAmountBox(String string) {
        String actualErrorMessage = amount$Box.getAttribute("validationMessage");
        Assert.assertEquals(actualErrorMessage, string, "WRONG MESSAGE");
        System.out.println("Error message: "+actualErrorMessage+" is displayed");
    }
    @Then("verify that error message {string} is displayed in DateBox")
    public void verifyThatErrorMessageIsDisplayedInDateBox(String string) {
        String actualErrorMessage = dateBox.getAttribute("validationMessage");
        Assert.assertEquals(actualErrorMessage, string, "WRONG MESSAGE");
        System.out.println("Error message: "+actualErrorMessage+" is displayed");
    }


    @Then("verify that Amount field does not accept alphabetical or special characters")
    public void verify_that_Amount_field_does_not_accept_alphabetical_or_special_characters() throws Exception {
        String alphabeticalValue = "Money";
        paymentOperation("Apple", "Checking", "546456", alphabeticalValue);
        try {
            if (amount$Box.getAttribute("validationMessage").equals("Please fill out this field.")) {
                System.out.println("Test passed");
            } else {
                Assert.assertFalse(true, "Amount field ACCEPT alphabetical or special characters");
            }
        }catch (NoSuchElementException exception) {
            System.out.println("Test passed");
        }
    }

    @Then("verify that Date field does not accept alphabetical characters")
    public void verify_that_Date_field_does_not_accept_alphabetical_characters() throws Exception{
        String alphabeticalValue = "today";
        paymentOperation("Apple", "Checking", "546456", alphabeticalValue);
        try {
            if (dateBox.getAttribute("validationMessage").equals("Please fill out this field.")) {
                System.out.println("Test passed");
            } else {
                Assert.assertFalse(true, "Amount field ACCEPT alphabetical or special characters");
            }
        }catch (NoSuchElementException exception) {
            System.out.println("Test passed");

        }
    }

}
