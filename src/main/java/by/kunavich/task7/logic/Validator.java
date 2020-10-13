package by.kunavich.task7.logic;

import by.kunavich.task7.entity.Ellipse;
import by.kunavich.task7.entity.Point;

public class Validator {


    public boolean isEllipsePosoble(Point a, Point b)
    {


        if (a.getY() == a.getY())       {
            return false;
        }
        if (a.getX() == a.getX())       {
            return false;
        }
        Ellipse ellipse = new Ellipse(a,b);
        if (ellipse.getA()<=0)          {
            return false;
        }
        if (ellipse.getB()<=0)          {
            return false;
        }

        return true;

    }
    public boolean isEllipse(Ellipse ellipse)
    {
        return !isСircle(ellipse);

    }
    public boolean isСircle(Ellipse ellipse)
    {

        if (ellipse.getA() != ellipse.getB())
        {
            return false;
        }

        return true;

    }


}
