package ascSys;

public class Hand extends CardSet {

	public int getTotalScore() {
		int totalScore = 0;
		boolean Achange = true;
		for(Card cardA11:super.getCards()){
			totalScore += cardA11.getScore(Achange);
			if(totalScore > 21){
				Achange = false;
				totalScore = 0;
				for(Card cardA1:super.getCards()){
					totalScore += cardA1.getScore(Achange);
				}
			}
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