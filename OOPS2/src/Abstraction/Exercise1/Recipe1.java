package Abstraction.Exercise1;

public class Recipe1 extends AbstractRecipe{

    @Override
    void getReady() {
        System.out.println("get the raw material");
        System.out.println("get utensils");
    }

    @Override
    void doTheDish() {
        System.out.println("do the dish");
    }

    @Override
    void cleanup() {
        System.out.println("cleanup utensils");
    }
}
