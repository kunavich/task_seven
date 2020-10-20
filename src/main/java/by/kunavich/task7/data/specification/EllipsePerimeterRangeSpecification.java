package by.kunavich.task7.data.specification;

import by.kunavich.task7.entity.Ellipse;
import by.kunavich.task7.logic.Calculator;
import by.kunavich.task7.logic.EllipseCalculator;

public class EllipsePerimeterRangeSpecification implements Specification<Ellipse> {

    private final double minPerimeter;
    private final double maxPerimeter;
    private final Calculator calculator;

    public EllipsePerimeterRangeSpecification(double minPerimeter,double maxPerimeter) {
        this.minPerimeter = minPerimeter;
        this.maxPerimeter = maxPerimeter;
        calculator = (Calculator) new EllipseCalculator();
    }


    @Override
    public boolean speciffied(Ellipse ellipse) {
            Double perimeter = calculator.perimetr(ellipse);
            return perimeter.compareTo(minPerimeter) >= 0 &&
                    perimeter.compareTo(maxPerimeter) <= 0;
        }
}
