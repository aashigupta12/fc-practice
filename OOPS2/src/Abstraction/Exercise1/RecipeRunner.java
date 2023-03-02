package Abstraction.Exercise1;

public class RecipeRunner {
    public static void main(String[] args) {
        Recipe1 recipe = new Recipe1();
        recipe.execute();

        RecipeWithMicrowave recipeWithMicro = new RecipeWithMicrowave();
        recipeWithMicro.execute();
    }
}
