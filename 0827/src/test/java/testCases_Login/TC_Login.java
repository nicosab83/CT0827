package testCases_Login;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonClasses.DriverSetup;
import commonClasses.GlobalVariables;
import commonClasses.User;
import commonClasses.UserBuilder;
import navigationPages.HeaderPage;
import navigationPages.HomePage;
import navigationPages.LoginPage;
import navigationPages.SearchResultsPage;

public class TC_Login {

	WebDriver driver = DriverSetup.setupdriver();
	HomePage homePage = new HomePage(driver);
	SearchResultsPage searchPage = new SearchResultsPage(driver);
	HeaderPage headerPage = new HeaderPage(driver);
	LoginPage loginPage = new LoginPage(driver);
	User user;
	
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
		System.out.println(headerPage.userSignedIn());
		//if(headerPage.userSignedIn()) { headerPage.signOut(); }
		headerPage.forceSignOut(driver);
	}

	@Test
	public void login() {
		headerPage.goToLoginPage();
		user = UserBuilder.nico();
		loginPage.login(user);
		Assert.assertTrue(headerPage.userSignedIn());
	}
	
	@AfterTest
	public void closeDriver() {
		driver.quit();
	}

}
