package commonClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

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
    
    public static void takeScreenshot(WebDriver webdriver, String testCaseName) {
    	// Toma el screenshot y lo aloja en memoria.
    	File scrFile = ((TakesScreenshot) webdriver).getScreenshotAs(OutputType.FILE);
    	
    	//En la rura
    	String screenshotPath = "./test-output/ExecutionResults";
    	FileHandler.createDir(new File(screenshotPath));
    	try {
			FileHandler.copy(scrFile, new File(screenshotPath + File.separator + testCaseName + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public static String getJsonValue(String jsonFileObj, String jsonKey) {
    	try {
    		//JSON Data
    		InputStream inputStream = new FileInputStream(GlobalVariables.DATA_PATH + jsonFileObj + ".json");
        	JSONObject jsonObject = new JSONObject(new JSONTokener(inputStream));
        	// Get Data
        	String jsonValue = jsonObject.getJSONObject(jsonFileObj).getString(jsonKey);
        	return jsonValue;
    	} catch (FileNotFoundException e) {
    		e.printStackTrace();
    		return null;
    	}
    }
    
    public static String getCellData(String excelName, int row, int column) {
    	try {
    		// Reading Data
			FileInputStream fis = new FileInputStream(GlobalVariables.DATA_PATH + excelName + ".xlsx");
			//Construir un objeto Excel
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheetAt(0);
			Row rowObj = sheet.getRow(row);
			Cell cell = rowObj.getCell(column);
			String value = cell.getStringCellValue();
			return value;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
    }
	
}
