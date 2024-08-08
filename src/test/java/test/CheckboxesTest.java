package test;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.CheckboxesPage;
import page.HomePage;

public class CheckboxesTest extends BaseTest {

    HomePage homePage;
    CheckboxesPage checkboxesPage;
    @Before
    public void SetUpTest1(){

         homePage = new HomePage();

         checkboxesPage = new CheckboxesPage();

    }

    @Test
    public void checkbox1Test(){
        homePage.checkboxesLinkClick();

        Assert.assertFalse(checkboxesPage.checkbox1IsSelected());
        checkboxesPage.checkbox1Click();

        Assert.assertTrue(checkboxesPage.checkbox2IsSelected());
        checkboxesPage.checkbox2Click();
    }
}

