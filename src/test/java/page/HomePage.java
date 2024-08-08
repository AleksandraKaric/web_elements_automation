package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BaseTest {

    public HomePage () {
        PageFactory.initElements(driver, this);}

    @FindBy(linkText = "Form Authentication")
    WebElement formAuthenticationLink;

    @FindBy(linkText = "Basic Auth")
    WebElement basicAuthLink;

    @FindBy(linkText = "Checkboxes")
    WebElement checkboxesLink;

    public void formAuthenticationLinkClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(formAuthenticationLink));
       // actions.scrollToElement(formAuthenticationLink).perform();
        formAuthenticationLink.click();
    }

    public void basicAuthLinkClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(basicAuthLink));
       // actions.scrollToElement(basicAuthLink).perform();
        basicAuthLink.click();

    }public void checkboxesLinkClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(checkboxesLink));
       // actions.scrollToElement(checkboxesLink).perform();
        checkboxesLink.click();
    }
}
