package ZoomCarBasic;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataNeededClass 
{
	
@Test(dataProvider="ExcelRead")
public void Dataprovider(String name,String age) // make sure that the type matches with whats being entered in the excel sheet
{

	System.out.println("my name is " +name+ "my age is " +age);
	
		
}
@DataProvider(name="ExcelRead") // make sure the data provider name is correct
public Object[][] fetchData() throws IOException
{
	XSSFWorkbook wbook=new XSSFWorkbook("./Data/DataProvider.xlsx"); // create a folder and put the corresponding excel sheet
	XSSFSheet wsheet = wbook.getSheetAt(0); // make sure that the sheet index starts with 0
	int lastRowNum = wsheet.getLastRowNum(); 
	System.out.println(lastRowNum);
	XSSFRow row=wsheet.getRow(0);
	int lastCellNumrow = row.getLastCellNum();
	System.out.println(lastCellNumrow);
	Object data[][]= new String[lastRowNum][lastCellNumrow];
	for(int i=1;i<lastRowNum+1;i++) // make sure that i starts with 1 and ends with rowcount+1 no <=
	{
		XSSFRow row2 = wsheet.getRow(i);
		String cellvalue="";
		for(int j=0;j<lastCellNumrow;j++) // make sure that the j value starts with 1 and ends with colcount no <=
		{
			cellvalue=row2.getCell(j).getStringCellValue();
		
		
data[i-1][j]=cellvalue;

	}
	
	
	}
	return data;
	}
}