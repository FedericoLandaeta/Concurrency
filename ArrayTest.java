package concurrency;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayTests {

	@Test
	void test() {
		Main arrayLengthTest = new Main();
		int[] arrTest = new int[200000000];
		assertEquals(arrTest.length, arrayLengthTest.arr.length);
	}
	
	@Test
	void test2() {
		Main arrayNullTest = new Main();
		assertNotNull(arrayNullTest.arr);
	}
	
	@Test
	void test3() {
		Main threadTest = new Main();
		int testThreads = 8;
		assertEquals(threadTest.threads, testThreads);
	}
}
