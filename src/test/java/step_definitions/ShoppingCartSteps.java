package step_definitions;

import PageObject.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ShoppingCartSteps {
    public WebDriver webDriver;

    public ShoppingCartSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }


    @Given("User add item in shopping cart")
    public void userAddItemInShoppingCart() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.LoginMenuPage();
        loginPage.setEmailField("tigorthorir@gmail.com");
        loginPage.setPasswordField("tigor123");
        loginPage.loginButton();
        ElectronicPage electronicPage = new ElectronicPage(webDriver);
        electronicPage.clickElectronicsButton();
        electronicPage.clickPhoneButton();
        electronicPage.clickPhoneAddToCartButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    @When("User click shopping cart")
    public void userClickShoppingCart() {
        ShoppingCartPage ShoppingCartPage = new ShoppingCartPage(webDriver);
        ShoppingCartPage.clickShoppingCartButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

//    @And("User click item want to check out")
//    public void userClickItemWantToCheckOut() {
//        ShoppingCartPage ShoppingCartPage = new ShoppingCartPage(webDriver);
//        ShoppingCartPage.clickCheckListCartButton();
//        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//    }

    @And("User click I agree with the terms of service and I adhere to them unconditionally")
    public void userClickIAgreeWithTheTermsOfServiceAndIAdhereToThemUnconditionally() {
        ShoppingCartPage ShoppingCartPage = new ShoppingCartPage(webDriver);
        ShoppingCartPage.clickCheckListCartButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User click check out button")
    public void userClickCheckOutButton() {
        ShoppingCartPage ShoppingCartPage = new ShoppingCartPage(webDriver);
        ShoppingCartPage.clickCheckOutButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Then("User verify their billing address")
    public void userVerifyTheirBillingAddress() {
        Assert.assertTrue(ShoppingCartPage.verifyBillingAddress());
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User click continue in billing address")
    public void userClickContinueInBillingAddress() {
        ShoppingCartPage ShoppingCartPage = new ShoppingCartPage(webDriver);
        ShoppingCartPage.clickContinueButtonInBillingAddress();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Then("User verify their shipping address")
    public void userVerifyTheirShippingAddress() {
        Assert.assertTrue(ShoppingCartPage.verifyShippingAddress());
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User click continue in shipping address")
    public void userClickContinueInShippingAddress() {
        ShoppingCartPage ShoppingCartPage = new ShoppingCartPage(webDriver);
        ShoppingCartPage.clickContinueButtonInShippingAddress();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    @And("User click shipping method ground")
    public void userClickShippingMethodGround() {
        ShoppingCartPage ShoppingCartPage = new ShoppingCartPage(webDriver);
        ShoppingCartPage.clickShippingMethodGroundButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @When("User click continue in shipping method")
    public void userClickContinueInShippingMethod() {
        ShoppingCartPage ShoppingCartPage = new ShoppingCartPage(webDriver);
        ShoppingCartPage.clickContinueButtonInShippingMethod();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User click payment method COD")
    public void userClickPaymentMethodCOD() {
        ShoppingCartPage ShoppingCartPage = new ShoppingCartPage(webDriver);
        ShoppingCartPage.clickPaymentMethodCODButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    @And("User click continue in payment method")
    public void userClickContinueInPaymentMethod() {
        ShoppingCartPage ShoppingCartPage = new ShoppingCartPage(webDriver);
        ShoppingCartPage.clickContinueButtonInPaymentMethod();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Then("User verify their payment information")
    public void userVerifyTheirPaymentInformation() {
        Assert.assertTrue(ShoppingCartPage.verifyPaymentInformation());
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    @And("User click continue in payment information")
    public void userClickContinueInPaymentInformation() {
        ShoppingCartPage ShoppingCartPage = new ShoppingCartPage(webDriver);
        ShoppingCartPage.clickContinueButtonInPaymentInformation();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User verify confirm order")
    public void userVerifyConfirmOrder() {
        Assert.assertTrue(ShoppingCartPage.verifyConfirmOrder());
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User click continue in confirm order")
    public void userClickContinueInConfirmOrder() {
        ShoppingCartPage ShoppingCartPage = new ShoppingCartPage(webDriver);
        ShoppingCartPage.clickContinueButtonInConfirmOrder();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Then("User verify successfully order")
    public void userVerifySuccessfullyOrder() {
        Assert.assertTrue(ShoppingCartPage.verifyConfirmOrder());
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
}
