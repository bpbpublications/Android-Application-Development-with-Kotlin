package designpatterns.decorator.java;

public abstract class RecipeDecorator implements Recipe {
    protected Recipe recipe;

    public RecipeDecorator(Recipe recipe) {
        this.recipe = recipe;
    }

    @Override
    public void cook() {
        recipe.cook();
    }
}
