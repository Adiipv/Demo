package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.out.println("Teams Captions ");
		for (int i = 1; i <= 10; i++) {
			FileInputStream fis = new FileInputStream("./data/Test_data.xlsx"); // provide the excel sheet file
			Workbook wb = WorkbookFactory.create(fis); // make the file to read
			Sheet sheet = wb.getSheet("IPL"); /// take sheet name

			Row row = sheet.getRow(i);// get value of row by passing argument
			Cell cell = row.getCell(0); /// get value of cell
			String data = cell.getStringCellValue(); // it will give the value present in cell
			Cell cell1 = row.getCell(2); /// get value of cell
			String data1 = cell1.getStringCellValue();
			
			System.out.println(data+"    "+data1 );
			
			
			
			
			
			

		}

	}
}
