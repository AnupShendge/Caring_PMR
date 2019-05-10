package com.PMR.Library;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public ExcelDataConfig(String excelPath) {
		try {
		File src = new File(excelPath);
		FileInputStream fis = new FileInputStream(src);
		wb = new XSSFWorkbook(fis);
	}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
		
		
		public String getData(int sheetnumber, int row, int coloumn) {
			
			sheet = wb.getSheetAt(sheetnumber);
			String data = sheet.getRow(row).getCell(coloumn).getStringCellValue();
			return data;
			
		}
	

}
