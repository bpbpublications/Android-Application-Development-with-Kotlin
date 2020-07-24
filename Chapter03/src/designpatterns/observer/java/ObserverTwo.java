package designpatterns.observer.java;

public class ObserverTwo implements ValueObserver {
    @Override
    public void notifyChange(String oldText, String newText) {
        System.out.println("Observer 2 notified. Value changed from " + oldText + " to " + newText);
    }
}
