package ascSys;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class NumTest {
/*
	@Test
	public void NumクラスN2からgetScoreメソッドを使用して２が返ってくる() {
		Num sut = Num.N2;
		int expected = 2;
		int actual = sut.getScore();
		assertThat(actual, is(expected));
	}
*/

	@Test
	public void CardクラスへスペードをセットしてgetSuitでスペードが返る() {
		Num sut = Num.A;
		int expected = 11;
		int actual = sut.getScore(true);
		assertThat(actual, is(expected));
	}

/*
	@Test
	public void CardクラスJをセットしてgetScoreで10が返る() {
		Num sut = Num.J;
		int expected = 10;
		int actual = sut.getScore();
		assertThat(actual, is(expected));
	}
*/

	@Test
	public void CardクラスQをセットしてgetScoreで10が返る() {
		Num sut = Num.Q;
		int expected = 10;
		int actual = sut.getScore(true);
		assertThat(actual, is(expected));
	}

	@Test
	public void CardクラスKをセットしてgetScoreで10が返る() {
		Num sut = Num.K;
		int expected = 10;
		int actual = sut.getScore(true);
		assertThat(actual, is(expected));
	}

	@Test
	public void NumクラスにN2からgetScorechangeAで2返る() {
		Num sut = Num.N2;

		int expected = 2;
		int actual = sut.getScore(true);
		assertThat(actual, is(expected));
	}

	@Test
	public void NumクラスにJからgetScorechangeAで10返る() {
		Num sut = Num.J;

		int expected = 10;
		int actual = sut.getScore(true);
		assertThat(actual, is(expected));
	}

	@Test
	public void NumクラスにAからgetScorechangeAtrueで11返る() {
		Num sut = Num.A;

		int expected = 11;
		int actual = sut.getScore(true);
		assertThat(actual, is(expected));
	}

	@Test
	public void NumクラスにAからgetScorechangeAfalseで1返る() {
		Num sut = Num.A;

		int expected = 1;
		int actual = sut.getScore(false);
		assertThat(actual, is(expected));
	}
}


