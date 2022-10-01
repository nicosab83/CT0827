package prueba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHardAssert {
	
	@Test
	public void verificarTituloDePagina() {
		String exePath = "./src/test/resources/driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "My Store";
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
		
		
		@Test
		public void test1() {
			int a = 10;
			int b = 10;
			Assert.assertEquals(a, b);
		}
		
		@Test
		public void test2() {
			int a = 5;
			int b = 10;
			Assert.assertNotEquals(a, b);
		}
		
		@Test
		public void test3() {
			int a = 10;
			int b = 10;
			Assert.assertTrue(a == b);
		}
		


}
