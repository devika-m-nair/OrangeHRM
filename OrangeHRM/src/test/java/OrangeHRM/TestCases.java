package OrangeHRM;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AutomationCore.BaseClass;
import PageClasses.OrangeHrmAdminManagement;
import PageClasses.OrangeHrmHomePage;
import PageClasses.OrangeHrmLoginPage;
import Utilities.PageUtilities;

public class TestCases extends BaseClass{
	public WebDriver driver;
	OrangeHrmLoginPage LoginPage;
	OrangeHrmHomePage HomePage;
	OrangeHrmAdminManagement AdminManagement;
	@BeforeMethod  
	public void intialization() throws Exception
	{
		driver = browserIntialization("chrome");
		driver.manage().window().maximize();
		LoginPage = new OrangeHrmLoginPage(driver);
		HomePage = new OrangeHrmHomePage(driver);
		AdminManagement = new OrangeHrmAdminManagement(driver);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
@Test
public void ForgotPasswordLinkVerification() {
	//LoginPage.ForgotPasswordLinkButton().click();   -> replaced with the 30th line
    PageUtilities.clickOnElement(LoginPage.ForgotPasswordLinkButton());
}
@Test
public void SearchOptionVerification() {
	LoginPage.Login("Admin", "admin123");
	Assert.assertEquals(HomePage.searchTabOption().isDisplayed(), true);	
	Assert.assertEquals(HomePage.adminTabOption().isDisplayed(), true);
	Assert.assertEquals(HomePage.pimTabOption().isDisplayed(), true);
	Assert.assertEquals(HomePage.leaveOptionVerification(), true);
}
@Test
public void SearchASystemUser() {
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
	AdminManagement.adminUserName();
	AdminManagement.searchAdminUser();
	AdminManagement.refreshAdminManagementListing();
}
}
