package me.kippy.survey;

import java.util.ArrayList;
import java.util.HashMap;

public class Person {
	ArrayList<String> answers = new ArrayList<String>();
	HashMap<Person, Integer> scores = new HashMap<Person, Integer>();
	
	public String get(int i) {
		return answers.get(i - 1);
	}
	
	public void set(int i, String s){
		answers.set(i - 1, s);
	}
	
	public HashMap<Person, Integer> getHash() {
		return scores;
	}
	
	public void setHash(HashMap<Person, Integer> hm) {
		scores = hm;
	}

}
