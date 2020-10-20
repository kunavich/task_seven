package by.lunavich.task7.logic;

import by.kunavich.task7.entity.Ellipse;
import by.kunavich.task7.entity.Point;
import by.kunavich.task7.logic.EllipseCalculator;
import org.junit.Assert;
import org.junit.Test;

public class EllipseCalculatorTest {
    @Test
    public void сontrollerSquareTest()    {
        //given
        Point bottomLeft = new Point(0.0, 1.4);
        Point topRight =new Point(3.6, 4.3);
        Ellipse ellipse = new Ellipse(bottomLeft,topRight);
        EllipseCalculator ellipseCalculator = new EllipseCalculator();

        double actual = 8.199;

        //whenn
        double s = ellipseCalculator.square(ellipse);

        //then
        Assert.assertEquals(s,actual,0.10);

    }
    @Test
    public void сontrollerPerimetrTest()    {
        //given
        Point bottomLeft = new Point(0.0, 1.4);
        Point topRight =new Point(3.6, 4.3);
        Ellipse ellipse = new Ellipse(bottomLeft,topRight);
        EllipseCalculator ellipseCalculator = new EllipseCalculator();

        double actual = 10.26;

        //whenn
        double s = ellipseCalculator.perimetr(ellipse);

        //then
        Assert.assertEquals(s,actual,0.10);

    }
}
