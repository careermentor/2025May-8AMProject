package firstPkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileHandling {

	public static void readexcel() throws Exception {

		FileInputStream fis = new FileInputStream("C:\\TestData\\userdata.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sh = wb.getSheet("auto");
		
		int nr = sh.getPhysicalNumberOfRows();  //4
		
		for(int i=0; i<nr; i++)
		{
			XSSFRow row = 	sh.getRow(i);
			
			int nc = row.getPhysicalNumberOfCells();
			
			for(int j=0; j<nc; j++)
			{
				XSSFCell col = row.getCell(j);
				System.out.print(col.getStringCellValue() + "      ");

			}
			
			System.out.println();
		}
		
		
		
		/*

		// First row
		XSSFRow row1 = sh.getRow(0);

		XSSFCell col1 = row1.getCell(0);
		System.out.print(col1.getStringCellValue() + "      ");

		XSSFCell col2 = row1.getCell(1);
		System.out.print(col2.getStringCellValue() + "   ");
		
		
		
		System.out.println();

		// Second row
		XSSFRow row2 = sh.getRow(1);

		XSSFCell col21 = row2.getCell(0);
		System.out.print(col21.getStringCellValue() + "      ");

		XSSFCell col22 = row2.getCell(1);
		System.out.print(col22.getStringCellValue() + "      ");
		
		XSSFCell col23 = row2.getCell(2);
		System.out.print(col23.getStringCellValue());
		
		*/

	}

	public static void readprop() throws Exception {

		FileReader fr = new FileReader("./TestData/abc.properties");

		Properties prop = new Properties();

		prop.load(fr);

		System.out.println(prop.get("username"));

		System.out.println(prop.get("password"));
	}

	public static void readdata() throws Exception {
		// File f = new File("C:\\TestData\\data.txt"); //file connection

		File f = new File("./TestData/xyz.txt");

		FileReader fr = new FileReader(f);

		int r = fr.read();

		while (r != -1) {
			System.out.print((char) r);
			r = fr.read();
		}

		/*
		 * System.out.print((char)r); r = fr.read(); System.out.print((char)r); r =
		 * fr.read(); System.out.print((char)r); r = fr.read();
		 * System.out.print((char)r); r = fr.read(); System.out.print((char)r); r =
		 * fr.read(); System.out.print((char)r); r = fr.read();
		 * System.out.print((char)r); r = fr.read(); System.out.print((char)r); r =
		 * fr.read(); System.out.print((char)r); r = fr.read();
		 * System.out.print((char)r); r = fr.read(); System.out.print((char)r);
		 */

	}

	public static void main(String[] args) throws Exception {

		readexcel();

	}

}
