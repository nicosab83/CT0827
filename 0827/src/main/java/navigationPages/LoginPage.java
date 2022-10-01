package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonClasses.User;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "email") 
	private WebElement emailLogin;
	
	@FindBy(id = "passwd") 
	private WebElement passwordLogin;
	
	@FindBy(id = "SubmitLogin") 
	private WebElement signInBtn;
	
	public void login(User user) {
		emailLogin.clear();
		emailLogin.sendKeys(user.getUserEmail());
		passwordLogin.clear();
		passwordLogin.sendKeys(user.getPassword());
		signInBtn.click();
	}

}
