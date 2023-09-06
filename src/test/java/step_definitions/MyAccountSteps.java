package step_definitions;

import PageObject.BooksPage;
import PageObject.LoginPage;
import PageObject.MyAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class MyAccountSteps {
    public WebDriver webDriver;

    public MyAccountSteps() {
        super();
        this.webDriver = Hooks.webDriver;

    }
    @When("User click their email at menu page")
    public void userClickTheirEmailAtMenuPage() {
        MyAccountPage MyAccountPage = new MyAccountPage(webDriver);
        MyAccountPage.clickProfileButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User click customer info")
    public void userClickCustomerInfo() {
        MyAccountPage MyAccountPage = new MyAccountPage(webDriver);
        MyAccountPage.clickCustomerInfoButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User Update first name and input {string}")
    public void userUpdateFirstNameAndInput(String firstName) {
        MyAccountPage MyAccountPage = new MyAccountPage(webDriver);
        MyAccountPage.setFirstNameField(firstName);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User Update last name and input {string}")
    public void userUpdateLastNameAndInput(String lastName) {
        MyAccountPage MyAccountPage = new MyAccountPage(webDriver);
        MyAccountPage.setLastNameField(lastName);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @When("User click save button")
    public void userClickSaveButton() {
        MyAccountPage MyAccountPage = new MyAccountPage(webDriver);
        MyAccountPage.clickSaveButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Then("User account will update")
    public void userAccountWillUpdate() {
        Assert.assertTrue(MyAccountPage.verify());
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User click change password")
    public void userClickChangePassword() {
        MyAccountPage MyAccountPage = new MyAccountPage(webDriver);
        MyAccountPage.clickChangePasswordButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User Update old password and input {string}")
    public void userUpdateOldPasswordAndInput(String oldPassword) {
        MyAccountPage MyAccountPage = new MyAccountPage(webDriver);
        MyAccountPage.setOldPasswordField(oldPassword);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    @And("User Update new password and input {string}")
    public void userUpdateNewPasswordAndInput(String NewPassword) {
        MyAccountPage MyAccountPage = new MyAccountPage(webDriver);
        MyAccountPage.setNewPasswordField(NewPassword);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User Update confirm password and input {string}")
    public void userUpdateConfirmPasswordAndInput(String ConfirmPassword) {
        MyAccountPage MyAccountPage = new MyAccountPage(webDriver);
        MyAccountPage.setConfirmPasswordField(ConfirmPassword);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @When("User click change password button")
    public void userClickChangePasswordButton() {
        MyAccountPage MyAccountPage = new MyAccountPage(webDriver);
        MyAccountPage.clickChangePsdButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
}
