package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
    public static WebDriver driver;
    public RegisterPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }
    @FindBy(xpath = "//img[@alt='Tricentis Demo Web Shop']")
    private static WebElement verifyLandingPage;
    @FindBy(xpath = "//a[.='Register']")
    private WebElement registerPageButton;
    @FindBy(xpath = "//input[@id='gender-male']")
    private WebElement genderSelect;
    @FindBy(xpath = "//input[@id='FirstName']")
    private WebElement firstNameField;
    @FindBy(xpath = "//input[@id='LastName']")
    private WebElement lastNameField;
    @FindBy(xpath = "//input[@id='Email']")
    private WebElement emailField;
    @FindBy(xpath = "//input[@id='Password']")
    private WebElement passwordField;
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    private WebElement confirmPasswordField;
    @FindBy(xpath = "//input[@id='register-button']")
    private WebElement registerButton;
    @FindBy(xpath = "//div[@class='result']")
    private static WebElement verifyRegister;

    public static boolean verifyLandingPage(){
        return verifyLandingPage.isDisplayed();
    }
    public void clickRegisterPageButton(){
        registerPageButton.click();
    }
    public void clickGenderSelect(){
        genderSelect.click();
    }
    public void setFirstName(String Name) {
        firstNameField.sendKeys(Name);
    }
    public void setLastNameField(String lastName) {
        lastNameField.sendKeys(lastName);
    }
    public void setEmailField(String registerEmail) {
        emailField.sendKeys(registerEmail);
    }
    public void setPasswordField(String password) {
    passwordField.sendKeys(password);
    }
    public void setConfirmPasswordField(String confirmPassword) {
        confirmPasswordField.sendKeys(confirmPassword);
    }
    public void clickRegisterButton(){
        registerButton.click();
    }
    public static boolean verifyRegister(){
        return verifyRegister.isDisplayed();
    }





















}
