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
public class RadioPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"main\"]/div/section/label[3]")
    private WebElement radioButton;

    @FindBy(xpath = "//*[@id=\"main\"]/div/section/input")
    private WebElement submitButton;

    @FindBy(id = "priority-value")
    private WebElement priorityValue;

    public RadioPage(final WebDriver webDriver) {
        super(webDriver);

        PageFactory.initElements(getWebDriver(), this);
    }


    public void clickRadioButton() { getRadioButton().click(); }

    public void clickSubmitButton() {
        getSubmitButton().click();
    }

    public String returnSelectedValue() {

//        new WebDriverWait(getWebDriver(), 3)
//                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"login-form\"]/input[3]")));

        return getPriorityValue().getText();
    }
}
