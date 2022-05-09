package Maven.Karthi;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Karthika\\eclipse-workspace\\Karthi\\Sample.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		
		for (int i = 0; i < sheetAt.getPhysicalNumberOfRows(); i++) {
			Row row = sheetAt.getRow(i);
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				
				CellType celltype = cell.getCellType();
				
				if (celltype.equals(celltype.STRING)) {
					String username = cell.getStringCellValue();
					System.out.println(username);
				}
				else if (celltype.equals(celltype.NUMERIC)) {
					double number = cell.getNumericCellValue();
					//System.out.println(number);
					int data = (int) number;
					//System.out.println(data);
					String password = String.valueOf(data);
					System.out.println(password);
				}
			}
		}
			System.out.println("*****Particular Data*****");
			String name = wb.getSheetAt(0).getRow(1).getCell(0).getStringCellValue();
			System.out.println(name);
			double pass = wb.getSheetAt(0).getRow(1).getCell(1).getNumericCellValue();
			//System.out.println(pass);
			int b = (int) pass;
			System.out.println(b);
	}
}