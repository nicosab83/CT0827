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

public class TC_05_SearchExcel {
	
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
	public void TC_05() {
		String searchCriteria = WrapClass.getCellData("TC_05", 1, 0);
		homePage.search(searchCriteria);
		boolean visibleText = searchPage.getPrdText("Dress");
		Assert.assertTrue(visibleText, "El text DRESS no esta desplegado");
	}
	
	@AfterTest
	public void closeDriver() {
		WrapClass.takeScreenshot(driver, "TC_05");
		driver.quit();
	}
}