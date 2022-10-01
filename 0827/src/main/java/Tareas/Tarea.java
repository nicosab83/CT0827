package Tareas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tarea {
	
	public static void main(String[] args) throws InterruptedException {
		
		String url = "http://automationpractice.com/";
		String exePath = "./src/test/resources/driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		String usrName = "cooltesters0827@mailinator.com";
		String usrPassword = "Test123!";
		WebElement loginLnk = driver.findElement(By.xpath("//*[@class=\"login\"]"));
		loginLnk.click();
		
		WebElement usrNameBox = driver.findElement(By.id("email"));
		WebElement usrPasswordBox = driver.findElement(By.id("passwd"));
		WebElement loginBtn = driver.findElement(By.id("SubmitLogin"));
		
		// Login por usuario.
		usrNameBox.sendKeys(usrName);
		usrPasswordBox.sendKeys(usrPassword);
		Thread.sleep(3000);
		loginBtn.click();
		
		// Validamos la url en la que estamos.
		String urlFinal = "my-account";
		String urlMyAccount = driver.getCurrentUrl();
		System.out.println("La url actual es: " + urlMyAccount);
		if (urlMyAccount.contains(urlFinal)) {
			System.out.println("Url de login correcta!.");
		} else {
			System.out.println("Url de login incorrecta!.");
		}

		// Validamos con el panel de navegacion.
		WebElement navPanel = driver.findElement(By.xpath("//*[@class=\"breadcrumb clearfix\"]"));
		// //*[@id="columns"]/div[1]/span[2]
		if(navPanel.getText().contains("My account")) { // Preguntar
			System.out.println("Barra de navegacion correcta.");
		} else {
			System.out.println("Barra de navegacion incorrecta.");
		}
		
		driver.quit();
	}

}
