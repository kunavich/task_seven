package by.kunavich.task7.entity;

import java.util.Objects;

public class Point {
    private double X;
    private double Y;

    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }

    public void setX(double x) {
        X = x;
    }

    public void setY(double y) {
        Y = y;
    }

    public Point (double x, double y)
    {
        this.X=x;
        this.Y=y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return X == point.X &&
                Y == point.Y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(X, Y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "X=" + X +
                ", Y=" + Y +
                '}';
    }

    public int compareTo(Point secondCenter) {
        double y =getY();
        double x =getX();
        Double length =Math.sqrt(x*x + y*y);

        double y2 =secondCenter.getY();
        double x2 =secondCenter.getX();
        Double length2 =Math.sqrt(x2*x2 + y2*y2);
        return length.compareTo(length2) ;
    }
}
