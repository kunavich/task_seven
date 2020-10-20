package by.kunavich.task7.entity;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class EllipseObservable extends Ellipse implements Observable<Ellipse>{
    private final Set<Observer<Ellipse>> observers = new HashSet<>();


    public EllipseObservable(Point bottomLeft, Point topRight) {
        super(bottomLeft, topRight);
    }


    @Override
    public void addObserver(Observer<Ellipse> observer) {
        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer<Ellipse> observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyObserver() {
        for (Observer<Ellipse> observer:observers) {
            observer.update(this);
        }

    }

    @Override
    public void setA(double a) {
        super.setA(a);
        notifyObserver();
    }

    @Override
    public void setB(double b) {
        super.setB(b);
        notifyObserver();
    }

    @Override
    public void setCenter(Point center) {
        super.setCenter(center);
        notifyObserver();
    }
}
