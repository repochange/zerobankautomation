package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

    @FindBy(id = "user_login")
    public WebElement username;

    @FindBy(id = "user_password")
    public WebElement password;

    @FindBy(name = "submit")
    public WebElement submit;

    @FindBy(css = "div[class='alert alert-error']")
    public WebElement errorMessage;

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }



    public void login(){
        username.sendKeys(ConfigurationReader.getProperty("user_name"));
        password.sendKeys(ConfigurationReader.getProperty("password"), Keys.ENTER);
        BrowserUtils.wait(1);
    }

    public void login(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password, Keys.ENTER);
        BrowserUtils.wait(1);

    }

    public void verifyErrorMessage(String expectedMessage){
        Assert.assertEquals(errorMessage.getText().trim(), expectedMessage, "Wrong message");
        System.out.println("Actual message is: "+ errorMessage.getText()+ " Expected message is: "+ expectedMessage);
    }

}
