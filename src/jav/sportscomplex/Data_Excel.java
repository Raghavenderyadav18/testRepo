package jav.sportscomplex;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Data_Excel
{
 static HSSFWorkbook workbook;
 static HSSFSheet sheet;
 //static HSSFRow createRow;
 //static HSSFCell createCell;
 static int count=0;
 static int row=0;
 
 public static void dataToExcel(Details d)
 {
	 if(count==0)
	 {
	 workbook=new HSSFWorkbook();
	 sheet=workbook.createSheet();
	 }
	 HSSFRow createRow = sheet.createRow(row);
       createRow.createCell(0).setCellValue(d.getName());
       createRow.createCell(1).setCellValue(d.getTime());
       createRow.createCell(2).setCellValue(d.getSlot());
       row++;
       try {
		FileOutputStream fos = new FileOutputStream("Data.xls");
		workbook.write(fos);
		fos.flush();
		fos.close();
		workbook.close();
       } catch (IOException e) {
		e.printStackTrace();
	}
       
 
       //createCell.setCellValue(d.name);
 }
 
}
