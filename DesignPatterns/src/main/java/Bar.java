import java.util.ArrayList;
import java.util.List;

abstract public class Bar {
    private List<BarObserver> observerList;

    public Bar() {
        this.observerList = new ArrayList<>();
    }

    public abstract boolean isHappyHour();
    public void startHappyHour(){};
    public void endHappyHour(){};

    public void addObserver(BarObserver observer) {
        this.observerList.add(observer);
    }

    public void removeObserver(BarObserver observer) {
        this.observerList.remove(observer);
    }

    public void notifyObservers() {
        for (BarObserver observer: observerList) {
            if (isHappyHour()) { observer.happyHourStarted(this); }
            else observer.happyHourEnded(this);
        }
    }
}
