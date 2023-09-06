package step_definitions;

import PageObject.BooksPage;
import PageObject.JewelryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class JewelrySteps {
    public WebDriver webDriver;
    public JewelrySteps() {
        super();
        this.webDriver = Hooks.webDriver;

    }
    @When("User click jewelry on menu")
    public void userClickJewelryOnMenu() {
        JewelryPage JewelryPage = new JewelryPage(webDriver);
        JewelryPage.clickJewelryButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User click filter by price under {string}")
    public void userClickFilterByPriceUnder(String arg0) {
        JewelryPage JewelryPage = new JewelryPage(webDriver);
        JewelryPage.clickFilterPriceButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User add Black & White Diamond Heart to cart")
    public void userAddBlackWhiteDiamondHeartToCart() {
        JewelryPage JewelryPage = new JewelryPage(webDriver);
        JewelryPage.clickAddToCartJewelryButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
}
