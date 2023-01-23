package dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

// WAS to read the data from the excel sheet, where data will be in the symmetric order...

/**
 * 
 * @author Rohit
 * 
 */
public class ReadingSymmetricDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream(new File("./testData/TestData.xlsx"));
		Workbook workbook = WorkbookFactory.create(fis);

		Sheet sheetInfo = workbook.getSheet("practice");
		int rowCount = sheetInfo.getPhysicalNumberOfRows();
		int colCount = sheetInfo.getRow(0).getPhysicalNumberOfCells();

		String[][] sarr = new String[rowCount][colCount];

		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				sarr[i][j] = sheetInfo.getRow(i).getCell(j).toString();
			}
		}

		for (String[] arr : sarr) {
			for (String data : arr) {
				System.out.print(data + "		");
			}
			System.out.println();
		}
	}
}