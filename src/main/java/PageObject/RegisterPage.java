package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


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
    @FindBy(xpath = "//li[.='The specified email already exists']")
    private static WebElement verifyRegisteredEmail;
    @FindBy(xpath = "//span[@class='field-validation-error']/span[.='Wrong email']")
    private static WebElement verifyInvalidEmail;
    @FindBy(xpath = "//h1[.='Register']")
    private static WebElement verifyStayAtRegister;
    @FindBy(xpath = "//div[@class='page-body']//span[@class='field-validation-error']/span[.='First name is required.']")
    private static WebElement verifyFirstnameRequired;
    @FindBy(xpath = "//div[@class='page-body']//span[@class='field-validation-error']/span[.='Last name is required.']")
    private static WebElement verifyLastnameRequired;
    @FindBy(xpath = "//div[@class='page-body']//span[@class='field-validation-error']/span[.='Email is required.']")
    private static WebElement verifyEmailRequired;
    @FindBy(xpath = "//div[@class='page-body']//div[2]/span[@class='field-validation-error']")
    private static WebElement verifyPasswordRequired;
    @FindBy(xpath = "//div[@class='page-body']//span[@class='field-validation-error']/span[.='The password should have at least 6 characters.']")
    private static WebElement verifyPasswordMinimum;


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
    public static boolean verifyRegisteredEmail(){
        return verifyRegisteredEmail.isDisplayed();
    }
    public static boolean verifyInvalidEmail(){
        return verifyInvalidEmail.isDisplayed();
    }
    public static boolean verifyStayAtRegister(){
        return verifyStayAtRegister.isDisplayed();
    }
    public static boolean verifyFirstnameRequired(){
        return verifyFirstnameRequired.isDisplayed();
    }
    public static boolean verifyLastnameRequired(){
        return verifyLastnameRequired.isDisplayed();
    }
    public static boolean verifyEmailRequired(){
        return verifyEmailRequired.isDisplayed();
    }
    public static boolean verifyPasswordRequired(){
        return verifyPasswordRequired.isDisplayed();
    }
    public static boolean verifyPasswordMinimum(){
        return verifyPasswordMinimum.isDisplayed();
    }























}
