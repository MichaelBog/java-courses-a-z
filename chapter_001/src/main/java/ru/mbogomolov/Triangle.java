package ru.mbogomolov;
import ru.mbogomolov.Point;

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
if (((a.distanceTo(b)) == 0) || ((b.distanceTo(c)) == 0) || ((c.distanceTo(a)) == 0)){
	System.out.println("Невозможно построить треугольник");
} else {
double halfPerimeter = (((a.distanceTo(b))+(b.distanceTo(c))+(c.distanceTo(a))) / 2); 	
double result = Math.sqrt(halfPerimeter*(halfPerimeter - a.distanceTo(b))*(halfPerimeter - b.distanceTo(c))*(halfPerimeter - c.distanceTo(a)));
}
return result;
}
}