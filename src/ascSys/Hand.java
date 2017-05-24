package ascSys;

public class Hand extends CardSet {

	public int getTotalScore() {
		int totalScore = 0;
		for(Card card:super.getCards()){
			totalScore += card.getScore(true);
		}
		return totalScore;
	}

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		for(Card card:super.getCards()){
			 sb.append(card.toString());
		}

		return sb.toString();
	}
}