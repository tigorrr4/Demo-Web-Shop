package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
    public static WebDriver driver;
    public MyAccountPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }
    @FindBy(xpath = "//a[.='tigorthorir@gmail.com']")
    private  WebElement profileButton;
    @FindBy(xpath = "//a[.='Customer info']")
    private  WebElement customerInfoButton;
    @FindBy(xpath = "//input[@id='FirstName']")
    private  WebElement firstNameField;
    @FindBy(xpath = "//input[@id='LastName']")
    private  WebElement lastNameField;
    @FindBy(xpath = "//input[@name='save-info-button']")
    private  WebElement saveButton;
    @FindBy(xpath = "//img[@alt='Tricentis Demo Web Shop']")
    private  static WebElement verify;
    @FindBy(xpath = "//a[.='Change password']")
    private  WebElement ChangePasswordButton;
    @FindBy(xpath = "//a[.='Change password']")
    private  WebElement ChangePsdButton;
    @FindBy(xpath = "//input[@id='OldPassword']")
    private  WebElement oldPasswordField;
    @FindBy(xpath = "//input[@id='NewPassword']")
    private  WebElement newPasswordField;
    @FindBy(xpath = "//input[@id='ConfirmNewPassword']")
    private  WebElement confirmPasswordField;


    public void clickProfileButton(){
        profileButton.click();
    }
    public void clickCustomerInfoButton(){
        customerInfoButton.click();
    }
    public void setFirstNameField(String firstName) {
        firstNameField.sendKeys(firstName);
    }
    public void setLastNameField(String lastName) {
        lastNameField.sendKeys(lastName);
    }
    public void clickSaveButton(){
        saveButton.click();
    }
    public static boolean verify(){
        return verify.isDisplayed();
    }
    public void clickChangePasswordButton(){
        ChangePasswordButton.click();
    }
    public void clickChangePsdButton(){
        ChangePsdButton.click();
    }
    public void setOldPasswordField(String OldPassword) {
        oldPasswordField.sendKeys(OldPassword);
    }
    public void setNewPasswordField(String newPassword) {
        newPasswordField.sendKeys(newPassword);
    }
    public void setConfirmPasswordField(String confirmPassword) {
        confirmPasswordField.sendKeys(confirmPassword);
    }
}
