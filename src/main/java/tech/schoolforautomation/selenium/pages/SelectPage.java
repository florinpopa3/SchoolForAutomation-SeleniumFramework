package tech.schoolforautomation.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.support.ui.Select;

@Getter
@Setter
public class SelectPage extends BasePage {

    @FindBy(id = "selected-value")
    private WebElement selectedValue;

    @FindBy(xpath = "//*[@id=\"main\"]/div/section/input")
    private WebElement submitButton;

    public SelectPage(final WebDriver webDriver) {
        super(webDriver);

        PageFactory.initElements(getWebDriver(), this);
    }


    public void clickSelect() {
        Select option = new Select(getWebDriver().findElement(By.id("category")));
        option.selectByIndex(2);
    }

    public void clickSubmitButton() {
        getSubmitButton().click();
    }

    public String returnSelectedValue() {

//        new WebDriverWait(getWebDriver(), 3)
//                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"login-form\"]/input[3]")));

        return getSelectedValue().getText();
    }
}
