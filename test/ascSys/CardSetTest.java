package ascSys;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class CardSetTest {

	@Test
	public void 空のCardSetクラスにaddCardメソッドで１枚カードを加えてpickUpCardメソッドを使用して抜いたカードが同じか確認 () {
		Card expected = new Card(Suit.SPADE, Num.N8);
		CardSet sut = new CardSet();
		sut.addCard(expected);
		Card actual = sut.pickUpCard();
		assertThat(actual, is(expected));
	}

	@Test
	public void addメソッドで2枚のカードをCardSetクラスに追加しgetSizeメソッドで2が返る () {
		Card card_1 = new Card(Suit.SPADE, Num.N8);
		Card card_2 = new Card(Suit.CLUB, Num.A);
		CardSet sut = new CardSet();
		sut.addCard(card_1);
		sut.addCard(card_2);

		int expected = 2;
		int actual = sut.getSize();
		assertThat(actual, is(expected));
	}

	@Test
	public void addCardメソッドで5枚のカードをCardSetクラスに追加しpickUpCardメソッドで2枚抜いてgetSizeメソッドで3返る () {
		int i;
		Card card = new Card(Suit.SPADE, Num.N8);
		CardSet sut = new CardSet();

		for(i=1; i <=5; i++){
			sut.addCard(card);
		}

		for(i=1; i <=2; i++){
			sut.pickUpCard();
		}

		int expected = 3;
		int actual = sut.getSize();
		assertThat(actual, is(expected));
	}
}
