package org.example;

public class Radio {
    public int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }
    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
    }
    public void nextStation(){
        int next = currentStation + 1;
        setCurrentStation(next);
    }
    public void prevStation(){
        int prev = currentStation - 1;
        setCurrentStation(prev);
    }
}
