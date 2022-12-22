package testCases_Search;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonClasses.DriverSetup;
import commonClasses.GlobalVariables;
import commonClasses.WrapClass;
import navigationPages.HomePage;
import navigationPages.SearchResultsPage;

public class TC_02_SearchBlouse {
	
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
	public void TC_02() {
		homePage.search("Blouse");
		boolean visibleText = searchPage.getPrdText("Blouse");
		Assert.assertTrue(visibleText, "El text Blouse no esta desplegado");
	}
	
	@AfterTest
	public void closeDriver() {
		WrapClass.takeScreenshot(driver, "TC_02");
		driver.quit();
	}
}
