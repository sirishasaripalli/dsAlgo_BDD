package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelDataRows{
	
public static List<String> ReadRows(){
	List<String> myExcel = new ArrayList<String>();
	
		try {
			File file = new File("C:\\Users\\kollu\\TestData.xlsx");

			FileInputStream fis = new FileInputStream(file);

			Workbook workbook = WorkbookFactory.create(fis);
			Sheet sheet = workbook.getSheet("Sheet1");
			for (int i = sheet.getFirstRowNum(); i <= sheet.getLastRowNum(); i++) {
				for (int j = sheet.getRow(i).getFirstCellNum(); j < sheet.getRow(i).getLastCellNum(); j++) {
					System.out.print(sheet.getRow(i).getCell(j)+"\t");
					myExcel.add(sheet.getRow(i).getCell(j).toString());
				}
				System.out.println();
			}
			
			workbook.close();
			return myExcel;
		} 
		catch (Exception e) {
			e.printStackTrace();
			return myExcel;
		}
}
}