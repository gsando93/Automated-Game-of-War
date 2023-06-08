package week6codingfinal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List; 
import java.util.Collections;

public class Deck {
private List<Card> cards;

public Deck() {
    cards = new ArrayList<>();
    String[] name = {"Hearts", "Diamonds", "Clubs", "Spades"};
    String[] value = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    for (String suit : name) {
        for (String rank : value) {
            Card card = new Card(rank, suit);
            cards.add(card);
        }
    }
}

public void printDeck() {
    for (Card card : cards) {
        System.out.println(card);
    }
}

public Card draw() {
cards.get(0);	
cards.remove(0);
return cards.get(0);
}

public void shuffle() {
	Collections.shuffle(cards);
	System.out.println(cards);
}


}
