package ru.mbogomolov;

public class Square {
		float a;
		float b;
		float c;

	public Square(float a, float b, float c){
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public float calculate(int x){
		return (float)(a * Math.pow(x, 2)) + (b * x) + c;
	}

	public void show(int start, int finish, int step){
		for (int x = start; x<finish; x= x+step) {
			System.out.println(calculate(x));
		}
	}	
}