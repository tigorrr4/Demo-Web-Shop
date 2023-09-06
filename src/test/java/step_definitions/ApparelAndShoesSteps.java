package step_definitions;

import PageObject.ApparelAndShoesPage;
import PageObject.BooksPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ApparelAndShoesSteps {
    public WebDriver webDriver;
    public ApparelAndShoesSteps() {
        super();
        this.webDriver = Hooks.webDriver;

    }
    @When("User click Apparel and Shoes on menu")
    public void userClickApparelAndShoesOnMenu() {
        ApparelAndShoesPage ApparelAndShoesPage  = new ApparelAndShoesPage(webDriver);
        ApparelAndShoesPage.clickApparelAndShoesButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User add blue jeans to cart")
    public void userAddBlueJeansToCart() {
        ApparelAndShoesPage ApparelAndShoesPage  = new ApparelAndShoesPage(webDriver);
        ApparelAndShoesPage.clickBlueJeansButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User add Casual Golf Belts to cart")
    public void userAddCasualGolfBeltsToCart() {
        ApparelAndShoesPage ApparelAndShoesPage  = new ApparelAndShoesPage(webDriver);
        ApparelAndShoesPage.clickBeltButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User add Leather Handbag,Men's Wrinkle Free Long Sleeve, and Blue and green Sneaker to cart")
    public void userAddLeatherHandbagMenSWrinkleFreeLongSleeveAndBlueAndGreenSneakerToCart() {
        ApparelAndShoesPage ApparelAndShoesPage  = new ApparelAndShoesPage(webDriver);
        ApparelAndShoesPage.clickBagButton();
        ApparelAndShoesPage.clickLongSleeveButton();
        ApparelAndShoesPage.clickShoesButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
}
