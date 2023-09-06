package step_definitions;

import PageObject.GiftCardsPage;
import PageObject.MyAccountPage;
import PageObject.WishlistPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class WishlistSteps {
    public WebDriver webDriver;

    public WishlistSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }



    @When("User click add to wishlist button")
    public void userClickAddToWishlistButton() throws InterruptedException {
        WishlistPage WishlistPage = new WishlistPage(webDriver);
        WishlistPage.clickWishListCartButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Then("User will see message The product has been added to your wishlist")
    public void userWillSeeMessageTheProductHasBeenAddedToYourWishlist() {
        Assert.assertTrue(WishlistPage.verifyWishlist());
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User click wishlist button")
    public void userClickWishlistButton() {
        WishlistPage WishlistPage = new WishlistPage(webDriver);
        WishlistPage.clickWishListButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @When("User will see their item in wishlist page")
    public void userWillSeeTheirItemInWishlistPage() {
        Assert.assertTrue(WishlistPage.verifyItem());
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User click remove on item want their remove")
    public void userClickRemoveOnItemWantTheirRemove() {
        WishlistPage WishlistPage = new WishlistPage(webDriver);
        WishlistPage.clickRemoveButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User click update wishlist")
    public void userClickUpdateWishlist() {
        WishlistPage WishlistPage = new WishlistPage(webDriver);
        WishlistPage.clickUpdateWishlistButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User will see their item got remove")
    public void userWillSeeTheirItemGotRemove() {
        Assert.assertTrue(WishlistPage.verifyItemRemove());
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    @And("User click add to cart on item want their add")
    public void userClickAddToCartOnItemWantTheirAdd() {
        WishlistPage WishlistPage = new WishlistPage(webDriver);
        WishlistPage.clickAddToCartWishList();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User click add to cart on wishlist")
    public void userClickAddToCartOnWishlist() {
        WishlistPage WishlistPage = new WishlistPage(webDriver);
        WishlistPage.clickAddToCartToShop();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User click email a friend button")
    public void userClickEmailAFriendButton() {
        WishlistPage WishlistPage = new WishlistPage(webDriver);
        WishlistPage.clickEmailAFriendButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @When("User will input friens email with {string}")
    public void userWillInputFriensEmailWith(String friendsEmail) {
        WishlistPage WishlistPage = new WishlistPage(webDriver);
        WishlistPage.friendsEmailField(friendsEmail);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User click send email")
    public void userClickSendEmail() {
        WishlistPage WishlistPage = new WishlistPage(webDriver);
        WishlistPage.clickSendEmailButon();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
}
