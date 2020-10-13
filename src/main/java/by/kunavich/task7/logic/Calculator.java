/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.kunavich.task7.logic;


import by.kunavich.task7.entity.Ellipse;
import by.kunavich.task7.entity.Point;

import java.util.regex.Pattern;

/**
 *
 * @author Lord
 */
public class Calculator {


   public double square(Ellipse ellipse)
   {
       double a =ellipse.getA();
       double b =ellipse.getB();;
       double answer = Math.PI*a*b;
       return answer;
   }
   public double perimetr(Ellipse ellipse)
   {
       double a =ellipse.getA();
       double b =ellipse.getB();;
       double firstPart= (a*a + b*b)/2;
       double answer =2*Math.PI*Math.sqrt(firstPart);
       return answer;

   }

    //x^2 / a^2 + y^2 / b^2
    private boolean isEllipseCrossAxisX(Ellipse ellipse,double x)
    {
        double answer=x/ellipse.getA();
        return answer==1;

    }
    private boolean isEllipseCrossAxisY(Ellipse ellipse,double y)
    {
        double answer=y/ellipse.getB();
        return answer==1;

    }
    public boolean isEllipseCrossAxis(Ellipse ellipse,double length)
    {

        boolean axisX=isEllipseCrossAxisX(ellipse,length);
        boolean axisY=isEllipseCrossAxisY(ellipse,length);
        if(axisX && !axisY)
            return true;

        if(!axisX && axisY)
            return true;
        return false;

    }

}
