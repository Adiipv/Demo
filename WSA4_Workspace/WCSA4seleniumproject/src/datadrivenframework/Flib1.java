package datadrivenframework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib1 {

	public String readdata(String path, String sheet, int rowcount, int cellcount)
			throws EncryptedDocumentException, IOException {
		FileInputStream fils = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fils);
		Sheet sheeet = wb.getSheet(sheet);
		Row row = sheeet.getRow(rowcount);
		Cell cell = row.getCell(cellcount);
		String data = cell.getStringCellValue();

		return data;

	}

}
