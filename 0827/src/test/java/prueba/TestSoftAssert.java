package prueba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestSoftAssert {
	
	SoftAssert softAssert = new SoftAssert();
	
  @Test
  public void test0() {
	  int a = 5;
	  int b = 10;
	  int x = 8;
	  int y = 8;
	  
	  softAssert.assertEquals(a, b, "A y B no son iguales!");
	  softAssert.assertEquals(x, y);
	  
	  softAssert.assertAll();
  }
  
  @Test
  public void test1() {
		String exePath = "./src/test/resources/driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "My Store";
		String badTitle = "mystore";
		
		softAssert.assertEquals(actualTitle, expectedTitle);
		softAssert.assertEquals(actualTitle, badTitle);

		softAssert.assertAll();
		
  }
  
}
