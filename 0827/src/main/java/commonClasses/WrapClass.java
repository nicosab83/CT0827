package commonClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WrapClass {
	
	public static void click(WebElement webE){
		webE.click();
	}
	
	public static void sendKeys(WebElement webE, String textToSend) {
		webE.sendKeys(textToSend);
	}
	
	public static String getText(WebElement webE) {
		return webE.getText();
	}
	
    public static boolean isElementPresent(By by, WebDriver driver) {
        return driver.findElements(by).size() > 0;
    }
	
}
