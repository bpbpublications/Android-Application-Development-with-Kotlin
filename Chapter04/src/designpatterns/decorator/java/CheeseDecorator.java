package designpatterns.decorator.java;

public class CheeseDecorator extends RecipeDecorator {

    public CheeseDecorator(Recipe recipe) {
        super(recipe);
    }

    @Override
    public void cook() {
        super.cook();
        garnishCheese();
    }

    private void garnishCheese() {
        System.out.println("Keep calm and shred cheese...");
    }
}
