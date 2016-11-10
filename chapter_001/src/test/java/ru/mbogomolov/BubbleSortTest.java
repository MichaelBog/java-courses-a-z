package ru.mbogomolov;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import org.junit.Test;

public class BubbleSortTest {
	@Test
    public void whenRecieveArrayThenSort() {
    	//BubbleSort array = new BubbleSort(new int[] {1,2,7,8});
    	int[] array = new int[] {1,2,7,8};
    	int[] result = BubbleSort.bubbleSort(array);
    	assertThat(result, is(new int[] {8,7,2,1}));
    }  
}   
