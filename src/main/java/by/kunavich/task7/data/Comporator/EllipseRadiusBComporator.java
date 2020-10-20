package by.kunavich.task7.data.Comporator;

import by.kunavich.task7.entity.Ellipse;

import java.util.Comparator;

public class EllipseRadiusBComporator implements Comparator<Ellipse> {
    @Override
    public int compare(Ellipse firseEllipse, Ellipse secondEllipse) {
        Double firstRadiusB=firseEllipse.getB();
        Double secondRadiusB =secondEllipse.getB();

        return firstRadiusB.compareTo(secondRadiusB);
    }
}
