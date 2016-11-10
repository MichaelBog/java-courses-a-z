package ru.mbogomolov;

public class BubbleSort {
	public int[] array;

	public BubbleSort(int[] array){
		this.array = array;
	}

	public static int[] bubbleSort(int[] values) {
		for (int barrier = values.length-1; barrier >= 0; barrier--) {
			for (int index = 0; index < barrier; index++) {
				if (values[index] < values[index+1]) {
					int tmp = values[index];
					values[index] = values[index+1];
					values[index+1] = tmp;
				}
			}
		}
	return values;
	}  
}