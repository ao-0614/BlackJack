package ascSys;

public class Card {
	private Suit suit;
	private Num num;
	private boolean upside;

	public Card(Suit suit, Num num){
		super();
		this.suit = suit;
		this.num = num;
		this.upside = false;
	}

	public Suit getSuit(){
		return suit;
	}
	public Num getNum(){
		return num;
	}
	public boolean getUpSide(){
		return upside;
	}
	public boolean turnUpSide(){
		upside =! upside;
		return upside;
	}

	@Override
	public String toString(){
		if(this.upside == false){
			return "Card Num: xx	Card Suit: xx" ;
		}
		return "Card Num : " + this.num.toString() + "Card Suit" + this.suit.toString();
	}

}
