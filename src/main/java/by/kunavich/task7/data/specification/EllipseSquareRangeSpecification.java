package by.kunavich.task7.data.specification;

import by.kunavich.task7.entity.Ellipse;
import by.kunavich.task7.logic.Calculator;
import by.kunavich.task7.logic.EllipseCalculator;

public class EllipseSquareRangeSpecification implements Specification<Ellipse>{

    private final double minPerimeter;
    private final double maxPerimeter;
    private final Calculator calculator;

    public EllipseSquareRangeSpecification(double minSquare, double maxSquare)  {
        this.minPerimeter = minSquare;
        this.maxPerimeter = maxSquare;
        calculator = (Calculator) new EllipseCalculator();
    }



    public boolean speciffied(Ellipse ellipse) {
        Double square = calculator.square(ellipse);
        return square.compareTo(minPerimeter) >= 0 &&
                square.compareTo(maxPerimeter) <= 0;
    }
}
