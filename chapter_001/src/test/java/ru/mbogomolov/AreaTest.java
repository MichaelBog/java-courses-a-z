package ru.mbogomolov;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import org.junit.Test;

public class AreaTest{
	@Test
	public void WhenSetDistanceFromPointsThenRecieveTriangleArea(){
		Triangle triangle = new Triangle(1,1; 2,2; 3,3);
		final double area = triangle.area;
		assertThat(area, is(3.1196));
	}
	
	}

}