package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        String urlName = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(urlName);

    }

    @When("I enter username {string}")
    public void i_enter_username(String string) {
        String username = ConfigurationReader.getProperty("PosManagerUser");
        loginPage.usernameInput.sendKeys(username);
    }

    @When("I enter password {string}")
    public void i_enter_password(String string) {
        String password = ConfigurationReader.getProperty("PosManagerPassword");
        loginPage.passwordInput.sendKeys(password);
    }

    @When("Click the login button")
    public void click_the_login_button() {

        loginPage.signInButton.click();
    }


    @When("I enter username  {string}")
    public void iEnterUsername(String string) {
        String username2 = ConfigurationReader.getProperty("SalesManagerUser");
        loginPage.usernameInput.sendKeys(username2);
    }

    @Then("User should be able to validate page title")
    public void userShouldBeAbleToValidatePageTitle() {
        String expected = "Odoo";
        String actual = Driver.getDriver().getTitle();

        Assert.assertEquals(actual,expected);

        BrowserUtils.sleep(2);


    }

    @Given("User should be able to navigate to webpage")
    public void userShouldBeAbleToNavigateToWebpage() {
        String urlName = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(urlName);
    }

    @When("User should be able to enter username {string}")
    public void userShouldBeAbleToEnterUsername(String username) {
        loginPage.usernameInput.sendKeys(username);
    }

    @And("User should be able to enter password {string}")
    public void userShouldBeAbleToEnterPassword(String password) {
        loginPage.passwordInput.sendKeys(password);
    }

    @Then("User should be able to logout from the {string} account")
    public void userShouldBeAbleToLogoutFromTheAccount(String username) {
        loginPage.clickUsernameDropdownBtn(username);
        BrowserUtils.sleep(2);
        loginPage.logOutBtn.click();
        BrowserUtils.sleep(2);
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Login"));

    }
}