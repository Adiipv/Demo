package readExcelData;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import datadrivenframework.Flib;

public class CreatingDataInExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		Flib file = new Flib();
		file.writeExcelData("./data/actitimeTestData.xlsx", "validCreds", 0, 3, "links");
//		FileInputStream fis = new FileInputStream("./data/actitimeTestData.xlsx");
//		WorkbookFactory.create(fis);

	}

}
