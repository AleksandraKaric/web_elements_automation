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
    public void SuccessfulLogin (){
        homePage.formAuthenticationLinkClick();
        loginPage.usernameInputFieldSendKeys("tomsmith");
        loginPage.passwordInputFieldSendKeys("SuperSecretPassword!");
        loginPage.loginButtonClick();
        driver.getTitle();

        Assert.assertTrue(secureAreaPage.successfulLoginAlertIsDisplayed());
        Assert.assertEquals("You logged into a secure area!\n" + "×", secureAreaPage.successfulLoginAlertGetText());
    }
}
