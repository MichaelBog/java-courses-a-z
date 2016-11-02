package ru.mbogomolov;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.IsCloseTo.closeTo;
import org.junit.Test;

public class SquareTest {
	@Test
	public void WhenWeAskXThenCalculateSquare() {
		Square square = new Square(2,3,4);
		final float calculateResult = square.calculate(1);
		assertThat(calculateResult, is(9));
	}

	@Test
	public void WhenWeAskShowThenShowIsShowing() {
		
	}
}