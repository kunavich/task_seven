package by.kunavich.task7.data.Comporator;

import by.kunavich.task7.entity.Ellipse;

import java.util.Comparator;

public class EllipseRadiusAComporator implements Comparator<Ellipse> {
    @Override
    public int compare(Ellipse firseEllipse, Ellipse secondEllipse) {
        Double firstRadiusA=firseEllipse.getA();
        Double secondRadiusA =secondEllipse.getA();

        return firstRadiusA.compareTo(secondRadiusA);
    }
}
