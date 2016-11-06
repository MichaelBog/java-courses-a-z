package ru.mbogomolov;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.IsCloseTo.closeTo;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;

public class SquareTest {
	@Test
	public void WhenWeAskXThenCalculateSquare() {
		Square square = new Square(2,3,4);
		final float calculateResult = square.calculate(1);
		assertThat(calculateResult, is(9.0f));
	}

	@Test
	public void WhenWeAskShowThenShowIsShowing() {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		new Square(2,3,4).show(1,1,1);
		assertThat(out.toString(), is("9.0\r\n"));
	}
}