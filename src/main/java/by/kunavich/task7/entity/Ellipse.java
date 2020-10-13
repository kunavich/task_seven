package by.kunavich.task7.entity;

import java.util.Objects;

public class Ellipse {
    private double a;
    private double b;
    private Point center;

    public Ellipse(Point topRight, Point bottomLeft)
    {
        this.b =(topRight.getY() - bottomLeft.getY())/2;
        this.a =(topRight.getX() - bottomLeft.getX())/2;
        this.center=new Point((topRight.getX()-a),(topRight.getY()-b));

    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public Point getCenter() {
        return center;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ellipse ellipse = (Ellipse) o;
        return Double.compare(ellipse.a, a) == 0 &&
                Double.compare(ellipse.b, b) == 0 &&
                Objects.equals(center, ellipse.center);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, center);
    }

    @Override
    public String toString() {
        return "Ellipse{" +
                "a=" + a +
                ", b=" + b +
                ", center=" + center +
                '}';
    }
}
