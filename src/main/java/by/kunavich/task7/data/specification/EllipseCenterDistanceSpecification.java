package by.kunavich.task7.data.specification;

import by.kunavich.task7.entity.Ellipse;
import by.kunavich.task7.entity.Point;
import by.kunavich.task7.logic.Calculator;
import by.kunavich.task7.logic.EllipseCalculator;

public class EllipseCenterDistanceSpecification implements Specification<Ellipse> {

    private final double distance;

    public EllipseCenterDistanceSpecification(double distance) {
        this.distance = distance;
    }


    @Override
    public boolean speciffied(Ellipse ellipse) {
            Point center = ellipse.getCenter();
            double y =center.getY();
            double x =center.getX();
            Double length =Math.sqrt(x*x + y*y);
            return length.compareTo(distance) <= 0 ;
        }
}
