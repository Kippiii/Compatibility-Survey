package me.kippy.survey;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Main {

	public static ArrayList<Person> players = new ArrayList<Person>();
		
	public static void read() throws IOException {
		File iw = new File("F:\\Test.xls");
		Workbook w;
		try {
			w = Workbook.getWorkbook(iw);
			Sheet sheet = w.getSheet(0);
			
			for(int r = 1; r < sheet.getRows(); r++) {
				Person p = new Person();
				players.add(p);
				for(int c = 1; c < sheet.getColumns(); c++) {
					Cell cell = sheet.getCell(c, r);
					p.set(cell.getContents());
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
	
	public static void scan() {
		
		Scanner s = new Scanner(System.in);
		String name = s.next();
		
		Person p = null;
		for(int i = 0; i < players.size(); i++) {
			if(players.get(i).get(1).equalsIgnoreCase(name)) {
				p = players.get(i);
				break;
			}
		}
		
		if(p != null) {
			HashMap<Person, Integer> scores = p.getHash();
			
			TreeMap<Person, Integer> sortedScores = sort(scores);
			System.out.println(sortedScores);
			
		}
		
	}
	
	public static TreeMap<Person, Integer> sort(HashMap<Person, Integer> map) {
		Comparator<Person> c = new valueComparator(map);
		TreeMap<Person, Integer> r = new TreeMap<Person, Integer>(c);
		r.putAll(map);
		return r;
	}
	
}
