package com.PMR.Library;

public class ReadExcelData {

	public static void main(String[] args) {
			
		
		ExcelDataConfig excel = new ExcelDataConfig("C:\\Users\\Anup\\workspace\\Selenium\\POM_Framework\\data\\PMR Login (1).xlsx");
		
	String username = excel.getData(0, 9, 0);
	System.out.println("username is" + username);
	String password = excel.getData(0, 9, 1);
	System.out.println("password is " + password);
	}

}
