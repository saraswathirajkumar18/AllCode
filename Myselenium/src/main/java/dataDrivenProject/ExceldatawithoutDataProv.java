package dataDrivenProject;

import java.io.*;
import java.util.Iterator;

//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;

//import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;




public class ExceldatawithoutDataProv {
	public void readExcel() throws IOException
	{
	FileInputStream excel=new FileInputStream("C:\\Users\\krajk\\OneDrive\\Desktop\\Testdata2.xls");
	Workbook book=new HSSFWorkbook(excel);
	Sheet excelsheet=book.getSheetAt(0);
	Iterator<Row> allrows=excelsheet.iterator();//all rows

   
	while(allrows.hasNext())
	{
		Row rowValue=allrows.next();
	
		//System.out.println ("Row No.: " + rowValue.getRowNum ());
		  if(rowValue.getRowNum()==0 ||rowValue.getRowNum()==1){
		   continue; //just skip the rows if row number is 0 or 1
		  }
		
		Iterator<Cell> EachRowCellsValue=rowValue.iterator();
		
		while(EachRowCellsValue.hasNext())
		{
		Cell cellValue=EachRowCellsValue.next();
		System.out.println(cellValue);
		}
		
	}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExceldatawithoutDataProv usingpoi=new ExceldatawithoutDataProv();
        usingpoi.readExcel();
	}

}
