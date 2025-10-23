package com.TestNGDemos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D11CreateFriendsData {
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	@Test
	public void writeToExcel() {
		row = sheet.createRow(0);
		cell = row.createCell(0);
		cell.setCellValue("Joshna");
		
		//row = sheet.createRow(0);
		cell = row.createCell(1);
		cell.setCellValue("Kumar");
		
		sheet.createRow(1).createCell(0).setCellValue("Supriya");
		sheet.getRow(1).createCell(1).setCellValue("Mehar");
		
		sheet.createRow(2).createCell(0).setCellValue("Rohini");
		sheet.getRow(2).createCell(1).setCellValue("KV");
	}

	@BeforeTest
	public void beforeTest() throws FileNotFoundException {
		file = new File("ExcelFile\\FriendsData.xlsx");
		fos = new FileOutputStream(file);
		wb = new XSSFWorkbook();
		sheet = wb.createSheet();	//Will create sheet with name Sheet0
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.write(fos);
		wb.close();
		fos.close();
	}

}
