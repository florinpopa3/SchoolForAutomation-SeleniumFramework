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
public class TablePage extends BasePage{




    public TablePage(final WebDriver webDriver) {
        super(webDriver);

        PageFactory.initElements(getWebDriver(), this);
    }

    public int returnTableSum() {
        WebElement waitTable = new WebDriverWait(getWebDriver(), 3)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"main\"]/div/section/div/table/tbody/tr[1]/td[3]")));
        int tableSum = Integer.parseInt(getWebDriver().findElement(By.xpath("//*[@id=\"main\"]/div/section/div/table/tbody/tr[1]/td[3]")).getText())
                + Integer.parseInt(getWebDriver().findElement(By.xpath("//*[@id=\"main\"]/div/section/div/table/tbody/tr[2]/td[3]")).getText())
                + Integer.parseInt(getWebDriver().findElement(By.xpath("//*[@id=\"main\"]/div/section/div/table/tbody/tr[3]/td[3]")).getText())
                + Integer.parseInt(getWebDriver().findElement(By.xpath("//*[@id=\"main\"]/div/section/div/table/tbody/tr[4]/td[3]")).getText())
                + Integer.parseInt(getWebDriver().findElement(By.xpath("//*[@id=\"main\"]/div/section/div/table/tbody/tr[5]/td[3]")).getText());

        return tableSum;
    }
}
