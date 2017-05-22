package ascSys;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class DeckTest {

	@Test
	public void DeckクラスにstaticメソッドでトランプをつくりgetSizeメソッドで枚数確認() {
		Deck trump =  Deck.createTrump();

		int actual = trump.getSize();
		int expected = 52;
		assertThat(actual, is(expected));
	}

	@Test
	public void DeckクラスにstaticメソッドでトランプをつくりpickUpCardメソッドでスペードのAを確認() {
		Deck trump =  Deck.createTrump();

		Card card = trump.pickUpCard();
		Suit Suit_actual = card.getSuit();
		Num Num_actual = card.getNum();
		Suit Suit_expected = Suit.SPADE;
		Num Num_expected = Num.A;
		assertThat(Suit_actual, is(Suit_expected));
		assertThat(Num_actual, is(Num_expected));
	}

	@Test
	public void DeckクラスにstaticメソッドでトランプをつくりpickUpCardメソッドを2回して２枚目のハートのAを確認() {
		Deck trump =  Deck.createTrump();

		Card card = trump.pickUpCard();
		Card cards = trump.pickUpCard();
		Suit Suit_actual = cards.getSuit();
		Num Num_actual = cards.getNum();
		Suit Suit_expected = Suit.HEART;
		Num Num_expected = Num.A;
		assertThat(Suit_actual, is(Suit_expected));
		assertThat(Num_actual, is(Num_expected));
	}


}
