package testCases_Search;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonClasses.DriverSetup;
import commonClasses.GlobalVariables;
import navigationPages.HomePage;
import navigationPages.SearchResultsPage;

public class TC_01_SearchDress {
	
	// Declarar e inicializar el WebDriver
	WebDriver driver = DriverSetup.setupdriver();
	
	// PageObjects
	HomePage homePage = new HomePage(driver);
	SearchResultsPage searchPage = new SearchResultsPage(driver);
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
	}
	
	@Test
	public void TC_01() {
		homePage.search("Dress");
		boolean visibleText = searchPage.getPrdText("Dress");
		Assert.assertTrue(visibleText, "El text DRESS no esta desplegado");
	}
	
	@AfterTest
	public void closeDriver() {
		driver.quit();
	}
}
