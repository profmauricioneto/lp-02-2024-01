package interfaceclass.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    public List<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    public boolean isEven(int id) {
        boolean flag = id % 2 == 0;
        return flag;
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyAllAttached() {
        for (Observer ob: observers) {
            ob.update();
        }
    }
}
