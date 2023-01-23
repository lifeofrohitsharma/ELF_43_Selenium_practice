package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadingDataFromExcelTestNG {

	@DataProvider(name = "data", parallel = true)
	public String[] dataFromExcel() throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(new File("testData./TestData.xlsx/"));
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheetInfo = workbook.getSheet("dataprovider");
		int rowcount = sheetInfo.getPhysicalNumberOfRows() - 1;
		// int colCount = sheetInfo.getRow(0).getPhysicalNumberOfCells();

		String data[] = new String[rowcount];
		for (int i = 0; i < rowcount; i++) {
			data[i] = sheetInfo.getRow(i + 1).getCell(0).toString();
		}
		return data;
	}

	@Test(dataProvider = "data")
	public void test(String url[]) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get(url[0]);
		Thread.sleep(2000);
		driver.quit();
	}
}