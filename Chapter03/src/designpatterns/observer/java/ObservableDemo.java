package designpatterns.observer.java;

public class ObservableDemo {
    public static void main(String[] args) {
        TextInput textInput = new TextInput();
        textInput.addObserver(new ObserverOne());
        textInput.addObserver(new ObserverTwo());

        textInput.setText("Hello");
        textInput.setText("World");
    }
}
