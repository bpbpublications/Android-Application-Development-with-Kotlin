package designpatterns.observer.java;

public class ObserverOne implements ValueObserver {
    @Override
    public void notifyChange(String oldText, String newText) {
        System.out.println("Observer 1 notified. Value changed from " + oldText + " to " + newText);
    }
}
