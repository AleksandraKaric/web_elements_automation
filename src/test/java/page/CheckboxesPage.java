package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CheckboxesPage extends BaseTest {

    public CheckboxesPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[1]")
    WebElement checkbox1;

    @FindBy(xpath = "//input[2]")
    WebElement checkbox2;


    public boolean checkbox1IsSelected() {

        wdWait.until(ExpectedConditions.visibilityOf(checkbox1));
       return checkbox1.isSelected();
    }

    public void checkbox1Click() {
        wdWait.until(ExpectedConditions.elementToBeClickable(checkbox1));
        checkbox1.click();
    }

    public boolean checkbox2IsSelected() {

        wdWait.until(ExpectedConditions.visibilityOf(checkbox2));
       return checkbox2.isSelected();
    }

    public void checkbox2Click() {
        wdWait.until(ExpectedConditions.elementToBeClickable(checkbox2));
        checkbox2.click();
    }
}