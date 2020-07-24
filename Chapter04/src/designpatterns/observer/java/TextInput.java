package designpatterns.observer.java;

import java.util.ArrayList;
import java.util.List;

public class TextInput {
    private List<ValueObserver> observerList = new ArrayList<>();
    private String text = "";

    void addObserver(ValueObserver observer) {
        observerList.add(observer);
    }

    public String getText() {
        return text;
    }

    void setText(String text) {
        String oldText = this.text;
        this.text = text;
        for (ValueObserver observer : observerList) {
            observer.notifyChange(oldText, this.text);
        }
    }
}
