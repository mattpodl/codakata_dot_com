package edu.s16222.kata2;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {
	@Test
	public void test_method_chop() {

		App app = new App();
		int testArray1[] = {1,3,5};
		int testArray2[] = {1,3,5,7};

		assertEquals("App should return -1 if array is empty",-1,app.chop(0, null));
		assertEquals("App should return -1 if element is not present in a sorted array",-1,app.chop(0, testArray1));
		assertEquals("App should return 0, element 1  is present at index 0 ",0,app.chop(1, testArray1));
		assertEquals("App should return 1, element 3 is present at index 1 ",1,app.chop(3, testArray1));
		assertEquals("App should return 2, element 5 is present at index 2 ",2,app.chop(5, testArray1));
		assertEquals("App should return 2, element 5 is present at index 2 ",2,app.chop(5, testArray2));
		assertEquals("App should return 3, element 7 is present at index 3 ",3,app.chop(7, testArray2));
	}


}