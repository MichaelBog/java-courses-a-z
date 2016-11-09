package ru.mbogomolov;

public class Factorial {
	public int factorialCalculate(int n) {
		int factorialCount = 1;
		for (int i = 1; i <= n; i++){
		 factorialCount = factorialCount * i;
		}
		return factorialCount;
	}
}