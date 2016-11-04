package me.kippy.survey;

import java.util.HashMap;

public class Sorting {
	
public static void sort() {

	for(int i = 0; i < Main.players.size(); i++) {
		HashMap<Person, Integer> scores = new HashMap<Person, Integer>();
		Person player1 = Main.players.get(i);
		 for(int i1 = 0; i1 < Main.players.size(); i1++) {
			Person player2 = Main.players.get(i1);
			if(player1 != player2) {
				int score = 0;
				for(int i2 = 6; i2 <= 26; i2++) {
					if(player1.get(i2).equalsIgnoreCase(player2.get(i2))){
						score = score +1;
					}	
				}
				
				scores.put(player2, score);
				
			}
		}
		 
		 player1.setHash(scores);
		 
	}
	
	Main.scan();
	
}
}
