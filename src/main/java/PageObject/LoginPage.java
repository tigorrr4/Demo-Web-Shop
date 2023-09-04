package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public static WebDriver driver;
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }
    @FindBy(xpath = "//a[.='Log in']")
    private WebElement LoginMenuPage;
    @FindBy(xpath = "//input[@id='Email']")
    private WebElement emailField;
    @FindBy(xpath = "//input[@id='Password']")
    private WebElement passwordField;
    @FindBy(xpath = "//input[@class='button-1 login-button']")
    private WebElement loginButton;
    @FindBy(xpath = "//a[.='Log out']")
    private static WebElement verifyLogin;
    @FindBy(xpath = "//span[@class='field-validation-error']/span[.='Please enter a valid email address.']")
    private static WebElement verifyInvalidEmail;
    @FindBy(xpath = "//span[.='Login was unsuccessful. Please correct the errors and try again.']")
    private static WebElement verifyUnregisteredAcc;
    @FindBy(xpath = "//input[@id='RememberMe']")
    private  WebElement rememberMeButton;




    public void LoginMenuPage(){
        LoginMenuPage.click();
    }
    public void setEmailField(String email) {
       emailField.sendKeys(email);
    }
    public void setPasswordField(String password) {
       passwordField.sendKeys(password);
    }
    public void loginButton(){
        loginButton.click();
    }
    public static boolean verifyLogin(){
        return verifyLogin.isDisplayed();
    }
    public static boolean verifyInvalidEmail(){
        return verifyInvalidEmail.isDisplayed();
    }
    public static boolean verifyUnregisteredAcc(){
        return verifyUnregisteredAcc.isDisplayed();
    }
    public void clickRememberMeButton(){
        rememberMeButton.click();
    }













    }
