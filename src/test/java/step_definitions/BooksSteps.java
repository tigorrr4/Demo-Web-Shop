package step_definitions;

import PageObject.BooksPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BooksSteps {
    public WebDriver webDriver;
    public BooksSteps() {
        super();
        this.webDriver = Hooks.webDriver;

    }

    @Given("User already login")
    public void userAlreadyLogin() {
    }

    @When("User click books on menu")
    public void userClickBooksOnMenu() {
        BooksPage BooksPage = new BooksPage(webDriver);
        BooksPage.clickBooksButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    @And("User sort by Created on")
    public void userSortByCreatedOn(String sort) {
        BooksPage BooksPage = new BooksPage(webDriver);
        BooksPage.setSortBy(sort);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    @And("User add fiction book to cart")
    public void userAddFictionBookToCart() {
        BooksPage BooksPage = new BooksPage(webDriver);
        BooksPage.clickAddToCartBooksButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Then("User will see message The product has been added to your shopping cart")
    public void userWillSeeMessageTheProductHasBeenAddedToYourShoppingCart() {
        Assert.assertTrue(BooksPage.verifyCart());
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    @And("User click filter by price under {int}")
    public void userClickFilterByPriceUnder(int arg0) {
        BooksPage BooksPage = new BooksPage(webDriver);
        BooksPage.clickFilterByPrice();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    @And("User sort by {string}")
    public void userSortBy(String sort) {
        BooksPage BooksPage = new BooksPage(webDriver);
        BooksPage.setSortBy(sort);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User sort display {string} perpage")
    public void userSortDisplayPerpage(String display) {
        BooksPage BooksPage = new BooksPage(webDriver);
        BooksPage.setDisplaySort(display);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User add Copy of Computing and Internet EX book to cart")
    public void userAddCopyOfComputingAndInternetEXBookToCart() {
        BooksPage BooksPage = new BooksPage(webDriver);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
}
