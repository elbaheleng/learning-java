package com.elbaheleng;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;

class SortingArrayTest {

	@Test
	void testSortingArray_Exception() {
//		try {
//			SortingArray array = new SortingArray();
//			int unsorted[] = {1,2,3};
//			int sorted[] = array.sortingArray(unsorted);
//			for(int elem:sorted) {
//				System.out.println(elem);
//			}
//			fail();
//		}
//		catch(NullPointerException e) {
//			System.out.println("Exception generated");
//		}
		
		//OR
		
		SortingArray array = new SortingArray();
		int unsorted[] = null;//test case will pass as exception will be generated
		assertThrows(NullPointerException.class,()-> array.sortingArray(unsorted));
	}
	
	@Test
	void testSorting_Performance() {
		SortingArray array = new SortingArray();
		int unsorted[] = {3,2,1};
		assertTimeout(Duration.ofMillis(100),()-> array.sortingArray(unsorted) );
	}

}
