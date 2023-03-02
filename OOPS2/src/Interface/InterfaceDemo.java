package Interface;

//abstract class -> define and declare
//interface -> declare -> 1.7Java
//1.8 can define method in interface

@FunctionalInterface //func interfce have one method
    //but here are 2,
    //but the thing is functional interface can have only one abstract method
    //but can have as many default methods
interface Demo{
    void abc();

    //default can let you define method in interface
    //new update in JAVA 8
    default void show(){
        System.out.println("in demo show");
    }
}

interface MyDemo{
    default void show(){
        System.out.println("in myDemo show");
    }
}

class DemoImp implements Demo, MyDemo{

    @Override
    public void abc() {
        System.out.println("in abc");
    }

    @Override
    public void show() {
        MyDemo.super.show();
        //Demo.super.show();
        //or you can provide ur own implementation
    }
//    public void show(){ //can override default method
//        System.out.println("in new show");
//    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Demo obj = new DemoImp();
        obj.abc();
        obj.show();
    }
}
