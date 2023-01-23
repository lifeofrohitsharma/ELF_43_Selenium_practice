package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadingCredentialsFromExcelForActitime {

	@DataProvider(name = "data", parallel = true)
	public String[][] actitime() throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream(new File("testData./TestData.xlsx/"));
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheetInfo = workbook.getSheet("actitime");
		int rowCount = sheetInfo.getPhysicalNumberOfRows() - 1;
		int colCount = sheetInfo.getRow(0).getPhysicalNumberOfCells();

		String data[][] = new String[rowCount][colCount];
		for (int i = 1, k = 0; i <= rowCount; i++, k++) {
			for (int j = 0; j < colCount; j++) {
				data[k][j] = sheetInfo.getRow(i).getCell(j).toString();
			}
		}
		return data;

	}

	@Test(dataProvider = "data")
	public void actiTime(String credentials[]) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://demo.actitime.com/login.do");

		driver.findElement(By.id("username")).sendKeys(credentials[0]);
		driver.findElement(By.name("pwd")).sendKeys(credentials[1]);
		driver.findElement(By.id("loginButton")).click();

		Thread.sleep(3000);
		driver.quit();
	}
}