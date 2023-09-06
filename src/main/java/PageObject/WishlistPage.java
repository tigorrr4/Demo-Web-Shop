package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage {
    public static WebDriver driver;
    public WishlistPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@class='button-2 add-to-wishlist-button']")
    private WebElement wishListCartButton;
    @FindBy(xpath = "//a[.='wishlist']")
    private static WebElement verifyWishlist;
    @FindBy(xpath = "//span[.='Wishlist']")
    private WebElement wishListButton;
    @FindBy(xpath = "//th[contains(.,'Product(s)')]")
    private static WebElement verifyItem;
    @FindBy(xpath = "//input[@name='removefromcart']")
    private WebElement removeButton;
    @FindBy(xpath = "//input[@name='updatecart']")
    private WebElement updateWishlistButton;
    @FindBy(xpath = "//h1[contains(.,'Wishlist')]")
    private static WebElement verifyItemRemove;
    @FindBy(xpath = "//input[@name='addtocart']")
    private WebElement addToCartWishList;
    @FindBy(xpath = "//input[@name='addtocartbutton']")
    private WebElement addToCartToShop;
    @FindBy(xpath = "//input[@class='button-2 email-a-friend-wishlist-button']")
    private WebElement emailAFriendButton;
    @FindBy(xpath = "//input[@id='FriendEmail']")
    private WebElement friendsEmailField;
    @FindBy(xpath = "//input[@name='send-email']")
    private WebElement sendEmailButon;
    public void clickWishListCartButton(){
        wishListCartButton.click();
    }
    public static boolean verifyWishlist(){
        return verifyWishlist.isDisplayed();
    }
    public void clickWishListButton(){
        wishListButton.click();
    }
    public static boolean verifyItem(){
        return verifyItem.isDisplayed();
    }
    public void clickRemoveButton(){
        removeButton.click();
    }
    public void clickUpdateWishlistButton(){
        updateWishlistButton.click();
    }
    public static boolean verifyItemRemove(){
        return verifyItemRemove.isDisplayed();
    }
    public void clickAddToCartWishList(){
        addToCartWishList.click();
    }
    public void clickAddToCartToShop(){
        addToCartToShop.click();
    }
    public void clickEmailAFriendButton(){
        emailAFriendButton.click();
    }
    public void friendsEmailField(String friendsEmail) {
        friendsEmailField.sendKeys(friendsEmail);
    }
    public void clickSendEmailButon(){
        sendEmailButon.click();
    }



}
