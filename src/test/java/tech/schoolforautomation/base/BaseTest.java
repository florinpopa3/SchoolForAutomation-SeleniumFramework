package tech.schoolforautomation.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import lombok.Getter;

@Getter
public class BaseTest {

    private WebDriver webDriver;


    @BeforeTest
    public void init() {
        System.setProperty("webdriver.chrome.driver", "/Users/macintosh/Downloads/chromedriver");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
    }

    public void goToLandingPage() {
        webDriver.get("http://school-for-automation.tech/");
    }

/*    @AfterTest
    public void tearDown() {
        webDriver.close();
    }*/

}
