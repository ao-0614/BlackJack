package ascSys;

import java.util.ArrayList;
import java.util.List;

public class CardSet {
	private List<Card> cards = new ArrayList<>();

	public void addCard(Card card){
		this.cards.add(card);
	}

	public Card pickUpCard(){
		return this.cards.remove(0);
	}

	public int getSize() {
		// TODO 自動生成されたメソッド・スタブ
		return this.cards.size();
	}

	public List <Card> getCards(){
		return this.cards;
	}
}
