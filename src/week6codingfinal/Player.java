package week6codingfinal;

import java.util.List;

//import week6finalproject.Card;

import java.util.ArrayList;

public class Player {
private List<Card> hand;
private int score;
private String playerName;

public Player(String playerName) {
	this.score = 0;
	this.hand = new ArrayList<>();
	this.playerName = playerName;
}

public String getPlayer() {
	return playerName;
}

public int getScore() {
	return score;
}

public List<Card> getHand() {
	return hand;
}

public void describePlayer() {
	System.out.println("Current player: " + this.getPlayer() + "\nTheir score is: " + this.getScore() + "\nCards in hand: ");
	for (Card card: hand) {
		System.out.println(card);
	}
}

public void flip() {
	hand.get(0);
	hand.remove(0);
}

public Card draw(Deck deck) {

        Card drawnCard = deck.draw();
        hand.add(drawnCard);
        return drawnCard;
	
}

public void incrementScore() {
	score += 1;
	System.out.println("Current score: " + score);
}

}
