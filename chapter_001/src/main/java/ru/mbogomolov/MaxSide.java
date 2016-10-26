package ru.mbogomolov;
import ru.mbogomolov.Point;
import ru.mbogomolov.Triangle;

public class MaxSide {
    Point a = new Point(1,1);
    Point b = new Point(3,3);
    Point c = new Point(1,3);
    
    
Triangle triangle = new Triangle(a,b,c);


public double max(Triangle triangle){ 
        double maxSide = 0;
		  if((a.distanceTo(b)) > (b.distanceTo(c)) || (a.distanceTo(b)) > (c.distanceTo(a))){
			maxSide = a.distanceTo(b);
			}else if((b.distanceTo(c) > a.distanceTo(b)) || (b.distanceTo(c) > c.distanceTo(a))){
            maxSide = b.distanceTo(c);
			}else
            {maxSide = c.distanceTo(a);
		      }       
    return maxSide;
                     }
}