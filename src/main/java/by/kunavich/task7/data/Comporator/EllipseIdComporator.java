package by.kunavich.task7.data.Comporator;

import by.kunavich.task7.entity.Ellipse;

import java.util.Comparator;

public class EllipseIdComporator implements Comparator<Ellipse> {
    @Override
    public int compare(Ellipse firseEllipse, Ellipse secondEllipse) {
        Integer firstId=firseEllipse.getId();
        int secondId =secondEllipse.getId();

        return firstId.compareTo(secondId);
    }
}
