package Polymorphism;

//polymorphism using inheritance

abstract class Animal{
    abstract void bark();

}
class Dog extends Animal{

    @Override
    void bark() {
        System.out.println("Bow bow");
    }
}
class Cat extends Animal{

    @Override
    void bark() {
        System.out.println("Meow meow");
    }
}
public class AnimalRunner {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat()};
        for (Animal animal : animals) {
            animal.bark();
        }
    }
}
