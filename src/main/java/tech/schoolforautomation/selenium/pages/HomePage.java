package tech.schoolforautomation.selenium.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class HomePage extends BasePage {

    @FindBy(xpath = "//*[@id=\"one\"]/div/div/section[1]/a")
    private WebElement clockButton;

    @FindBy(xpath = "//*[@id=\"one\"]/div/div/section[2]/a")
    private WebElement chatButton;

    @FindBy(xpath = "//*[@id=\"one\"]/div/div/section[3]/a")
    private WebElement personButton;



    public HomePage(final WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(getWebDriver(), this);
    }

    public void clickClockButton() {
        getClockButton().click();
    }
    public void clickChatButton() { getChatButton().click(); }
    public void clickPersonButton() {
        getPersonButton().click();
    }
}
