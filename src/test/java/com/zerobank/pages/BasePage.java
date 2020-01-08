package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BasePage {


    public void navigateToTab(String tabName) {
        System.out.println("I navigate to " + tabName);
        Driver.get().findElement(By.linkText(tabName)).click();
        BrowserUtils.wait(1);
    }

    public void verifyPageTitle(String expected) {
        Assert.assertEquals(Driver.get().getTitle(), expected, "Wrong Page Title");
    }

    public void selectDropdownOption(WebElement dropdown, String optionName) {
        Select select = new Select(dropdown);
        select.selectByVisibleText(optionName);
    }

    public void verifyMessageIsDisplayed(WebElement actualMessage, String expectedMessage){
        boolean a = actualMessage.getText().equals(expectedMessage) && actualMessage.isDisplayed();
        Assert.assertTrue(a, "WRONG MESSAGE");
        System.out.println("Actual message "+" is displayed");
    }

}
