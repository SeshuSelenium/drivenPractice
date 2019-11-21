package com.dataDriven.util;

import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Sheet;

public class TestUtils {
	
	public static Xls_Reader x;
	public static Sheet sheet;
	
	public static ArrayList<Object> getData(String sheetName, int rowCou, int cellCou){
		x = new Xls_Reader();
		x.readExcelData();
		sheet = x.workbook.getSheet(sheetName);
		for (int rowNum = 0; rowNum <sheet.getLastRowNum() ; rowNum++) {
			for (int cellNou = 0; cellNou < sheet.getLastRowNum(); cellNou++) {
				
			
		sheet.getRow(rowNum).getCell(cellNou).getCellType();
		
		sheet.getRow(rowNum).getCell(cellNou).getCellType();
			}
		}
		return null;
		
	}

}
