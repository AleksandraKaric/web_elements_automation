package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BaseTest {

    public HomePage () {
        PageFactory.initElements(driver, this);
    }
    @FindBy (linkText = "Form Authentication")
    WebElement linkFormAuthentication;

    public void linkFormAuthenticationClick (){
        wdWait.until(ExpectedConditions.visibilityOf(linkFormAuthentication)).click();
    }

}
