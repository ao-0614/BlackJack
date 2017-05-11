package ascSys;

public class Card {
	private Suit suit;
	private Num num;

	public Card(Suit suit, Num num){
		super();
		this.suit = suit;
		this.num = num;
	}

	public Suit getSuit(){
		return suit;
	}
	public Num getNum(){
		return num;
	}

	@override
	public String toString(){
		return "Card Num : " + this.num.toString() + "Card Suit" + this.suit.toString()
	}

}
