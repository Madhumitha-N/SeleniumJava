package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	 static String projectPath;
	 static XSSFWorkbook  workbook;
	 static XSSFSheet sheet;
	 public ExcelUtils(String excelPath,String sheetName)
	 {
		 
		 try {
			 
			 this.workbook = new XSSFWorkbook(excelPath);
			 this.sheet= workbook.getSheet(sheetName);
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	 }
	public static void main(String[] args) {
		getRowCount();
		getCellDataString(0,0);
		getCellDataNumber(1,1);
	}

	public static int getRowCount() {
		int rowcount=0;
		try {
			 
			   rowcount=sheet.getPhysicalNumberOfRows();
			 System.out.println("no of rows:"+rowcount);
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return rowcount;
		

	}
	public static int  getColCount() {
		int colcount=0;
		try {
			 
			  colcount=sheet.getRow(0).getPhysicalNumberOfCells();
			 System.out.println("no of cols:"+colcount);
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		 return colcount;
		

	}
	public static String getCellDataString(int rn,int cn)
	{
		 String cellData="";
		 try {
			
			cellData=sheet.getRow(rn).getCell(cn).getStringCellValue();
			//System.out.println(cellData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		 return cellData;
		 
	}
	public static void getCellDataNumber(int rn,int cn)
	{
		 
		 try {
			
			double cellData=sheet.getRow(rn).getCell(cn).getNumericCellValue();
			//System.out.println(cellData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		 
	}

}
