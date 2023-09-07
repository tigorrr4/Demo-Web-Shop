package step_definitions;

import PageObject.BooksPage;
import PageObject.GiftCardsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class GiftCardsSteps {
    public WebDriver webDriver;
    public GiftCardsSteps() {
        super();
        this.webDriver = Hooks.webDriver;

    }
    @When("User click gift cards on menu")
    public void userClickGiftCardsOnMenu() {
        GiftCardsPage GiftCardPage = new GiftCardsPage(webDriver);
        GiftCardPage.clickcardsButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User add ${int} Physical Gift Card to cart")
    public void userAdd$PhysicalGiftCardToCart(int arg0) throws InterruptedException {
        GiftCardsPage GiftCardPage = new GiftCardsPage(webDriver);
        GiftCardPage.clickGiftCardsButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @When("User input Recipient's Name {string}")
    public void userInputRecipientSName(String recipient) throws InterruptedException {
        GiftCardsPage GiftCardPage = new GiftCardsPage(webDriver);
        GiftCardPage.recipientNameField(recipient);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User click add to cart")
    public void userClickAddToCart() {
        GiftCardsPage GiftCardPage = new GiftCardsPage(webDriver);
        GiftCardPage.clickAddtoCartButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    @And("User add ${int} Physicall Gift Card to cart")
    public void userAdd$PhysicallGiftCardToCart(int arg0) {
        GiftCardsPage GiftCardPage = new GiftCardsPage(webDriver);
        GiftCardPage.clickGift50CardsButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User addd ${int} Physical Gift Card to cart")
    public void userAddd$PhysicalGiftCardToCart(int arg0) {
        GiftCardsPage GiftCardPage = new GiftCardsPage(webDriver);
        GiftCardPage.clickGift25CardsButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
}
