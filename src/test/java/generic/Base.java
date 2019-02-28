package generic;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.binary.XSSFBCommentsTable;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import junit.framework.Assert;

public class Base {
	
	public void compareValue(Object actualvalue, Object expectedvalue) {
     Assert.assertEquals(expectedvalue, actualvalue);
     
	}

	
	/*
	 * public void learningCollection() { List<String> ll; ll = new
	 * ArrayList<String>(); ll.add("sdfjb"); ll.add("5461"); ll.add("nknk");
	 * 
	 * ll = new LinkedList();
	 * 
	 * ll = new Vector();
	 * 
	 * Set ss; ss = new HashSet(); ss = new LinkedHashSet(); ss = new TreeSet();
	 * 
	 * Map<Integer, String> mm; mm = new HashMap<Integer, String>(); mm = new
	 * LinkedHashMap<Integer, String>(); mm = new TreeMap<Integer, String>();
	 * 
	 * TreeMap hh = new TreeMap(); }
	 */
	
	public void readExcel() {
		File f2=new File(".\\src\\test\\java\\testData\\createxcel.xlsx");
		List<String> l1 = new ArrayList<String>();
		try {
			FileInputStream fis=new FileInputStream(f2);
			Workbook wb=new XSSFWorkbook(fis);
			Sheet sh=wb.getSheetAt(0);
			for(int i=0;i<sh.getLastRowNum();i++) {
				Row rw=sh.getRow(i);
				Cell cl=rw.getCell(0);
				String output=cl.getStringCellValue();
				System.out.println(output);
				l1.add(output);
				System.out.println(l1);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public void writeExcel(){
		File f1=new File(".\\src\\test\\java\\testData\\createxcel.xlsx");
		Workbook wb = new XSSFWorkbook();
		
		Sheet sh=wb.createSheet();
		
		Row rw=sh.createRow(0);
		Cell cl=rw.createCell(0);
		cl.setCellValue("Welcome to Excel");
		
		try {
			FileOutputStream fos=new FileOutputStream(f1);
			wb.write(fos);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
}
