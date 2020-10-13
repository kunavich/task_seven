package by.kunavich.task7.data;

import by.kunavich.task7.entity.Ellipse;
import by.kunavich.task7.entity.Point;
import by.kunavich.task7.logic.Validator;

public class Parser {
    public Ellipse parse (String line) throws DataException {
        Validator validator= new Validator() ;

        String[] split =line.split(" ");
        if(split.length!=4)            {
            throw new DataException("line Wrong: "+line );
        }
        double topRightX =Double.parseDouble(split[0]);
        double topRightY =Double.parseDouble(split[1]);
        double buttomLeftX =Double.parseDouble(split[2]);
        double buttomLeftY =Double.parseDouble(split[3]);
        Point a= new Point(topRightX,topRightY);
        Point b= new Point(buttomLeftX,buttomLeftY);
        if(!validator.isEllipsePosoble(a,b)){
            throw new DataException("line Wrong: "+line );
        }
        return new Ellipse(a,b);
    }
}
