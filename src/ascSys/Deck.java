package ascSys;

import java.util.Collections;

public class Deck extends CardSet {
	private Deck(){

	}

	private static Deck trump = new Deck();
	static Deck createTrump(){
		trump = new Deck();
		for(Num num: Num.values()){
			for(Suit suit: Suit.values()){
				trump.addCard(new Card(suit, num));
			}
		}

		return trump;
	}

	public void shuffle(){
		Collections.shuffle(trump.getCards());
	}
}
