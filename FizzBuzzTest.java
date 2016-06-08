package jp.co.junit4.sample;


import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author trainee180
 *
 */
public class FizzBuzzTest {

	/**
	 * {@link fizzbuzz.FizzBuzz#getFizzBuzz()} のためのテスト・メソッド。
	 */
	@Test
	public void 引数に3をいれてFizzと表示されるか(){
		assertThat("Fizz", is(FizzBuzz.getFizzBuzz(3)));
	}

	@Test
	public void 引数に5をいれてBuzzと表示されるか(){
		assertThat("Buzz", is(FizzBuzz.getFizzBuzz(5)));
	}

	@Test
	public void 引数に15をいれてFizzBuzzと表示(){
		assertThat("FizzBuzz", is(FizzBuzz.getFizzBuzz(15)));
	}

	@Test
	public void 境界値2をいれた場合2と表示(){
		assertThat("2", is(FizzBuzz.getFizzBuzz(2)));
	}

	@Test
	public void 境界値4をいれた場合4と表示(){
		assertThat("4", is(FizzBuzz.getFizzBuzz(4)));
	}
	@Test
	public void 境界値6をいれた場合Fizzと表示(){
		assertThat("Fizz", is(FizzBuzz.getFizzBuzz(6)));
	}

	@Test
	public void 境界値14をいれた場合14と表示(){
		assertThat("14", is(FizzBuzz.getFizzBuzz(14)));
	}

	@Test
	public void 境界値16をいれた場合16と表示(){
		assertThat("16", is(FizzBuzz.getFizzBuzz(16)));
	}

	@Test
	public void 引数に100をいれてBuzzと表示されるか() {
		assertThat("Buzz", is(FizzBuzz.getFizzBuzz(100)));
	}

}
