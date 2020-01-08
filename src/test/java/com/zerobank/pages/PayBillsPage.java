package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PayBillsPage extends BasePage{

    @FindBy(id = "sp_payee")
    public WebElement payeeDropdown; // Sprint, Bank of America, Apple, Wells Fargo

    @FindBy(id = "sp_account")
    public WebElement accountDropdown; // Savings, Checking, Savings, Loan, Credit Card, Brokerage

    @FindBy(id = "sp_amount")
    public WebElement amount$Box;

    @FindBy(id = "sp_date")
    public WebElement dateBox;

    @FindBy(id = "sp_description")
    public WebElement descriptionBox;

    @FindBy(css = "span[title^='$']")
    public WebElement confirmationMessage;   // The payment was successfully submitted.

    public PayBillsPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    public void successfulPaymentOperation(){
        selectDropdownOption(payeeDropdown, "Apple");
        selectDropdownOption(accountDropdown, "Loan");
        amount$Box.sendKeys("150000");
        dateBox.sendKeys("2020-01-16");
        descriptionBox.sendKeys("Down payment", Keys.ENTER);
    }

    public void paymentOperation(String payeeOption, String accountOption, String amount, String dateYYYY_dash_MM_dash_DD){
        selectDropdownOption(payeeDropdown, payeeOption);
        selectDropdownOption(accountDropdown, accountOption);
        amount$Box.sendKeys(amount);
        dateBox.sendKeys(dateYYYY_dash_MM_dash_DD);
        descriptionBox.sendKeys("down payment", Keys.ENTER);
    }
}
