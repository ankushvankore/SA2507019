package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class D13ReadFromExcel {
	String fPath = "ExcelFile\\OHRM_LoginData.xlsx";
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	@Test(enabled = false)
	public void readSingleData() {
		row = sheet.getRow(0);
		cell = row.getCell(0);
		System.out.println(cell.getStringCellValue());
		
		System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
	}
	
	@Test
	public void readAllData() {
		int rows = sheet.getPhysicalNumberOfRows();
		int cells = sheet.getRow(0).getPhysicalNumberOfCells();
		for(int i = 0; i < rows; i++)	//Rows
		{
			row = sheet.getRow(i);
			for(int j = 0; j < cells; j++)	//Cells
			{
				cell = row.getCell(j);
				String data = cell.getStringCellValue();
				System.out.println(data);
			}
		}
	}

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File(fPath);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);		
		//As we are not creating the workbook rather we are reading the existing workbook
		sheet = wb.getSheet("Login Data");
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.close();
		fis.close();
	}

}
