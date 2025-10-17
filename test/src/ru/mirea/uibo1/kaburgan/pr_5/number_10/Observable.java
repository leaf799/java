package ru.mirea.uibo1.kaburgan.pr_5.number_10;

public interface Observable {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}