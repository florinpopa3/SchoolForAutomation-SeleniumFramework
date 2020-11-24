package tech.schoolforautomation.selenium.pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class SignUpPage extends BasePage {

    @FindBy(name = "firstname")
    private WebElement firstNameInput;

    @FindBy(name = "lastname")
    private WebElement lastNameInput;

    @FindBy(name = "password")
    private WebElement passwordInput;

    @FindBy(name = "email")
    private WebElement emailInput;

    @FindBy(name = "phone")
    private WebElement phoneInput;

    @FindBy(id = "address")
    private WebElement addressInput;

    @FindBy(xpath = "//*[@id=\"signup-form\"]/input[7]")
    private WebElement submitButton;


    public SignUpPage(final WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(getWebDriver(), this);
    }



    public void insertFirstName(String firstName) {
        getFirstNameInput().sendKeys(firstName);
    }

    public void insertLastName(String lastName) {
        getLastNameInput().sendKeys(lastName);
    }

    public void insertPassword(String password) {
        getPasswordInput().sendKeys(password);
    }

    public void insertEmail(String email) { getEmailInput().sendKeys(email); }

    public void insertPhone(String phone) {
        getPhoneInput().sendKeys(phone);
    }

    public void insertAddress(String address) {
        getAddressInput().sendKeys(address);
    }

    public void clickSubmitButton() {
        getSubmitButton().click();
    }
}
