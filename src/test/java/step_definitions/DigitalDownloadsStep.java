package step_definitions;

import PageObject.BooksPage;
import PageObject.DigitalDownloadsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class DigitalDownloadsStep {
    public WebDriver webDriver;
    public DigitalDownloadsStep() {
        super();
        this.webDriver = Hooks.webDriver;

    }

    @When("User click digital downloads on menu")
    public void userClickDigitalDownloadsOnMenu() {
        DigitalDownloadsPage digitalDownloadsPage = new DigitalDownloadsPage(webDriver);
        digitalDownloadsPage.clickDigitalDownloadsButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User add {int}rd Album to cart")
    public void userAddRdAlbumToCart(int arg0) {
        DigitalDownloadsPage digitalDownloadsPage = new DigitalDownloadsPage(webDriver);
        digitalDownloadsPage.clickAlbumButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
}
