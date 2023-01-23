package GenricLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData1 {
	public static FileInputStream fis = null;
	public static Workbook workbook = null;

	/**
	 * 
	 * @param sheetName
	 * @param rowNo
	 * @param ColNo
	 * @return String ------- This method helps us to read the data from the Excel
	 *         file. Return type will be String. it will accept :String argument for
	 *         Sheetname int for RowNo. int for ColNo.
	 */
	public String stringDatafromExcel(String sheetName, int rowNo, int ColNo) {

		try {
			fis = new FileInputStream(new File("./testData/TestData.xlsx"));
			try {
				workbook = WorkbookFactory.create(fis);
			} catch (EncryptedDocumentException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNo).getCell(ColNo).toString();
	}

	/**
	 * 
	 * @param sheetName
	 * @param rowNo
	 * @param ColNo
	 * @return double ------- This method helps us to read the data from the Excel
	 *         file. Return type will be double. it will accept :String argument for
	 *         Sheetname int for RowNo. int for ColNo.
	 */

	public double integerDatafromExcel(String sheetName, int rowNo, int ColNo) {

		try {
			fis = new FileInputStream(new File("./testData/TestData.xlsx"));
			try {
				workbook = WorkbookFactory.create(fis);
			} catch (EncryptedDocumentException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNo).getCell(ColNo).getNumericCellValue();
	}

	/**
	 * 
	 * @param This   method will help us to read the data from property file
	 * @param
	 * @param String key
	 * @return
	 */
	public static String fromPropertyFile(String key) {
		FileInputStream fis = null;
		Properties properties = null;
		try {
			fis = new FileInputStream(new File("./testData/configuration.properties"));
			properties = new Properties();
			properties.load(fis);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return properties.getProperty(key);

	}

	/***
	 * 
	 * This method will help to read the boolean type data from excel file.
	 * 
	 * @param sheetName
	 * @param rowNo
	 * @param ColNo
	 * @return
	 */

	public boolean booleanDatafromExcel(String sheetName, int rowNo, int ColNo) {

		try {
			fis = new FileInputStream(new File("./testData/TestData.xlsx"));
			try {
				workbook = WorkbookFactory.create(fis);
			} catch (EncryptedDocumentException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNo).getCell(ColNo).getBooleanCellValue();
	}

	/***
	 * This method will help the user to read the Local date time from the system.
	 * 
	 * @param sheetName
	 * @param rowNo
	 * @param ColNo
	 * @return
	 */
	public LocalDateTime localTimeDateDatafromExcel(String sheetName, int rowNo, int ColNo) {

		try {
			fis = new FileInputStream(new File("./testData/TestData.xlsx"));
			try {
				workbook = WorkbookFactory.create(fis);
			} catch (EncryptedDocumentException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNo).getCell(ColNo).getLocalDateTimeCellValue();
	}

}
