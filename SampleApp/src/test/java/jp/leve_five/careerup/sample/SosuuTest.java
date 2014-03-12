package jp.leve_five.careerup.sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class SosuuTest {

	@Test
	public void test2より小さい素数の数は０である() {
		PrimeNumbers primeNumbers = new PrimeNumbers();
		int count = primeNumbers.getCount(2);
		assertEquals(count, 0);
	}
	@Test
	public void test5より小さい素数の数は2である() {
		PrimeNumbers primeNumbers = new PrimeNumbers();
		int count = primeNumbers.getCount(5);
		assertEquals(count, 2);
	}
	@Test
	public void test10より小さい素数の数は4である() {
		PrimeNumbers primeNumbers = new PrimeNumbers();
		int count = primeNumbers.getCount(10);
		assertEquals(count, 4);
	}
	@Test
	public void test19より小さい素数の数は7である() {
		PrimeNumbers primeNumbers = new PrimeNumbers();
		int count = primeNumbers.getCount(19);
		assertEquals(count, 7);
	}
	@Test
	public void test54より小さい素数の数はである() {
		PrimeNumbers primeNumbers = new PrimeNumbers();
		int count = primeNumbers.getCount(54);
		assertEquals(count, 2);
	}
	@Test
	public void test224より小さい素数の数はである() {
		PrimeNumbers primeNumbers = new PrimeNumbers();
		int count = primeNumbers.getCount(224);
		assertEquals(count, 2);
	}
	@Test
	public void test312より小さい素数の数はである() {
		PrimeNumbers primeNumbers = new PrimeNumbers();
		int count = primeNumbers.getCount(312);
		assertEquals(count, 2);
	}
	@Test
	public void test616より小さい素数の数はである() {
		PrimeNumbers primeNumbers = new PrimeNumbers();
		int count = primeNumbers.getCount(616);
		assertEquals(count, 2);
	}
	@Test
	public void test888より小さい素数の数はである() {
		PrimeNumbers primeNumbers = new PrimeNumbers();
		int count = primeNumbers.getCount(888);
		assertEquals(count, 2);
	}
	@Test
	public void test977より小さい素数の数はである() {
		PrimeNumbers primeNumbers = new PrimeNumbers();
		int count = primeNumbers.getCount(977);
		assertEquals(count, 2);
	}


}
