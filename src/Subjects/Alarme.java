package Subjects;

import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Vector;

public class Alarme extends Observable implements Observer {
    private List <Object> observers = new Vector<>();


    public void setObservers(Object observer) {
        this.observers.add(observer);
    }

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
    }

    @Override
    public void notifyObservers() {
        super.notifyObservers();
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
