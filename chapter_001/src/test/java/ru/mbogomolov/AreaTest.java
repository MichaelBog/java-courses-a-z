package ru.mbogomolov;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import org.hamcrest.number.IsCloseTo.closeTo;
import org.junit.Test;


public class AreaTest{
	@Test
	public void WhenSetDistanceFromPointsThenRecieveTriangleArea(){ 
    Point a = new Point(1,1);    
    Point b = new Point(3,3);
    Point c = new Point(1,3);
		Triangle triangle = new Triangle(a,b,c);
		final double area = triangle.area();
		assertThat(area, closeTo (2d, 0.0005d));
	}
	
}

