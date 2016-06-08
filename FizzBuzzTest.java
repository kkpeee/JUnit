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
	public void 引数に15をいれてFizzBuzzと表示されるか(){
		assertThat("FizzBuzz", is(FizzBuzz.getFizzBuzz(15)));
	}


	@Test
	public void 引数に0をいれて0と表示されるか(){
		assertThat("0", is(FizzBuzz.getFizzBuzz(0)));
	}

	@Test
	public void 引数に4をいれて4と表示されるか(){
		assertThat("4", is(FizzBuzz.getFizzBuzz(4)));
	}

	@Test
	public void 引数に100をいれてBuzzと表示されるか() {
		assertThat("Buzz", is(FizzBuzz.getFizzBuzz(100)));
	}

	@Test
	public void 引数に1000をいれてBuzzと表示されるか() {
		assertThat("Buzz", is(FizzBuzz.getFizzBuzz(100)));
	}

	@Test
	public void 引数に負の値をいれてFizzとBuzzとFizzBuzzが表示されるか(){
		assertThat("Fizz", is(FizzBuzz.getFizzBuzz(-3)));
		assertThat("Buzz", is(FizzBuzz.getFizzBuzz(-5)));
		assertThat("FizzBuzz", is(FizzBuzz.getFizzBuzz(-15)));
	}



}
