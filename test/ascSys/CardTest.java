package ascSys;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class CardTest {
	public Card card = new Card(Suit.SPADE, Num.N8);
	
	@Test
	public void CardクラスにスペードをセットしてgetSuitを受け取る() {

		Suit expected = Suit.SPADE;
		Suit actual = card.getSuit();
		assertThat(actual, is(expected));
		
	}
	@Test
	public void CardクラスにN8をセットしてN8を受け取る() {

		Num expected = Num.N8;
		Num actual = card.getNum();
		assertThat(actual, is(expected));
	}
	@Test
	public void CardクラスのコンストラクタでgetUpSideでfalseが返ってくる() {
		Card card = new Card(Suit.SPADE, Num.N8);

		boolean expected = false;
		boolean actual = card.getUpSide();
		assertThat(actual, is(expected));
	}
	@Test
	public void CardクラスでturnUpSideメソッドで裏返してtrueが返ってくる() {

		boolean expected = true;
		boolean actual = card.turnUpSide();
		assertThat(actual, is(expected));
	}
	
}
