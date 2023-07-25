# Automated-Game-of-War

Project description:

  This project creates a deck of 52 cards, shuffles it, and deals it to two players. It then plays hands until the players are out of cards, and assigns a winner to whoever won the most rounds.

Technologies used:

 This is a java project that uses eclipse-ide to run.

Features:

  This project uses a map to assign values to the strings in order to compare card values. It also features two decks instead of one.

Code snippets: 
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
  This code shows how a standard round plays. It uses a for loop to get the card out of each players' hands, and then compares the values assigned to them from the map. It prints out the winner and increments a players score.

  To try:
    Simply pull the repo into an IDE and run.
