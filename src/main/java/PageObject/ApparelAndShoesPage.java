package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApparelAndShoesPage {
    public static WebDriver driver;
    public ApparelAndShoesPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }
    @FindBy(xpath = "//ul[@class='top-menu']//a[contains(.,'Apparel & Shoes')]")
    private WebElement ApparelAndShoesButton;
    @FindBy(xpath = "//div[5]//input[@class='button-2 product-box-add-to-cart-button']")
    private WebElement blueJeansButton;
    @FindBy(xpath = "//div[@class='product-grid']/div[4]//input[@class='button-2 product-box-add-to-cart-button']")
    private WebElement beltButton;
    @FindBy(xpath = "//div[8]//input[@class='button-2 product-box-add-to-cart-button']")
    private WebElement shoesButton;
    @FindBy(xpath = "//div[7]//input[@class='button-2 product-box-add-to-cart-button']")
    private WebElement bagButton;
    @FindBy(xpath = "//div[10]//input[@class='button-2 product-box-add-to-cart-button']")
    private WebElement longSleeveButton;

    public void clickApparelAndShoesButton(){
        ApparelAndShoesButton.click();
    }
    public void clickBlueJeansButton(){
        blueJeansButton.click();
    }
    public void clickBeltButton(){
        beltButton.click();
    }
    public void clickShoesButton(){
        shoesButton.click();
    }
    public void clickBagButton(){
        bagButton.click();
    }
    public void clickLongSleeveButton(){
        longSleeveButton.click();
    }


}
