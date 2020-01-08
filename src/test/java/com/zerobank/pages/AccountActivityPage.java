package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;


public class AccountActivityPage {


    @FindBy(id = "aa_accountId")
    public WebElement accountDropdown;

    @FindBy(css = "option[value='1']")
    public WebElement accountDropdownDefaultValue;

    @FindBy(tagName = "option")
    public List<WebElement> accountDropdownOption;

    @FindBy(tagName = "th")
    public List<WebElement> transactionTableColumnNames;

    public AccountActivityPage (){
        PageFactory.initElements(Driver.get(), this);
    }

    public void checkDropdownDefaultValue(String expectedValue){
        boolean a = accountDropdownDefaultValue.isSelected();
        Assert.assertTrue(a);
        String actualValue = accountDropdownDefaultValue.getText();
        Assert.assertEquals(actualValue,expectedValue,"Wrong value");
        System.out.println("Account dropdown default value is: " + actualValue);

    }

    public void verifyAccountDropdownOptions(List<String> expectedDropdownOption){
        List<String> options = new ArrayList<>();
        for(int i =0; i<accountDropdownOption.size(); i++){
            options.add(accountDropdownOption.get(i).getText());
        }
//        for (String expectedOption: expectedDropdownOption) {
//            boolean a = options.contains(expectedOption);
//            Assert.assertTrue(a);
//            System.out.println();
//        }
//        System.out.println("Dropdown options is:"+options);
        boolean a = options.equals(expectedDropdownOption);
        System.out.println("Actual option: "+ options + " Expected option: "+expectedDropdownOption);
        Assert.assertTrue(a);

    }

    public void verifyColumnsIsDisplayed(List<String> expectedColumns){
        for(int i = 0; i<transactionTableColumnNames.size(); i++) {
            boolean a = transactionTableColumnNames.get(i).getText().trim().equals(expectedColumns.get(i)) && transactionTableColumnNames.get(i).isDisplayed();
            Assert.assertTrue(a);
            System.out.println(transactionTableColumnNames.get(i).getText());
        }

    }

}
