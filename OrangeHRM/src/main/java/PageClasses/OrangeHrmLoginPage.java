package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class OrangeHrmLoginPage {
 WebDriver driver;
 @FindBy(name = "username")
 WebElement usernamefield;
 @FindBy(name = "password")
 WebElement passwordfield;
 @FindBy(xpath = "//button[@type='submit']")
 WebElement loginbutton;
 @FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
 WebElement forgotpasswordlink;
 
 
 
 
 public OrangeHrmLoginPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}




public WebElement ForgotPasswordLinkButton() {
	 return forgotpasswordlink;
 }
public void Login(String username, String password) {
	PageUtilities.enterText(usernamefield, username);
	PageUtilities.enterText(passwordfield, password);
	PageUtilities.clickOnElement(loginbutton);
}
}
