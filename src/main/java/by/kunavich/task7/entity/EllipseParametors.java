package by.kunavich.task7.entity;

public class EllipseParametors {

    private double square;
    private double perimetr;

    public EllipseParametors(double square,double perimetr){
        this.perimetr=perimetr;
        this.square=square;
    }

    public double getPerimetr() {
        return perimetr;
    }

    public double getSquare() {
        return square;
    }

    public void setPerimetr(double perimetr) {
        this.perimetr = perimetr;
    }

    public void setSquare(double square) {
        this.square = square;
    }
}
