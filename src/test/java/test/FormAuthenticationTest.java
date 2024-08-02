package test;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.LoginPage;
import page.HomePage;
import page.SecureAreaPage;

public class FormAuthenticationTest extends BaseTest {

    HomePage homePage;
    LoginPage loginPage;

    SecureAreaPage secureAreaPage;

    @Before
    public void SetUpTest1() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        secureAreaPage = new SecureAreaPage();

    }

    @Test
    public void SuccessfulLogin() {
        homePage.formAuthenticationLinkClick();
        loginPage.usernameInputFieldSendKeys("tomsmith");
        loginPage.passwordInputFieldSendKeys("SuperSecretPassword!");
        loginPage.loginButtonClick();
        //try to get page title and assert that it is on the right page
        driver.getTitle();

        Assert.assertTrue(secureAreaPage.successfulLoginAlertIsDisplayed());
        Assert.assertEquals("You logged into a secure area!\n" + "×",
                secureAreaPage.successfulLoginAlertGetText());
    }


    @Test
    public void UnsuccessfulLoginLeavingBlankInputFields() {
    homePage.formAuthenticationLinkClick();
    loginPage.loginButtonClick();

        Assert.assertTrue(loginPage.usernameInvalidFlashMessageIsDisplayed());
        Assert.assertEquals("Your username is invalid!\n" + "×",
               loginPage.usernameInvalidFlashMessageGetText());

    }

    @Test
    public void UnsuccessfulLogin() {
        homePage.formAuthenticationLinkClick();
        loginPage.usernameInputFieldSendKeys("tomsmith");
        loginPage.passwordInputFieldSendKeys("SuperSecretPassword!");
        loginPage.loginButtonClick();
        //try to get page title and assert that it is on the right page
        driver.getTitle();

        Assert.assertTrue(secureAreaPage.successfulLoginAlertIsDisplayed());
        Assert.assertEquals("You logged into a secure area!\n" + "×",
                secureAreaPage.successfulLoginAlertGetText());
    }


}