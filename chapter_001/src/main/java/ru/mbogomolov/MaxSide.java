package ru.mbogomolov;
import ru.mbogomolov.Point;
import ru.mbogomolov.Triangle;

public class MaxSide {
    

public double max(Triangle triangle){ 
    
    double maxSide = 0;
		  if((triangle.a.distanceTo(triangle.b)) > (triangle.b.distanceTo(triangle.c)) || (triangle.a.distanceTo(triangle.b)) > (triangle.c.distanceTo(triangle.a))){
			maxSide = triangle.a.distanceTo(triangle.b);
			}else if((triangle.b.distanceTo(triangle.c) > triangle.a.distanceTo(triangle.b)) || (triangle.b.distanceTo(triangle.c) > triangle.c.distanceTo(triangle.a))){
            maxSide = triangle.b.distanceTo(triangle.c);
			}else
            {maxSide = triangle.c.distanceTo(triangle.a);
		      }       
    return maxSide;
                     }
}