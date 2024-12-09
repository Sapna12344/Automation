package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Script6 {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis=new FileInputStream("./Testdata/FacebookCredentials.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheet("Sheet1");
		int lr=sheet.getLastRowNum();
		for(int i=0;i<=1;i++)
		{
			XSSFRow row = sheet.getRow(i);
			XSSFCell cell=row.getCell(0);
			String c1val=cell.getStringCellValue();
			XSSFCell Cel2=row.getCell(1);
			String c1va2=Cel2.getStringCellValue();
			System.out.println(c1val+" "+" "+c1va2);
		}

		book.close();
		fis.close();

	}

}
