package step_definitions;

import PageObject.LoginPage;
import PageObject.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginSteps {
    public WebDriver webDriver;

    public LoginSteps() {
        super();
        this.webDriver = Hooks.webDriver;

    }

    @When("User click log in menu")
    public void userClickLogInMenu() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.LoginMenuPage();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User input input {string} as email and user input {string} as password")
    public void userInputInputAsEmailAndUserInputAsPassword(String email, String password) {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setEmailField(email);
        loginPage.setPasswordField(password);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User click login button")
    public void userClickLoginButton() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.loginButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Then("User wil see their email on the page")
    public void userWilSeeTheirEmailOnThePage() {
        Assert.assertTrue(LoginPage.verifyLogin());
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Then("User wil see error message Please enter a valid email address")
    public void userWilSeeErrorMessagePleaseEnterAValidEmailAddress() {
        Assert.assertTrue(LoginPage.verifyInvalidEmail());
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Then("User wil see error message Login was unsuccessful Please correct the errors and try again")
    public void userWilSeeErrorMessageLoginWasUnsuccessfulPleaseCorrectTheErrorsAndTryAgain() {
        Assert.assertTrue(LoginPage.verifyUnregisteredAcc());
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User click remember me button")
    public void userClickRememberMeButton() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickRememberMeButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
}
