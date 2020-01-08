package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AccountSummaryPage {

    @FindBy(tagName = "h2")
    List<WebElement> listOfAccountTypes; //Cash Accounts, Investment Accounts, Credit Accounts, Loan Accounts

    @FindBy(xpath = "//div[@class='offset2 span8']/div[3]//tr/th")
    public List<WebElement> listOfCreditAccountsColumn;


    public AccountSummaryPage(){
        PageFactory.initElements(Driver.get(),this);
    }


    public void verifyAccountTypesIsDisplayed(List<String> expectedType){
        for(int i =0; i<listOfAccountTypes.size(); i++){
            boolean a = listOfAccountTypes.get(i).getText().equals(expectedType.get(i)) && listOfAccountTypes.get(i).isDisplayed();
            Assert.assertTrue(a);
            System.out.println("Account type is displayed: " + listOfAccountTypes.get(i).getText());
        }
    }

    public void creditAccountsTableColumnsAreDisplayed(List<String> expectedColumn){
        for (int i =0; i<listOfCreditAccountsColumn.size(); i++){
            boolean a = listOfCreditAccountsColumn.get(i).getText().equals(expectedColumn.get(i)) && listOfCreditAccountsColumn.get(i).isDisplayed();
            Assert.assertTrue(a);
            System.out.println("Credit account table has "+listOfCreditAccountsColumn.get(i).getText()+" column ant it is displayed");
        }
    }
}
