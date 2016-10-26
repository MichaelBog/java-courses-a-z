package ru.mbogomolov;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.IsCloseTo.closeTo;
import org.junit.Test;

public class MaxSideTest{
@Test
public void WhenCreateNewTriangleThenRecieveMaxSide(){
    Point a = new Point(1,1);    
    Point b = new Point(3,3);
    Point c = new Point(1,3);
    Triangle triangle = new Triangle(a,b,c);
    MaxSide maxSideObject = new MaxSide();  
    final double maxSideResult = maxSideObject.max(triangle);
    assertThat(maxSideResult, is(a.distanceTo(b)));
}
}