package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
    @FindBy(xpath = "//div[8]//input[@class='button-2 product-box-add-to-cart-button']")
    private WebElement GreenSneakerButton;
    @FindBy(xpath = "//div[12]//input[@class='button-2 product-box-add-to-cart-button']")
    private WebElement PolkadotShirtButton;
    @FindBy(xpath = "//select[@class='valid']")
    private WebElement selectSize;
    @FindBy(xpath = "//input[@class='button-1 add-to-cart-button']")
    private WebElement addCartInAp;
    @FindBy(xpath = "//input[@class='button-1 add-to-cart-button']")
    private WebElement addCartInShoes;
    @FindBy(xpath = "//ul[@class='option-list color-squares']/li[3]//span[@class='color']")
    private WebElement greenColour;

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
    public void clickGreenSneakerButton(){
        GreenSneakerButton.click();
    }
    public void clickLongSleeveButton(){
        longSleeveButton.click();
    }
    public void clickPolkadotShirtButton(){
        PolkadotShirtButton.click();
    }
    public void setSelectSize(String Size){
        Select a = new Select(selectSize);
        selectSize.click();
        a.selectByVisibleText(Size);
    }
    public void clickAddCartInAp(){
        addCartInAp.click();
    }
    public void clickAddCartInShoes(){
        addCartInShoes.click();
    }
    public void clickGreenColour(){
        greenColour.click();
    }



}
