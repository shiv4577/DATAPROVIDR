package utility;

import java.util.ArrayList;

public class testutil {

	
	public  static ArrayList < Object[]>  getdatafromexcel() {
		
		ArrayList < Object[]> mydata= new ArrayList < Object[]>();
		Xls_Reader reader= new Xls_Reader("E:\\All Selenium Workspace\\Think-App\\DATAPROVIDER\\src\\test\\resources\\Excel\\TestData1.xlsx");
		
		for(int nownum=2;nownum<=reader.getRowCount("RegTestData");nownum++) {
			
			String username=reader.getCellData("RegTestData", "username", nownum);
			String Password=reader.getCellData("RegTestData", "Password", nownum);
			
			Object ob[]= {username,Password};
			mydata.add(ob);
		}
		
		return mydata;
		
		
	}
}
