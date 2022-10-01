package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonClasses.WrapClass;

public class SearchResultsPage {

	public SearchResultsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// Search Page WebElements
	@FindBy(className = "product-container")
	private WebElement firstProd;
	
	public boolean getPrdText(String expectedText) {
		return WrapClass.getText(firstProd).contains(expectedText);
	}
	
}
