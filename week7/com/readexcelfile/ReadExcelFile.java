package com.readexcelfile;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public static String[][] getData(String excelFileName) throws IOException {
	
		XSSFWorkbook book=new XSSFWorkbook("./test-data/"+excelFileName+".xlsx");
		XSSFSheet sheet=book.getSheetAt(0);
		int rowNumber=sheet.getLastRowNum();
		System.out.println(rowNumber);
		XSSFRow header=sheet.getRow(0);
		int colNumber=header.getLastCellNum();
		System.out.println(colNumber);
		String data[][]=new String[rowNumber][colNumber];
		
		for(int i=1;i<=rowNumber;i++)
		{
			XSSFRow eachRow=sheet.getRow(i);
			for(int j=0;j<colNumber;j++)
			{
				XSSFCell eachCell=eachRow.getCell(j);
				String cellValue=eachCell.getStringCellValue();
				data[i-1][j]=cellValue;
				//System.out.println(cellValue);
			}
		}
		
		book.close();
		return data;

	}

}
