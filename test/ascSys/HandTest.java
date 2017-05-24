package ascSys;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class HandTest {
	Hand hand = new Hand();


	@Test
	public void Cardクラスを継承したHandクラスにaddCardメソッドで3と7を追加しgetTotalScoreで10が返ってくる() {
		Card handcard1 = new Card(Suit.SPADE, Num.N3);
		Card handcard2 = new Card(Suit.SPADE, Num.N7);
		hand.addCard(handcard1);
		hand.addCard(handcard2);

		int expected = 10;
		int actual = hand.getTotalScore();
		assertThat(actual, is(expected));
	}

	@Test
	public void Cardクラスを継承したHandクラスにaddCardメソッドで裏向きのカード２枚を追加しtoStringメソッドでxxxが返ってくる() {
		Card handcard1 = new Card(Suit.SPADE, Num.N3);
		Card handcard2 = new Card(Suit.SPADE, Num.N7);
		hand.addCard(handcard1);
		hand.addCard(handcard2);

		String expected = "xxxx";
		String actual = hand.toString();
		assertThat(actual, is(expected));
	}

	@Test
	public void HandクラスaddCardメソッドでJKを追加しgetTotalScoreで20が返ってくる() {

		Card handcard1 = new Card(Suit.SPADE, Num.J);
		Card handcard2 = new Card(Suit.SPADE, Num.K);
		hand.addCard(handcard1);
		hand.addCard(handcard2);

		int expected = 20;
		int actual = hand.getTotalScore();
		assertThat(actual, is(expected));
	}

	@Test
	public void HandクラスaddCardメソッドでAKを追加しgetTotalScoreで21が返ってくる() {

		Card handcard1 = new Card(Suit.SPADE, Num.A);
		Card handcard2 = new Card(Suit.SPADE, Num.K);
		hand.addCard(handcard1);
		hand.addCard(handcard2);

		int expected = 21;
		int actual = hand.getTotalScore();
		assertThat(actual, is(expected));
	}

	@Test
	public void NumクラスにJKAからgetScorechangeAfalseで1返る() {
		Card handcard1 = new Card(Suit.SPADE, Num.J);
		Card handcard2 = new Card(Suit.SPADE, Num.K);
		Card handcard3 = new Card(Suit.SPADE, Num.A);
		hand.addCard(handcard1);
		hand.addCard(handcard2);
		hand.addCard(handcard3);

		int expected = 21;
		int actual = hand.getTotalScore();
		assertThat(actual, is(expected));
	}

}
