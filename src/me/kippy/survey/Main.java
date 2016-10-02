package me.kippy.survey;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Main {
	
	public static void read() throws IOException {
		File iw = new File("");
		Workbook w;
		try {
			w = Workbook.getWorkbook(iw);
			Sheet sheet = w.getSheet(0);
			
			//Group 2
			
		}catch(BiffException e) {
			e.printStackTrace();
		}
	}
	
	public static void sort() {
		
		//Group 3
		
	}
	
	public static void main(String[] args) {
		try {
			read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sort();
	}
	
}
