package by.kunavich.task7.data;

import by.kunavich.task7.data.specification.Specification;

import java.util.List;

public interface Repository<T> {
    void add(T ellipse) throws DataException;
    void remove(T ellipse) throws DataException;
    void update (T ellipse);

    List<T> query(Specification<T> specification);
}
