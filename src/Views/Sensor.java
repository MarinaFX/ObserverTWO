package Views;

import Subjects.Alarme;

import java.util.Observable;
import java.util.Observer;

public class Sensor extends Observable {
    private Alarme alarme;
    private boolean luz;

    public void setLuz(boolean luz) {
        this.luz = luz;
    }

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
    }

    @Override
    public void notifyObservers(Object arg) {
        super.notifyObservers(arg);
    }
}
