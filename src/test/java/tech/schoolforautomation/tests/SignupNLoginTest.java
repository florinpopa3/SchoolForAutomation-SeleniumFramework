package tech.schoolforautomation.tests;

import org.apache.commons.lang3.RandomStringUtils;
import lombok.Getter;
import org.junit.Assert;

import org.testng.annotations.Test;
import tech.schoolforautomation.base.BaseTest;
import tech.schoolforautomation.selenium.pages.LoginPage;
import tech.schoolforautomation.selenium.pages.SignUpPage;

@Getter
public class SignupNLoginTest extends BaseTest {

    @Test
    public void createAccount() {

        goToLandingPage();


        LoginPage loginPage = new LoginPage(getWebDriver());
        loginPage.clickCreateAccButton();

        String password = RandomStringUtils.random(12, true, true);
        String email = RandomStringUtils.random(6, true, true) + "@gmail.com";

        SignUpPage signUpPage = new SignUpPage(getWebDriver());
        signUpPage.insertFirstName(RandomStringUtils.random(12, true, false));
        signUpPage.insertLastName(RandomStringUtils.random(12, true, false));
        signUpPage.insertPassword(password);
        signUpPage.insertEmail(email);
        signUpPage.insertPhone(RandomStringUtils.random(10, false, true));
        signUpPage.insertAddress(RandomStringUtils.random(10, true, true));
        signUpPage.clickSubmitButton();


        loginPage.login(email, password);

        Assert.assertEquals("http://school-for-automation.tech/home.html", getWebDriver().getCurrentUrl());
    }
}
