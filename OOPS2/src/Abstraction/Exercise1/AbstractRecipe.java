package Abstraction.Exercise1;

public abstract class AbstractRecipe {
    //setup,prep
    // recipe
    //cleanup
    public void execute(){
        getReady();
        doTheDish();
        cleanup();
    }

    abstract void getReady();
    abstract void doTheDish();
    abstract void cleanup();


}
