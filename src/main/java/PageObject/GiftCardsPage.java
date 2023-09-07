package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCardsPage {
    public static WebDriver driver;
    public GiftCardsPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }
    @FindBy(xpath = "//ul[@class='top-menu']//a[contains(.,'Gift Cards')]")
    private WebElement cardsButton;
    @FindBy(xpath = "//div[@class='product-grid']/div[1]//input[@class='button-2 product-box-add-to-cart-button']")
    private WebElement giftCardsButton;
    @FindBy(xpath = "//div[@class='product-grid']/div[2]//input[@class='button-2 product-box-add-to-cart-button']")
    private WebElement giftCards50Button;
    @FindBy(xpath = "//div[@class='product-grid']/div[3]//input[@class='button-2 product-box-add-to-cart-button']")
    private WebElement giftCards25Button;
    @FindBy(xpath = "//input[@class='recipient-name']")
    private WebElement recipientNameField;
    @FindBy(xpath = "//input[@class='button-1 add-to-cart-button']")
    private WebElement AddtoCartButton;

    public void clickGiftCardsButton(){
        giftCardsButton.click();
    }
    public void clickcardsButton(){
        cardsButton.click();
    }
    public void clickAddtoCartButton(){
        AddtoCartButton.click();
    }
    public void recipientNameField(String recipient) {
        recipientNameField.sendKeys(recipient);
    }
    public void clickGift50CardsButton(){
        giftCards50Button.click();
    }
    public void clickGift25CardsButton(){
        giftCards25Button.click();
    }
}
