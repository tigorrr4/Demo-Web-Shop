package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JewelryPage {
    public static WebDriver driver;
    public JewelryPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }
    @FindBy(xpath = "//ul[@class='top-menu']//a[contains(.,'Jewelry')]")
    private WebElement jewelryButton;
    @FindBy(xpath = "//a[contains(.,'0.00 - 500.00')]")
    private WebElement filterPriceButton;
    @FindBy(xpath = "//div[@class='product-grid']/div[3]//input[@class='button-2 product-box-add-to-cart-button']")
    private WebElement addToCartJewelryButton;
    public void clickJewelryButton(){
        jewelryButton.click();
    }
    public void clickFilterPriceButton(){
        filterPriceButton.click();
    }
    public void clickAddToCartJewelryButton(){
        addToCartJewelryButton.click();
    }
}
