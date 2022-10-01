package navigationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonClasses.WrapClass;

public class HeaderPage {

	public HeaderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className = "login") 
	private WebElement signInLnk;
	
	@FindBy(className = "logout") 
	private WebElement signOutLnk;

	@FindBy(className = "account") 
	private WebElement myAccountLnk;
	
	public final static By logoutBy = By.className("logout");
	
	public void goToLoginPage() { signInLnk.click();}
	
	public void signOut() { signOutLnk.click();}
	
	public void forceSignOut(WebDriver driver) {
		if(WrapClass.isElementPresent(logoutBy, driver)) {
			signOutLnk.click();
		};
	}
	
	public boolean userSignedIn(){
		return myAccountLnk != null;
	}
	
	
}
