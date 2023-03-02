package Abstraction.Exercise1;

public class RecipeWithMicrowave  extends AbstractRecipe{
    @Override
    void getReady() {
        System.out.println("get the raw material");
        System.out.println("switch on microwave");
    }

    @Override
    void doTheDish() {
        System.out.println("get stuff ready");
        System.out.println("put in microwave");
    }

    @Override
    void cleanup() {
        System.out.println("cleanup utensils");
        System.out.println("switch off microwave");
    }
}
