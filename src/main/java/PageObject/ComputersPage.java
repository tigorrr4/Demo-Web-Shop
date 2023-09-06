package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ComputersPage {
    public static WebDriver driver;
    public ComputersPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }
    @FindBy(xpath = "//ul[@class='top-menu']//a[contains(.,'Computers')]")
    private WebElement computersButton;
    @FindBy(xpath = "//div[@class='sub-category-grid']/div[2]//div[@class='picture']")
    private WebElement notebooksButton;
    @FindBy(xpath = "//input[@class='button-2 product-box-add-to-cart-button']")
    private WebElement laptopAddToCartButton;
    @FindBy(xpath = "//div[@class='sub-category-grid']/div[3]//div[@class='picture']")
    private WebElement accessoriesButton;
    @FindBy(xpath = "//a[contains(.,'Over 100.00')]")
    private WebElement filterPriceButton;
    @FindBy(xpath = "//div[@class='product-grid']/div[1]//input[@class='button-2 product-box-add-to-cart-button']")
    private WebElement accessoriesAddToCartButton;
    @FindBy(xpath = "//div[@class='product-grid']/div[2]//input[@class='button-2 product-box-add-to-cart-button']")
    private WebElement accessoriesAddSecondToCartButton;
    @FindBy(xpath = "//div[@class='sub-category-grid']/div[1]//div[@class='picture']")
    private WebElement desktopsButton;
    @FindBy(xpath = "//a[contains(.,'Over 1200.00')]")
    private WebElement filterPriceButtonDesk;
    @FindBy(xpath = "//div[@class='product-grid']/div[1]//input[@class='button-2 product-box-add-to-cart-button']")
    private WebElement desktopsAddToCartButton;
    @FindBy(xpath = "//input[@value='82']")
    private WebElement processorButton;
    @FindBy(xpath = "//input[@value='85']")
    private WebElement ramButton;
    @FindBy(xpath = "//input[@value='87']")
    private WebElement hddButton;
    @FindBy(xpath = "//input[@value='90']")
    private WebElement softwareButton;




    public void clickComputersButton() {
        computersButton.click();
    }
    public void clickNotebooksButton() {
        notebooksButton.click();
    }
    public void clickLaptopAddToCartButton() {
        laptopAddToCartButton.click();
    }
    public void clickAccessoriesButton() {
        accessoriesButton.click();
    }
    public void clickFilterPriceButton() {
        filterPriceButton.click();
    }
    public void clickAccessoriesAddToCartButton() {
        accessoriesAddToCartButton.click();
    }
    public void clickAccessoriesAddSecondToCartButton() {
        accessoriesAddSecondToCartButton.click();
    }
    public void clickDesktopsButton() {
        desktopsButton.click();
    }
    public void clickFilterPriceButtonDesk() {
        filterPriceButtonDesk.click();
    }
    public void clickDesktopsAddToCartButton() {
        desktopsAddToCartButton.click();
    }
    public void clickProcessorButton() {
        processorButton.click();
    }
    public void clickRamButton() {
        ramButton.click();
    }
    public void clickSoftwareButton() {
        softwareButton.click();
    }
    public void clickHddButton() {
        hddButton.click();
    }







}
