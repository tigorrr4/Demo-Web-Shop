package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BooksPage {
    public static WebDriver driver;
    public BooksPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    @FindBy(xpath = "//ul[@class='top-menu']//a[contains(.,'Books')]")
    private WebElement booksButton;
    @FindBy(xpath = "//select[@id='products-orderby']")
    private WebElement sortBy;
    @FindBy(xpath = "//select[@id='products-pagesize']")
    private WebElement displaySort;
    @FindBy(xpath = "//a[contains(.,'Under 25.00')]")
    private WebElement filterByPrice;
    @FindBy(xpath = "//div[@class='product-grid']/div[3]//input[@class='button-2 product-box-add-to-cart-button']")
    private WebElement addToCartBooksButton;
    @FindBy(xpath = "//div[4]//input[@class='button-2 product-box-add-to-cart-button']")
    private WebElement addToCartBooks2Button;
    @FindBy(xpath = "//div[5]//input[@class='button-2 product-box-add-to-cart-button']")
    private WebElement addToCartBooks3Button;
    @FindBy(xpath = "//p[@class='content']")
    private static WebElement verifyCart;

    public void clickBooksButton(){
        booksButton.click();
    }
    public void setSortBy(String sort){
        Select a = new Select(sortBy);
        sortBy.click();
        a.selectByVisibleText(sort);
    }

    public void setDisplaySort(String display){
        Select a = new Select(displaySort);
        displaySort.click();
        a.selectByVisibleText(display);
    }
    public void clickFilterByPrice(){
        filterByPrice.click();
    }
    public void clickAddToCartBooksButton(){
        addToCartBooksButton.click();
    }
    public static boolean verifyCart(){
        return verifyCart.isDisplayed();
    }
    public void clickAddToCartBooks2Button(){
        addToCartBooks2Button.click();
    }
    public void clickAddToCartBooks3Button(){
        addToCartBooks3Button.click();
    }




}
