package com.Actitime.GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLibrary{
	
public String readDataFromePropertyFile(String key) throws IOException {
	FileInputStream fis=new FileInputStream("./Testdata/commondata actitime.property");
	Properties p=new Properties();
	  p.load(fis);
	  String value = p.getProperty(key);
	  return value;
	  
  }


  public String readDataFromExcel(String sheetname,int row,int Cell) throws EncryptedDocumentException, IOException {
  FileInputStream fis=new FileInputStream("./Testdata/automationTestdata.xlsx");
    Workbook wb = WorkbookFactory.create(fis);
 String value = wb.getSheet(sheetname).getRow(row).getCell(Cell).getStringCellValue();
 return value;

}
}