package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
    public static WebDriver driver;
    public ShoppingCartPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }
    @FindBy(xpath = "//span[.='Shopping cart']")
    private WebElement shoppingCartButton;


    @FindBy(xpath = "//input[@id='termsofservice']")
    private WebElement checkListCartButton;
    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement checkOutButton;
    @FindBy(xpath = "//select[@id='billing-address-select']")
    private static WebElement verifyBillingAddress;
    @FindBy(xpath = "//div[@id='billing-buttons-container']/input[@class='button-1 new-address-next-step-button']")
    private WebElement continueButtonInBillingAddress;
    @FindBy(xpath = "//select[@id='shipping-address-select']")
    private static WebElement verifyShippingAddress;
    @FindBy(xpath = "//div[@id='shipping-buttons-container']/input[@class='button-1 new-address-next-step-button']")
    private WebElement continueButtonInShippingAddress;
    @FindBy(xpath = "//input[@value='Ground___Shipping.FixedRate']")
    private WebElement shippingMethodGroundButton;
    @FindBy(xpath = "//input[@class='button-1 shipping-method-next-step-button']")
    private WebElement continueButtonInShippingMethod;
    @FindBy(xpath = "//input[@value='Payments.CashOnDelivery']")
    private WebElement paymentMethodCODButton;
    @FindBy(xpath = "//input[@class='button-1 payment-method-next-step-button']")
    private WebElement continueButtonInPaymentMethod;
    @FindBy(xpath = "//td[contains(.,'You will pay by COD')]")
    private static WebElement verifyPaymentInformation;
    @FindBy(xpath = "//input[@class='button-1 payment-info-next-step-button']")
    private WebElement continueButtonInPaymentInformation;
    @FindBy(xpath = "//th[contains(.,'Product(s)')]")
    private static WebElement verifyConfirmOrder;
    @FindBy(xpath = "//input[@class='button-1 confirm-order-next-step-button']")
    private WebElement continueButtonInConfirmOrder;

    public void clickShoppingCartButton(){
        shoppingCartButton.click();
    }
    public void clickCheckListCartButton(){
        checkListCartButton.click();
    }
    public void clickCheckOutButton(){
        checkOutButton.click();
    }
    public static boolean verifyBillingAddress(){
        return verifyBillingAddress.isDisplayed();
    }
    public void clickContinueButtonInBillingAddress(){
        continueButtonInBillingAddress.click();
    }
    public static boolean verifyShippingAddress(){
        return verifyShippingAddress.isDisplayed();
    }
    public void clickContinueButtonInShippingAddress(){
        continueButtonInShippingAddress.click();
    }
    public void clickShippingMethodGroundButton(){
        shippingMethodGroundButton.click();
    }
    public void clickContinueButtonInShippingMethod(){
        continueButtonInShippingMethod.click();
    }
    public void clickPaymentMethodCODButton(){
        paymentMethodCODButton.click();
    }
    public void clickContinueButtonInPaymentMethod(){
        continueButtonInPaymentMethod.click();
    }
    public static boolean verifyPaymentInformation(){
        return verifyPaymentInformation.isDisplayed();
    }
    public void clickContinueButtonInPaymentInformation(){
        continueButtonInPaymentInformation.click();
    }
    public static boolean verifyConfirmOrder(){
        return verifyConfirmOrder.isDisplayed();
    }
    public void clickContinueButtonInConfirmOrder(){
        continueButtonInConfirmOrder.click();
    }

}
