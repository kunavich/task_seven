package by.kunavich.task7.logic;

import by.kunavich.task7.entity.Ellipse;
import by.kunavich.task7.entity.EllipseParametors;
import by.kunavich.task7.entity.Observer;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Registrator implements Observer<Ellipse> {
    private final Map<Integer, EllipseParametors> ellipseParametors = new HashMap<>();
    private final Calculator calculator = (Calculator) new EllipseCalculator();
    private static final Registrator INSANCE = new Registrator();

    private Registrator(){}

    public static Registrator getInsance()    {
        return INSANCE;
    }

    public Optional<Double> getSquare (int id)
    {
        if(!ellipseParametors.containsKey(id))
            return Optional.empty();
        EllipseParametors parametors = ellipseParametors.get(id);
        double square =parametors.getSquare();
        return  Optional.of(square);
    }
    public Optional<Double> getPerimetr ( int id)
    {
        if(!ellipseParametors.containsKey(id))
            return Optional.empty();
        EllipseParametors parametors = ellipseParametors.get(id);
        double perimetr =parametors.getPerimetr();
        return  Optional.of(perimetr);
    }

    @Override
    public void update(Ellipse obserable) {
        double square = calculator.square(obserable);
        double perimetr = calculator.perimetr(obserable);
        EllipseParametors parametors = new EllipseParametors(square,perimetr);
        int id =obserable.getId();
        ellipseParametors.put(id,parametors);


    }
}
