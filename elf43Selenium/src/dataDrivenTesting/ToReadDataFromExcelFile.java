package dataDrivenTesting;

/*			*****	Data Driven Testing	*****
	how to retrive the data from the excelmfile using APACHE POI...			*/
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import GenricLibrary.ReadData1;

/***
 * 
 * @author Rohit
 *
 */
public class ToReadDataFromExcelFile {

	public static void main(String[] args) throws IOException {

		// Step 1: creating InputSteam type of Object.
		File absPath = new File("./testData/demo.xlsx");
		FileInputStream fis = new FileInputStream(absPath);

		/*
		 * // Step 2: Creating object of file type. Workbook workbook =
		 * WorkbookFactory.create(fis); // Workbook workbook1 = new XSSFWorkbook(fis);
		 * 
		 * // Reading Method for Excel. String value =
		 * workbook.getSheet("practice").getRow(5).getCell(1).getStringCellValue();
		 * System.out.println(workbook.getSheet("practice").getRow(5).getCell(2).
		 * getStringCellValue()); System.out.println(value);
		 */
		ReadData1 read = new ReadData1();
		System.out.println(read.fromExcel("practice", 5, 1));
	}
}