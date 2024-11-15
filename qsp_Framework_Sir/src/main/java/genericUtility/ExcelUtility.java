package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public String getStringDataFromExcel(String sheetname, int rowIndex, int colIndex) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/testData/testScriptData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);		
		String value = workbook.getSheet(sheetname).getRow(rowIndex).getCell(colIndex).getStringCellValue();   
		return value;
	}
	public double getNumaricDataFromExcel(String sheetname, int rowIndex, int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/testData/testScriptData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		double value = workbook.getSheet(sheetname).getRow(rowIndex).getCell(colIndex).getNumericCellValue();
		return value;
	}
	public boolean getBooleanDataFromExcel(String sheetname, int rowIndex, int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/testData/testScriptData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		 boolean value = workbook.getSheet(sheetname).getRow(rowIndex).getCell(colIndex).getBooleanCellValue();
		 return value;
	}
	public Date getDateFromExcel(String sheetname, int rowIndex, int colIndex) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/testData/testScriptData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		    Date value = workbook.getSheet(sheetname).getRow(rowIndex).getCell(colIndex).getDateCellValue();
			return value;
	}

}
