package week6codingfinal;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Deck deck = new Deck();
Deck deck1 = new Deck();

deck.shuffle();
deck1.shuffle();

Player player1 = new Player("Jake");
Player player2 = new Player("Finn");

for (int i = 0; i< 26; i++) {
player1.draw(deck);

}
for (int k = 0; k < 26; k++) {
	player2.draw(deck1);
}


List<Card> player1Hand = player1.getHand();
List<Card> player2Hand = player2.getHand();
//System.out.println(player1Hand.get(0));
//System.out.println(player1Hand.get(0).getValue());
Map<String, Integer> deckList = new HashMap<>();
deckList.put("Ace", 1);
deckList.put("2", 2);
deckList.put("3", 3);
deckList.put("4", 4);
deckList.put("5", 5);
deckList.put("6", 6);
deckList.put("7", 7);
deckList.put("8", 8);
deckList.put("9", 9);
deckList.put("10", 10);
deckList.put("Jack", 11);
deckList.put("Queen", 12);
deckList.put("King", 13);

for (int j = 0; j < player1Hand.size(); j++) {
	player1.flip();
	player2.flip();
	System.out.println(player1Hand.get(j));
	System.out.println(player2Hand.get(j));
	String value1 = player1Hand.get(j).getValue();
	String value2 = player2Hand.get(j).getValue();
	int numValue1 = deckList.get(value1);
	int numValue2 = deckList.get(value2);
	if (numValue1 > numValue2) {
		
		System.out.println(player1.getPlayer() +" wins this round!");
		player1.incrementScore();
	} else {
		
		System.out.println(player2.getPlayer() + " wins this round!");
		player2.incrementScore();
	}
}

//player1.describePlayer();
//player2.describePlayer();
System.out.println(player1.getPlayer() + "'s final score is: " + player1.getScore() +"\n" + player2.getPlayer() + "'s final score is: " + player2.getScore());
if (player1.getScore() > player2.getScore()) {
	System.out.println("The winner is " + player1.getPlayer() + " with a score of " + player1.getScore() +"!");
} else if (player1.getScore() < player2.getScore()) {
	System.out.println("The winner is " + player2.getPlayer() + " with a score of " + player2.getScore() + "!");
} else {
	System.out.println("We have a draw!");
}
//deck.printDeck();




	}

}
