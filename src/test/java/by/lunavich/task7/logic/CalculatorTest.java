package by.lunavich.task7.logic;

import by.kunavich.task7.Controller;
import by.kunavich.task7.entity.Ellipse;
import by.kunavich.task7.entity.Point;
import by.kunavich.task7.logic.Calculator;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CalculatorTest {
    @Test
    public void сontrollerSquareTest()    {
        //given
        Point bottomLeft = new Point(0.0, 1.4);
        Point topRight =new Point(3.6, 4.3);
        Ellipse ellipse = new Ellipse(bottomLeft,topRight);
        Calculator calculator = new Calculator();

        double actual = 8.199;

        //whenn
        double s =calculator.square(ellipse);

        //then
        Assert.assertEquals(s,actual,0.10);

    }
    @Test
    public void сontrollerPerimetrTest()    {
        //given
        Point bottomLeft = new Point(0.0, 1.4);
        Point topRight =new Point(3.6, 4.3);
        Ellipse ellipse = new Ellipse(bottomLeft,topRight);
        Calculator calculator = new Calculator();

        double actual = 10.26;

        //whenn
        double s =calculator.perimetr(ellipse);

        //then
        Assert.assertEquals(s,actual,0.10);

    }
}
