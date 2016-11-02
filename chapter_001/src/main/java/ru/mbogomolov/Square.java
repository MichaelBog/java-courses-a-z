package ru.mbogomolov;

public class Square {

	public Square(float a, float b, float c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public float calculate(int x){
		int y = 0;
		y = (a * Math.pow(x, 2)) + (b * x) + c;
	}
	public void show(int start, int finish, int step){
		
		for (x = start; x<finish; x= x+step) {
			System.out.println(calculate(x));
		}
	}	
}