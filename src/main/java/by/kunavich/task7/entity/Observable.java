package by.kunavich.task7.entity;


public interface Observable<T> {
    void  addObserver(Observer<T> observer);
    void  removeObserver(Observer<T> observer);
    void  notifyObserver();
}
