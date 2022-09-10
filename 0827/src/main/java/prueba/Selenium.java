package prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {
		String exePath = "./src/test/resources/driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement searchBar = driver.findElement(By.id("search_query_top"));
		WebElement searchBtn = driver.findElement(By.xpath("(//*[@type = \"submit\"])[1]")); //En el navegador: (//*[@type = "submit"])[1]
		
		searchBar.sendKeys("Dress");
		searchBtn.click();
		
		//WebDriver.close();
	}

}
