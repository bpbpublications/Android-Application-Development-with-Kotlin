package designpatterns.observer.java;

public interface ValueObserver {
    void notifyChange(String oldText, String newText);
}
