package me.kippy.survey;

public class Sorting {
	
public static void sort() {

	for(int i = 0; i < Main.players.size(); i++) {
		HashMap<Person, int> scores = new HashMap<Person, int>();
		Player player1 = Main.players.get(i);
		 for(int i1 = 0; i1 < Main.players.size(); i1++) {
			Player player2 = Main.players.get(i1);
			if(player1 != player2) {
				int score = 0;
				for(i2 = 5; i2 <= 25; i2++) {
					if(player1.get(i2) == player2.get(i2)){
						score = score +1;
					}	
				}
			}
		}
	}
	

}
