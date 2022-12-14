package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static String[][] getExcelData(String excelFileName) throws IOException {
	
		XSSFWorkbook book=new XSSFWorkbook("./test-data/"+excelFileName+".xlsx");
		XSSFSheet sheet=book.getSheetAt(0);
		int rowNumber=sheet.getLastRowNum();		
		XSSFRow header=sheet.getRow(0);
		int colNumber=header.getLastCellNum();		
		String data[][]=new String[rowNumber][colNumber];
		for(int i=1;i<=rowNumber;i++)
		{
			XSSFRow eachRow=sheet.getRow(i);
			for(int j=0;j<colNumber;j++)
			{
				XSSFCell eachCell=eachRow.getCell(j);
				String cellValue=eachCell.getStringCellValue();				
				data[i-1][j]=cellValue;
							
			}
		}
		
		book.close();
		return data;

	}

}
