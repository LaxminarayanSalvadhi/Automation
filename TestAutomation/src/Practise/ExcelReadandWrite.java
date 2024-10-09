package Practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadandWrite {
	
	
	public static void ExcelWrite() {
		try {			
			//Create a Workbook
			XSSFWorkbook wk1= new XSSFWorkbook();
			//Create a sheet
			XSSFSheet s1= wk1.createSheet("TestSheet1");
			XSSFSheet s2=wk1.createSheet("TestSheet2");
			
			//creating 1st row and adding in 1 and 2nd cell
			XSSFRow r1=s1.createRow(0);
			XSSFRow r2=s1.createRow(1);
			XSSFRow r3=s1.createRow(2);
			XSSFRow r4=s1.createRow(3);
			XSSFRow r5=s1.createRow(4);
			
			XSSFCell c1=r1.createCell(0);
			c1.setCellValue("Name");
			XSSFCell c2=r1.createCell(1);
			c2.setCellValue("Address");
			//System.out.println(c2.getAddress());
			
			//Adding data in 1st Row
			XSSFCell c3=r2.createCell(0);
			c3.setCellValue("Swamy");
			XSSFCell c4=r2.createCell(1);
			c4.setCellValue("Mumbai");
			
			
			//Creating 2nd row data
			XSSFCell c5=r3.createCell(0);
			c5.setCellValue("LX");
			XSSFCell c6=r3.createCell(1);
			c6.setCellValue("Hyd");
			
			//Creating 3rd row data
			XSSFCell c7=r4.createCell(0);
			c7.setCellValue("Laxmi");
			XSSFCell c8=r4.createCell(1);
			c8.setCellValue("Pune");
			
			//Creating 4th row data
			XSSFCell c9=r5.createCell(0);
			c9.setCellValue("Narayan");
			XSSFCell c10=r5.createCell(1);
			c10.setCellValue("Mysore");
			
			//creating rows for 2nd Sheet
			XSSFRow r6=s2.createRow(0);
			XSSFRow r7=s2.createRow(1);
			
			//Creating 1t row data for 2nd sheet
			XSSFCell c1Sheet2=r6.createCell(0);
			c1Sheet2.setCellValue("Rohit");
			XSSFCell c2sheet2=r6.createCell(1);
			c2sheet2.setCellValue("India");
			
			//Creating 1t row data for 2nd sheet
			XSSFCell c3Sheet2=r7.createCell(0);
			c3Sheet2.setCellValue("Virat");
			XSSFCell c4sheet2=r7.createCell(1);
			c4sheet2.setCellValue("UK");
		
			FileOutputStream fileOutputStream = new FileOutputStream("E:\\Personal Data\\Swamy\\Exceltestwrite.xlsx");
			wk1.write(fileOutputStream);
			fileOutputStream.close();
			wk1.close();
			System.out.print("Hello test");
			
			} 
			
			
			catch (IOException e) {
			
				System.out.println("Excel Error receivced"+e.getMessage());
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
			
	}
	
	public static void ExcelRead() {
		String path="E:\\Personal Data\\Swamy\\test1.xlsx";
		
		try {
			//Create a FileInputstream to read the data
			FileInputStream fileinputtest=new FileInputStream(path);
			
			//create a workbook to read the excel file
			XSSFWorkbook wokbook1= new XSSFWorkbook(fileinputtest);
			
			//Get the sheet from the workbook
			XSSFSheet reads1=wokbook1.getSheetAt(0);
			
			//Iterate throgh each row in the sheet
			for(Row row: reads1) {
				
				//Iterate through each cell in the row
				for(Cell readcell: row) {
					System.out.print(readcell.getStringCellValue()+" ");
				}
				System.out.println();
			}
			
			
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ExcelWrite();
		ExcelRead();
		
	}

	

}
