package designpatterns.decorator.java;

public class DecoratorExample {
    public static void main(String[] args) {
        FrenchFries fries = new FrenchFries();

        Sandwich sandwich = new Sandwich();

        CheeseDecorator cheeseSandwich = new CheeseDecorator(sandwich);
        CheeseDecorator cheeseFrenchFries = new CheeseDecorator(fries);

        sandwich.cook();
        cheeseSandwich.cook();

        fries.cook();
        cheeseFrenchFries.cook();
    }
}
