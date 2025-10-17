package ru.mirea.uibo1.kaburgan.pr_5.number_10;

import java.util.ArrayList;
import java.util.List;

public class ObservableStringBuilder implements Observable {
    private final StringBuilder sb = new StringBuilder();
    private final List<Observer> observers = new ArrayList<>();

    public ObservableStringBuilder append(String s) {
        sb.append(s);
        notifyObservers();
        return this;
    }

    public ObservableStringBuilder delete(int start, int end) {
        sb.delete(start, end);
        notifyObservers();
        return this;
    }

    public String toString() { return sb.toString(); }

    @Override
    public void addObserver(Observer o) { observers.add(o); }

    @Override
    public void removeObserver(Observer o) { observers.remove(o); }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) o.update(sb.toString());
    }

    // тест
    public static void main(String[] args) {
        ObservableStringBuilder osb = new ObservableStringBuilder();
        Observer o1 = newValue -> System.out.println("Observer1: " + newValue);
        Observer o2 = newValue -> System.out.println("Observer2: " + newValue);
        osb.addObserver(o1);
        osb.addObserver(o2);
        osb.append("Hello");
        osb.append(" World");
        osb.delete(5,6);
    }
}
