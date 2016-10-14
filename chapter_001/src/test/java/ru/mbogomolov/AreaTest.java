package ru.mbogomolov;


import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import org.junit.Test;

public class AreaTest{
	@Test
	public void WhenSetDistanceFromPointsThenRecieveTriangleArea(){ 
    Point a = new Point(1,1);    
    Point b = new Point(3,3);
    Point c = new Point(1,3);
		Triangle triangle = new Triangle(a,b,c);
		final double result = triangle.area();
		assertThat(result, is(2.0));
	}
	
}

