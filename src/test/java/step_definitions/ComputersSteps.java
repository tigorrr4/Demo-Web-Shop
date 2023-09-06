package step_definitions;

import PageObject.ComputersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ComputersSteps {
    public WebDriver webDriver;
    public ComputersSteps() {
        super();
        this.webDriver = Hooks.webDriver;

    }
    @When("User click Electronics on menu")
    public void userClickElectronicsOnMenu() {
        ComputersPage ComputerPage = new ComputersPage(webDriver);
        ComputerPage.clickComputersButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User add {int} inch Laptop to cart")
    public void userAddInchLaptopToCart(int arg0) {
        ComputersPage ComputerPage = new ComputersPage(webDriver);
        ComputerPage.clickLaptopAddToCartButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User click notebooks")
    public void userClickNotebooks() {
        ComputersPage ComputerPage = new ComputersPage(webDriver);
        ComputerPage.clickNotebooksButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User click Accessories")
    public void userClickAccessories() {
        ComputersPage ComputerPage = new ComputersPage(webDriver);
        ComputerPage.clickAccessoriesButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User add TCP Self-Paced Training additional month and TCP Instructor Led Training to cart")
    public void userAddTCPSelfPacedTrainingAdditionalMonthAndTCPInstructorLedTrainingToCart() {
        ComputersPage ComputerPage = new ComputersPage(webDriver);
        ComputerPage.clickAccessoriesAddToCartButton();
        ComputerPage.clickAccessoriesAddSecondToCartButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User click Desktops")
    public void userClickDesktops() {
        ComputersPage ComputerPage = new ComputersPage(webDriver);
        ComputerPage.clickDesktopsButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("User add Build your own expensive computer cart")
    public void userAddBuildYourOwnComputerCart() {
        ComputersPage ComputerPage = new ComputersPage(webDriver);
        ComputerPage.clickDesktopsAddToCartButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @When("User input their spec computer")
    public void userInputTheirSpecComputer()  {
        ComputersPage ComputerPage = new ComputersPage(webDriver);
        ComputerPage.clickProcessorButton();
        ComputerPage.clickRamButton();
        ComputerPage.clickHddButton();
        ComputerPage.clickSoftwareButton();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    @And("User click filter by price over {int}")
    public void userClickFilterByPriceOver(int arg0) {
        ComputersPage ComputerPage = new ComputersPage(webDriver);
        ComputerPage.clickFilterPriceButtonDesk();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
}
