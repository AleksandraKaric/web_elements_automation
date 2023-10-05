package page;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class LoginPage extends BaseTest {
     public LoginPage() {PageFactory.initElements(driver, this);}

     @FindBy(id = "username")
     WebElement usernameInputField;

     @FindBy (id = "password")
     WebElement passwordInputField;

     @FindBy (css = ".fa.fa-2x.fa-sign-in")
     WebElement loginButton;

     @FindBy (id = "flash")
     WebElement usernameInvalidFlashMessage;

     public void usernameInputFieldSendKeys (String username){
          wdWait.until(ExpectedConditions.visibilityOf(usernameInputField)).clear();
          usernameInputField.sendKeys(username);
     }

     public void passwordInputFieldSendKeys (String password){
          wdWait.until(ExpectedConditions.visibilityOf(passwordInputField)).clear();
          passwordInputField.sendKeys(password);
     }

     public void loginButtonClick(){
          wdWait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
     }

     public boolean usernameInvalidFlashMessageIsDisplayed (){
          wdWait.until(ExpectedConditions.visibilityOf(usernameInvalidFlashMessage));
          return usernameInputField.isDisplayed();
     }
     public String usernameInvalidFlashMessageGetText () {
          wdWait.until(ExpectedConditions.visibilityOf(usernameInvalidFlashMessage));
          return usernameInputField.getText();
     }

}
