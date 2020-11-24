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
import tech.schoolforautomation.selenium.pages.TablePage;

@Getter
public class TableTest extends BaseTest {

    @Test
    public void selectTest() {

        goToLandingPage();

        LoginPage loginPage = new LoginPage(getWebDriver());
        HomePage homePage = new HomePage(getWebDriver());
        TablePage tablePage = new TablePage(getWebDriver());


        loginPage.login("7ZE79M@gmail.com", "QJuvGu47HR9D");

        WebElement getSubmitButton = new WebDriverWait(getWebDriver(), 3)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"one\"]/div/div/section[1]/a")));

        WebElement element = getWebDriver().findElement(By.xpath("//*[@id=\"one\"]/div/div/section[1]/a"));
        Actions actions = new Actions(getWebDriver());
        actions.moveToElement(element);
        actions.perform();

        homePage.clickClockButton();
        Assert.assertEquals(100, tablePage.returnTableSum());
    }

}