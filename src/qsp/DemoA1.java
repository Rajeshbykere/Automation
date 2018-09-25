package qsp;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class DemoA1 {
public static void main(String[] args) throws Exception {
	Workbook w = WorkbookFactory.create(new FileInputStream ("./Data/Book1.xlsx"));
	String s = w.getSheet("sheet1").getRow(0).getCell(0).toString();
    System.out.println(s);
}
}

