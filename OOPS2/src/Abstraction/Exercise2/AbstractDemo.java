package Abstraction.Exercise2;

//for method to be abstract, class have to be abstract class
abstract class Human{ //abstract class
    abstract public void eat();

    public void walk(){

    };

}

class Man extends Human{ //concrete class
    //when you extend an abstract class,
    // abstract methods of parent clas have to be defined
    public void eat(){

    }

}
public class AbstractDemo {
    public static void main(String[] args) {

        //cannot create obj of abstract class
//        Human obj = new Human();

        Human obj = new Man();
    }
}
