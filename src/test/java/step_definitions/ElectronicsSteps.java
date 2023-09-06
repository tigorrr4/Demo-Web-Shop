package step_definitions;

import PageObject.DigitalDownloadsPage;
import PageObject.ElectronicPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ElectronicsSteps {
    public WebDriver webDriver;

    public ElectronicsSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("User click electronics on menu")
    public void userClickElectronicsOnMenu() {
        ElectronicPage electronicPage = new ElectronicPage(webDriver);
        electronicPage.clickElectronicsButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User click cell phones")
    public void userClickCellPhones() {
        ElectronicPage electronicPage = new ElectronicPage(webDriver);
        electronicPage.clickPhoneButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User add Smartphone to cart")
    public void userAddSmartphoneToCart() {
        ElectronicPage electronicPage = new ElectronicPage(webDriver);
        electronicPage.clickPhoneAddToCartButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
}
