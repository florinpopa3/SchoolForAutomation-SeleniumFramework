package tech.schoolforautomation.tests;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import tech.schoolforautomation.base.BaseTest;
import tech.schoolforautomation.selenium.pages.HomePage;
import tech.schoolforautomation.selenium.pages.LoginPage;
import tech.schoolforautomation.selenium.pages.RadioPage;

@Getter
public class RadioTest extends BaseTest {

    @Test
    public void radioTest() {

        goToLandingPage();

        LoginPage loginPage = new LoginPage(getWebDriver());
        HomePage homePage = new HomePage(getWebDriver());
        RadioPage radioPage = new RadioPage(getWebDriver());


        loginPage.login("7ZE79M@gmail.com", "QJuvGu47HR9D");

       WebElement getSubmitButton = new WebDriverWait(getWebDriver(), 3)
              .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"one\"]/div/div/section[2]/a")));

        WebElement element = getWebDriver().findElement(By.xpath("//*[@id=\"one\"]/div/div/section[2]/a"));
        Actions actions = new Actions(getWebDriver());
        actions.moveToElement(element);
        actions.perform();

        homePage.clickChatButton();
        radioPage.clickRadioButton();
        radioPage.clickSubmitButton();
        Assert.assertEquals("High Priority", radioPage.returnSelectedValue());
    }

}
