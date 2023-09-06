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
    @FindBy(xpath = "//input[@class='button-2 edit-address-button']")
    private  WebElement addressesButton;
    @FindBy(xpath = "//ul[@class='list']//a[.='Addresses']")
    private  WebElement EditAddressesButton;
    @FindBy(xpath = "//input[@id='Address_FirstName']")
    private  WebElement setAddressesFieldFirstname;
    @FindBy(xpath = "//input[@id='Address_LastName']")
    private  WebElement setAddressesFieldLastname;
    @FindBy(xpath = "//input[@id='Address_Email']")
    private  WebElement setAddressesEmail;
    @FindBy(xpath = "//input[@id='Address_Company']")
    private  WebElement setAddressesCompany;
    @FindBy(xpath = "//input[@id='Address_City']")
    private  WebElement setAddressesCity;
    @FindBy(xpath = "//div[8]/input[@class='text-box single-line']")
    private  WebElement setAddresses;
    @FindBy(xpath = "//input[@id='Address_ZipPostalCode']")
    private  WebElement setZipCode;
    @FindBy(xpath = "//input[@id='Address_PhoneNumber']")
    private  WebElement setPhoneNumber;
    @FindBy(xpath = "//input[@class='button-1 save-address-button']")
    private  WebElement saveButtonAddress;



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
    public void clickAddressesButton(){
        addressesButton.click();
    }
    public void clickEditAddressesButton(){
        EditAddressesButton.click();
    }
    public void setAddressesFieldFirstname(String addFirstName) {
        setAddressesFieldFirstname.clear();
        setAddressesFieldFirstname.sendKeys(addFirstName);
    }
    public void setAddressesFieldLastname(String addLastName) {
        setAddressesFieldLastname.clear();
        setAddressesFieldLastname.sendKeys(addLastName);
    }
    public void setAddressesEmail(String addEmail) {
        setAddressesEmail.clear();
        setAddressesEmail.sendKeys(addEmail);
    }
    public void setAddressesCompany(String company) {
        setAddressesCompany.clear();
        setAddressesCompany.sendKeys(company);
    }
    public void setAddressesCity(String city) {
        setAddressesCity.clear();
        setAddressesCity.sendKeys(city);
    }
    public void setAddresses(String Addresses) {
        setAddresses.clear();
        setAddresses.sendKeys(Addresses);
    }
    public void setZipCodes(String zipCode) {
        setZipCode.clear();
        setZipCode.sendKeys(zipCode);
    }
    public void setPhoneNumber(String phoneNumber) {
        setPhoneNumber.clear();
        setPhoneNumber.sendKeys(phoneNumber);
    }
    public void clickSaveButtonAddress(){
        saveButtonAddress.click();
    }
}
