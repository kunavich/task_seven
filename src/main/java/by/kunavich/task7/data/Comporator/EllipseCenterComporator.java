package by.kunavich.task7.data.Comporator;

import by.kunavich.task7.entity.Ellipse;
import by.kunavich.task7.entity.Point;

import java.util.Comparator;

public class EllipseCenterComporator implements Comparator<Ellipse> {
    @Override
    public int compare(Ellipse firseEllipse, Ellipse secondEllipse) {
        Point firstCenter=firseEllipse.getCenter();
        Point secondCenter =secondEllipse.getCenter();

        return firstCenter.compareTo(secondCenter);
    }
}
