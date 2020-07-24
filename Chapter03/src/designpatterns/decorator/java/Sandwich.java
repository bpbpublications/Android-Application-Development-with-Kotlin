package designpatterns.decorator.java;

public class Sandwich implements Recipe {

    @Override
    public void cook() {
        System.out.println("Preparing recipe");
    }
}
