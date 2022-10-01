package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonClasses.WrapClass;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// HomePage WebElements
	@FindBy(id = "search_query_top") 
	private WebElement searchBar;
	
	@FindBy(xpath = "(//*[@type = \"submit\"])[1]")
	private WebElement searchBtn;

	public void search(String textToSearch) {
		WrapClass.sendKeys(searchBar, textToSearch);
		WrapClass.click(searchBtn);
	}

}
