package by.kunavich.task7.logic;

import by.kunavich.task7.entity.Ellipse;
import by.kunavich.task7.entity.Point;

public class Validator {


    public boolean isEllipsePosoble(Point a, Point b)
    {


        if (a.getY() == b.getY())       {
            return false;
        }
        if (a.getX() == b.getX())       {
            return false;
        }
        Ellipse ellipse = new Ellipse(b,a);
        if (ellipse.getA()<=0)          {
            return false;
        }
        if (ellipse.getB()<=0)          {
            return false;
        }

        return true;

    }



}
