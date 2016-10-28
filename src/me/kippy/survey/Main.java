package me.kippy.survey;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Main {

	public static ArrayList<Person> players = new ArrayList<Person>();
		
	public static void read() throws IOException {
		File iw = new File("");
		Workbook w;
		try {
			w = Workbook.getWorkbook(iw);
			Sheet sheet = w.getSheet(0);
			
			for(int c = 1; c < sheet.getColumns(); c++) {
				Person p = new Person();
				players.add(p);
				for(int r = 1; r < sheet.getRows(); r++) {
					Cell cell = sheet.getCell(c, r);
					p.set(r, cell.getContents());
				}
			}
			
		}catch(BiffException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try {
			read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Sorting.sort();
	}
	
}
