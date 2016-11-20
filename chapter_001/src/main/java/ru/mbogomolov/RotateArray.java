package ru.mbogomolov;

public class RotateArray{
	public int[][] values;

public RotateArray(int[][] values){
        this.values = values;
}
    
public int[][] rotateArrayClockWise(){
        for (int i = 0; i < this.values.length/2; i++) {
     	for (int j = i; j < this.values.length-1-i; j++) {
     		int tmp = this.values[i][j];
            this.values[i][j] = this.values[this.values.length-1-j][i];
            this.values[this.values.length-1-j][i] = this.values[this.values.length-1-i][this.values.length-1-j];
            this.values[this.values.length-1-i][this.values.length-1-j] = this.values[j][this.values.length-1-i];
            this.values[j][this.values.length-1-i] = tmp;
     	  }
         }
return this.values;
    }
}