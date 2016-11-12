package ru.mbogomolov;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import org.junit.Test;

public class BubbleSortTest {
	@Test
    public void whenRecieveArrayThenSort() {
    	BubbleSort bubbleArray = new BubbleSort(new int[] {1,2,7,8});
    	int[] result = bubbleArray.bubbleSort();
    	assertThat(result, is(new int[] {8,7,2,1}));
    }  
}   
