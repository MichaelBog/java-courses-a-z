package ru.mbogomolov;

public class RotateArray{
	int index;
	public int[][] values;

public RotateArray(int[][] values){
        this.values = values;
}
    
public int[][] rotateArrayClockWise(){
     
     int helpIndex = index - 1;
     int[][] rotateArray = new int[index][index];
     for (int i = 0; i < index; i++) {
     	for (int j = 0; j < index; j++) {
     		rotateArray[j][helpIndex] = this.values[i][j];
     	}
     	helpIndex--;
     }
return rotateArray;
}
}