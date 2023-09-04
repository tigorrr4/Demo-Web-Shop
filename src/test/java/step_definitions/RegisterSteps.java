package step_definitions;

import PageObject.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class RegisterSteps {
    public WebDriver webDriver;

    public RegisterSteps(){
        super();
        this.webDriver = Hooks.webDriver;



    }
    @Given("User already on demo web shop website")
    public void userAlreadyOnDemoWebShopWebsite() {
        RegisterPage registerPage = new RegisterPage(webDriver);
        Assert.assertTrue(RegisterPage.verifyLandingPage());
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @When("User click register menu")
    public void userClickRegisterMenu() {
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.clickRegisterPageButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User click gender and input {string} as Firstname, input {string} as Lastname, input {string} as email")
    public void userClickGenderAndInputAsFirstnameInputAsLastnameInputAsEmail(String Name, String lastName, String registerEmail) {
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.clickGenderSelect();
        registerPage.setFirstName(Name);
        registerPage.setLastNameField(lastName);
        registerPage.setEmailField(registerEmail);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);


    }

    @And("User input {string} as password, and input {string} as confirm password")
    public void userInputAsPasswordAndInputAsConfirmPassword(String password, String confirmPassword) {
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.setPasswordField(password);
        registerPage.setConfirmPasswordField(confirmPassword);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User click register button")
    public void userClickRegisterButton() {
        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.clickRegisterButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Then("User wil see registration completed")
    public void userWilSeeRegistrationCompleted() {
        RegisterPage registerPage = new RegisterPage(webDriver);
        Assert.assertTrue(RegisterPage.verifyRegister());
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
}
