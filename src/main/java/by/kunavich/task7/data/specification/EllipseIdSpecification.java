package by.kunavich.task7.data.specification;

import by.kunavich.task7.entity.Ellipse;
import by.kunavich.task7.logic.Calculator;
import by.kunavich.task7.logic.EllipseCalculator;

public class EllipseIdSpecification implements Specification<Ellipse>{

    private final Integer minId;
    private final Integer maxId;

    public EllipseIdSpecification(Integer minId, Integer maxId)  {
        this.minId = minId;
        this.maxId = maxId;
    }

    public boolean speciffied(Ellipse ellipse) {
        Integer id = ellipse.getId();
        return id.compareTo(minId) >= 0 &&
                id.compareTo(maxId) <= 0;
    }
}
