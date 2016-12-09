package ru.mbogomolov;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import org.junit.Test;

/**
 * Merge two sorted array test.
 * @author Michael Bogomolov (mybogomolov@gmail.com)
 */
public class MergeTwoSortedArraysTest {
    @Test
    public void whenHaveTwoSortedArraysThenMerge() {
        MergeTwoSortArrays arraysForMerge = new MergeTwoSortArrays(new int[] {67, 87, 98}, new int[] {3, 88, 92});
        int[] result = arraysForMerge.arraysMerge();
        assertThat(result, is(new int[] {3, 67, 87, 88, 92, 98}));
    }
}
