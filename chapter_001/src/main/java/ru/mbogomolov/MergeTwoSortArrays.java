package ru.mbogomolov;
/**
* Merge two sorted array.
* @author Michael Bogomolov (mybogomolov@gmail.com)
*/

public class MergeTwoSortArrays {
	/**
	* Firts sorted array.
	*/
	private final int[] firstArray;
	/**
	* Second sorted array.
	*/
	private final int[] secondArray;
	/**
	* Constructor.
	* @param firstArray firstArray
	* @param secondArray secondArray
	*/
public MergeTwoSortArrays(int[] firstArray, int[] secondArray) {
	this.firstArray = firstArray;
	this.secondArray = secondArray;
}
	/**
	* Merge two previosly sorted arrays.
	* @return combined sorted array
	*/
public int[] arraysMerge() {
	int[] mergeArray = new int[this.firstArray.length + this.secondArray.length];
	int firstArrayIndex = 0;
	int secondArrayIndex = 0;
	int mergeArrayIndex = 0;
	while (firstArrayIndex < this.firstArray.length && secondArrayIndex < this.secondArray.length) {
		if (this.firstArray[firstArrayIndex] < this.secondArray[secondArrayIndex]) {
		mergeArray[mergeArrayIndex]	= this.firstArray[firstArrayIndex];
			firstArrayIndex++;
		} else {
			mergeArray[mergeArrayIndex] = this.secondArray[secondArrayIndex];
			secondArrayIndex++;
		}
		mergeArrayIndex++;
	}
	while (firstArrayIndex < this.firstArray.length) {
	 	mergeArray[mergeArrayIndex] = this.firstArray[firstArrayIndex];
	 	mergeArrayIndex++;
	 	firstArrayIndex++;
	 }
	while (secondArrayIndex < this.secondArray.length) {
	 	mergeArray[mergeArrayIndex] = this.secondArray[secondArrayIndex];
	 	mergeArrayIndex++;
	 	secondArrayIndex++;
	 }
	 return mergeArray;
}
}