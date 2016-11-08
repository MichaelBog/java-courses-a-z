package ru.mbogomolov;

public class Factorial {
	int n;
	int factorialCount = 1;

	public int factorialCalculate(int n) {
		for (int i = 1; i <= n; i++){
			factorialCount = factorialCount * i;
		}
		return factorialCount;
	}
}