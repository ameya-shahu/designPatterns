package observer.customImplementation.subjectinterfaces;

import observer.customImplementation.observerinterfaces.Observer;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
