package merge_sort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MergeSortTest {
	
	

	@Test
	void shouldReturnTrueWhenCompareTwoArrays() {
		int[] now = {9,8,7,6,5,4,3,2,1,0};
		int[] orderedNow = {0,1,2,3,4,5,6,7,8,9};
		
		MergeSort.mergeSort(now);
		
		assertArrayEquals(now, orderedNow);
	}
	
	@Test
	void shouldReturnTrueWhenCompareTwoArraysEmpty() {
		int[] now = {};
		int[] orderedNow = {};
		
		MergeSort.mergeSort(now);
		
		assertArrayEquals(now, orderedNow);
	}
	
	@Test
	void shouldReturnTrueWhenCompareTwoArraysOnlyNegativeNumber() {
		int[] now = {-1,-2,-3,-4,-5,-6,-7,-8,-9};
		int[] orderedNow = {-9,-8,-7,-6,-5,-4,-3,-2,-1};
		
		MergeSort.mergeSort(now);
		
		assertArrayEquals(now, orderedNow);
	}

}
