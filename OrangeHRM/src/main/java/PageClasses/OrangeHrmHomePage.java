package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrangeHrmHomePage {
	WebDriver driver;
	By searchtab=By.xpath("//input[@placeholder='Search']");
	By admintab=By.xpath("//span[text()='Admin']");
	By pimtab=By.xpath("//span[text()='PIM']");
	By leavetab=By.xpath("//span[text()='Leave']");
	
	
	
	
	
	
	public OrangeHrmHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		
	}





	public WebElement searchTabOption() {
		return(driver.findElement(searchtab));
	}
	public WebElement adminTabOption() {
		return(driver.findElement(admintab));
	}
	public WebElement pimTabOption() {
		return(driver.findElement(pimtab));
	}
	public boolean leaveOptionVerification() {
		return(driver.findElement(leavetab).isDisplayed());
		
	}

}
