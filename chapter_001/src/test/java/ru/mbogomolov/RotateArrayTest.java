package ru.mbogomolov;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import org.junit.Test;

public class RotateArrayTest{
	@Test
	public void whenRecieveArrayThenRotate(){
		RotateArray values = new RotateArray(new int[][] {{1,2,3}, {4,5,6}, {7,8,9}});
		int[][] result = values.rotateArrayClockWise();
		assertThat(result, is(new int[][] {{3,6,9}, {2,5,8}, {1,4,7}}));
	}
}