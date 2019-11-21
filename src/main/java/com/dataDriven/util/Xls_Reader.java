package com.dataDriven.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xls_Reader {
	public static String s, s2;
	public static FileInputStream input;
	public static XSSFWorkbook workbook;
	public static Sheet sheet;

	public static void readExcelData() {

		try {
			input = new FileInputStream("E:\\facebookIdPassword.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			workbook = new XSSFWorkbook(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sheet = workbook.getSheet("facebook");
		
		System.out.println(sheet.getRow(2).getCell(1).getCellType());
		System.out.println(sheet.getRow(2).getCell(2).getCellType());
		
	}
	
	public static void main(String[] args) {
		Xls_Reader.getTestData();
	}

}
