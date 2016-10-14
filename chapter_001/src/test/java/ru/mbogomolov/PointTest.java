package ru.mbogomolov;
 
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import org.junit.Test;

public class PointTest{
	@Test
	public void whenSetPointThenReciveDistanceFromAtoB() {
		Point a = new Point(1,1);
		Point b = new Point(3,3);
		final double distance = a.distanceTo(b);
		assertThat(distance, is(2.828));
	}

}