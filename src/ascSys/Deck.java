package ascSys;

public class Deck extends CardSet {
	private Deck(){

	}

	private static Deck trump = new Deck();

	static Deck createTrump(){
		for(Num num: Num.values()){
			for(Suit suit: Suit.values()){
				trump.addCard(new Card(suit, num));
			}
		}

		return trump;
	}

}
