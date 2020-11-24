package tech.schoolforautomation.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Getter
@Setter
public class LoginPage extends BasePage {

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(xpath = "//*[@id=\"login-form\"]/input[3]")
    private WebElement submitButton;

    @FindBy(id = "invalid")
    private WebElement errorMessage;

    @FindBy(xpath = "//*[@id=\"banner\"]/div[2]/a")
    private WebElement createAccButton;

    public LoginPage(final WebDriver webDriver) {
        super(webDriver);

        PageFactory.initElements(getWebDriver(), this);
    }

    public void login(String email, String password) {
        System.out.println(email + " " + password);

        WebElement getSubmitButton = new WebDriverWait(getWebDriver(), 3)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"login-form\"]/input[3]")));

        getEmailInput().sendKeys(email);
        getPasswordInput().sendKeys(password);
        getSubmitButton().click();
    }

    public void clickCreateAccButton() {
        getCreateAccButton().click();
    }
}