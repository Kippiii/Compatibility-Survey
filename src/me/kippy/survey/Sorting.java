package me.kippy.survey;

public class Sorting {
	
public static void sort() {

	for(int i = 0; i < Main.players.size(); i++) {
		 for(int i1 = 0; i1 < Main.players.size(); i1++) {
			Player player1 = Main.players.get(i);
			Player player2 = Main.players.get(i1);
			if(player1 != player2) {
				int relationship = 0;
				for(i2 = 0; i2 < Main.questions.size(); i++) {
					if(player1.get(i2).equals(player2.get(i2))){
						relationship = relationship +1;
					}	
				}
				player1.setComp(player2, relationship);
			}
		}
	}
	

}
