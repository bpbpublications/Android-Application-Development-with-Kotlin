package ExceptionHandling;

import Strings.Ingredient;
import Strings.Recipe;

import java.io.File;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.List;

import static ExceptionHandling.ExceptionHandlingKt.isEligibleToVote;

public class ExceptionHandlingJava {

    public Recipe getRecipe(int id) throws IOException {
        getRecipeMakingSteps(id);
        getRecipeIngredients(id);
        getRecipePhoto(id);

        return null;// Returning null just to satisfy compiler
    }

    public Recipe getRecipeSafely(int id) {
        getRecipeMakingSteps(id);
        getRecipeIngredients(id);
        try {
            getRecipePhoto(id);
        } catch (IOException e) {
            throw new RuntimeException("Error while fetching recipes");
        }
        return null;// Returning null just to satisfy compiler
    }

    public List<String> getRecipeMakingSteps(int id) {
        // Your code
        return null;// Returning null just to satisfy compiler
    }

    public List<Ingredient> getRecipeIngredients(int id) {
        // Your code
        return null;// Returning null just to satisfy compiler
    }

    public File getRecipePhoto(int id) throws IOException {
        // Your code
        return null;// Returning null just to satisfy compiler
    }
}
