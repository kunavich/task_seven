package by.kunavich.task7.data;

import by.kunavich.task7.data.specification.Specification;
import by.kunavich.task7.entity.Ellipse;
import by.kunavich.task7.entity.EllipseObservable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EllipseRepository implements Repository<Ellipse>{

    private List<Ellipse> ellipseList = new ArrayList<>();
    @Override
    public void add(Ellipse ellipse) throws DataException {
        if (ellipseList.contains(ellipse)){
            throw new DataException("Reprository alrady containes this ellipse "+ ellipse);
        }
        ellipseList.add((EllipseObservable) ellipse);
    }

    @Override
    public void remove(Ellipse ellipse) throws DataException {
        if (!ellipseList.contains(ellipse)){
            throw new DataException("Reprository have no such ellipse "+ ellipse);
        }
        ellipseList.remove(ellipse);

    }

    @Override
    public void update(Ellipse ellipse) {
        int id = ellipse.getId();
        Iterator<Ellipse> iterator =ellipseList.iterator();
        Ellipse nextEllipse;
        while (iterator.hasNext()){
            nextEllipse=iterator.next();
            if (nextEllipse.getId() == id){
                ellipseList.remove(nextEllipse);
                ellipseList.add(ellipse);
                break;
            }
        }


    }

    @Override
    public List query(Specification<Ellipse> specification) {
        List<Ellipse> ellipses = new ArrayList<>();
        for (Ellipse ellipse: ellipseList)
        {
            if(specification.speciffied(ellipse)) {
                ellipses.add(ellipse);
            }
        }
        return ellipses;
    }
}
