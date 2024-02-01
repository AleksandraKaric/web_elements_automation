package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SecureAreaPage extends BaseTest {

    public SecureAreaPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "flash")
    WebElement successfulLoginAlert;


   /* public String successfulLoginAlertGetPageTitle() {
        wdWait.until(ExpectedConditions.urlToBe("https://the-internet.herokuapp.com/secure)");
        return successfulLoginAlert.getTitle;
    }*/

    public boolean successfulLoginAlertIsDisplayed() {
        wdWait.until(ExpectedConditions.visibilityOf(successfulLoginAlert));
        return successfulLoginAlert.isDisplayed();
    }

    public String successfulLoginAlertGetText() {
        wdWait.until(ExpectedConditions.visibilityOf(successfulLoginAlert));
        return successfulLoginAlert.getText();
    }

}


