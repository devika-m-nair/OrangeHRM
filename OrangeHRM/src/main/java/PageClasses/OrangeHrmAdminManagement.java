package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrangeHrmAdminManagement {
	WebDriver driver;
	By adminmanagementusername=By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	By adminmanagementsearch=By.xpath("//button[@type='submit']");
	By adminmanagementreset=By.className("oxd-button oxd-button--medium oxd-button--ghost");


	public OrangeHrmAdminManagement(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	
	public void adminUserName() {
		driver.findElement(adminmanagementreset).sendKeys("Admin");
	}
	public void searchAdminUser() {
		driver.findElement(adminmanagementsearch).click();
	}
	public void refreshAdminManagementListing() {
		driver.findElement(adminmanagementreset).click();
	}
	
}
	