package ascSys;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class NumTest {

	@Test
	public void NumクラスN2からgetScoreメソッドを使用して２が返ってくる() {
		Num sut = Num.N2;
		int expected = 2;
		int actual = sut.getScore();
		assertThat(actual, is(expected));
	}

}
