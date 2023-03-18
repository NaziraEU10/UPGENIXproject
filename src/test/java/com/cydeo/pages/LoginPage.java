package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
  @FindBy(id="login")
    public WebElement usernameInput;

  @FindBy(id="password")
    public WebElement passwordInput;

  @FindBy(xpath="//button[.='Log in']")
    public WebElement signInButton;


}
