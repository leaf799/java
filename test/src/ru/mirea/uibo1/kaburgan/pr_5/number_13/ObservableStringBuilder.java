package ru.mirea.uibo1.kaburgan.pr_5.number_13;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ObservableStringBuilder implements Observable {
    private final StringBuilder sb = new StringBuilder();
    private final List<Observer> observers = new ArrayList<>();

    public ObservableStringBuilder append(String s) {
        sb.append(Objects.toString(s, "null"));
        notifyObservers();
        return this;
    }

    public ObservableStringBuilder delete(int start, int end) {
        sb.delete(start, end);
        notifyObservers();
        return this;
    }

    public ObservableStringBuilder insert(int offset, String s) {
        sb.insert(offset, Objects.toString(s, "null"));
        notifyObservers();
        return this;
    }

    public ObservableStringBuilder replace(int start, int end, String str) {
        sb.replace(start, end, Objects.toString(str, "null"));
        notifyObservers();
        return this;
    }

    @Override
    public void addObserver(Observer o) {
        if (o != null) observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        String snapshot = sb.toString();
        for (Observer o : observers) {
            o.update(snapshot);
        }
    }

    @Override
    public String toString() {
        return sb.toString();
    }

    // Тестовый main
    public static void main(String[] args) {
        ObservableStringBuilder osb = new ObservableStringBuilder();
        Observer o1 = newValue -> System.out.println("Observer1 получил: " + newValue);
        Observer o2 = newValue -> System.out.println("Observer2 получил: " + newValue);

        osb.addObserver(o1);
        osb.addObserver(o2);

        osb.append("Hello");
        osb.append(" World");
        osb.delete(5,6);
    }
}
