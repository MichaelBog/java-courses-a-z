package ru.mbogomolov;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.IsCloseTo.closeTo;
import org.junit.Test;

public class FactorialTest {
	@Test
	public void WhenRecieveNumberThenCalculateFactorial(){
		int n = 5;
		Factorial factorial = new Factorial();
		final int factorialResult = factorial.factorialCalculate(n);
		assertThat(factorialResult, is(120));
	}
}