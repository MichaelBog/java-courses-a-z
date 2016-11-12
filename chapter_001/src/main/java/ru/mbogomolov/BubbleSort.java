package ru.mbogomolov;

public class BubbleSort {
	public int[] values;

	public BubbleSort(int[] values){
		this.values = values;
	}

	public int[] bubbleSort() {
		for (int barrier = this.values.length-1; barrier >= 0; barrier--) {
			for (int index = 0; index < barrier; index++) {
				if (this.values[index] < this.values[index+1]) {
					int tmp = this.values[index];
					this.values[index] = this.values[index+1];
					this.values[index+1] = tmp;
				}
			}
		}
	return this.values;
	}  
}