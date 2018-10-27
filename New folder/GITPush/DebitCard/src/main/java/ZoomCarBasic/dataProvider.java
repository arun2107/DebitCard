package ZoomCarBasic;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;


public class dataProvider {
	@DataProvider(name="ExcelRead")
	public Object[][] fetchData() throws IOException
	{
		XSSFWorkbook wbook=new XSSFWorkbook("./Data/DataProvider.xlsx");
		XSSFSheet wsheet = wbook.getSheetAt(0);
		int lastRowNum = wsheet.getLastRowNum();
		XSSFRow row=wsheet.getRow(0);
		int lastCellNumrow = row.getLastCellNum();
		Object data[][]= new Object[lastRowNum][lastCellNumrow];
		for(int i=1;i<=lastRowNum+1;i++)
		{
			XSSFRow row2 = wsheet.getRow(i);
			for(int j=0;j<=lastCellNumrow;j++)
			{
				String cellvalue=row.getCell(j).getStringCellValue();
			
			
	data[i-1][j]=cellvalue;
		}}
		
		return data;
		
	}
}
