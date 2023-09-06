package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicPage {
    public static WebDriver driver;
    public ElectronicPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }
    @FindBy(xpath = "//ul[@class='top-menu']//a[contains(.,'Electronics')]")
    private WebElement electronicsButton;
    @FindBy(xpath = "//div[@class='sub-category-grid']/div[2]//div[@class='picture']")
    private WebElement phoneButton;
    @FindBy(xpath = "//div[@class='product-grid']//div[3]//input[@class='button-2 product-box-add-to-cart-button']")
    private WebElement phoneAddToCartButton;
    public void clickElectronicsButton(){
        electronicsButton.click();
    }
    public void clickPhoneButton(){
        phoneButton.click();
    }
    public void clickPhoneAddToCartButton(){
        phoneAddToCartButton.click();
    }
}
