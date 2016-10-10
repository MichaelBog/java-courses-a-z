package ru.mbogomolov;
 
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import org.junit.Test;

public class PointTest{
	@Test
	public void whenSetPointThenReciveDistanceFromAtoB() {
		Point point a = new Point(1,1);
		Point point b = new Point(2,2);
		final double distance = a.distanceTo(b);
		assertThat(distance, is(2));
	}

}