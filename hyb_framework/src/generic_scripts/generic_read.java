package generic_scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class generic_read {
		
		public static String read(String sheet,int row,int cell) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis = new FileInputStream("./poi/testdata1.xlsx");
			Workbook book = WorkbookFactory.create(fis);
			Cell cel = book.getSheet(sheet).getRow(row).getCell(cell);
			String value = cel.getStringCellValue();
			return value;
			

	}

}
