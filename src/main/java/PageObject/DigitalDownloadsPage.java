package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DigitalDownloadsPage {
    public static WebDriver driver;
    public DigitalDownloadsPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }
    @FindBy(xpath = "//ul[@class='top-menu']//a[contains(.,'Digital downloads')]")
    private WebElement digitalDownloadsButton;
    @FindBy(xpath = "//div[@class='product-grid']/div[1]//input[@class='button-2 product-box-add-to-cart-button']")
    private WebElement albumButton;
    public void clickDigitalDownloadsButton(){
        digitalDownloadsButton.click();
    }
    public void clickAlbumButton(){
        albumButton.click();
    }
}
