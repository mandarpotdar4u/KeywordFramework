package com.excelRead;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;


public class ReadExcel {

	public FileInputStream fis = null;
	public Workbook wb = null;
	public XSSFSheet sheet = null;
	
	public Sheet getSheet(String fileName, String sheetName) throws Exception {
		
		fis = new FileInputStream(fileName);
		wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetName);
		
	}
}
