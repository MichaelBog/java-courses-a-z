package ru.mbogomolov;
import ru.mbogomolov.Point;
import ru.mbogomolov.MaxSide;

public class Triangle {
public Point a;
public Point b;
public Point c;

public Triangle(Point a, Point b, Point c) {
this.a = a;
this.b = b;
this.c = c;
}

public double area() {
//calculate the triangle area
double triangleArea = 0.0;
double halfPerimeter = ((a.distanceTo(b))+(b.distanceTo(c))+(c.distanceTo(a))) / 2.0;	
if (((a.distanceTo(b)) == 0) || ((b.distanceTo(c)) == 0) || ((c.distanceTo(a)) == 0)){
	System.out.println("Невозможно построить треугольник");
} else {
    triangleArea = Math.sqrt(halfPerimeter*(halfPerimeter - a.distanceTo(b))*(halfPerimeter - b.distanceTo(c))*(halfPerimeter - c.distanceTo(a)));
}
return triangleArea;
}
}