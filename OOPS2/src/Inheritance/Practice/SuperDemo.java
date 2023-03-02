package Inheritance.Practice;

class A{

    public A(){
        System.out.println("in A");
    }

    public A(int i){
        System.out.println("in A int");
    }
}

class B extends A{
    public B(){
        super();//default - available in sub class
        System.out.println("in B");
    }

    public B(int i){
//        super();//default
        //if i want to call parameterized constructor of superclass ,
        super(i);
        System.out.println("in B int");
    }
}
public class SuperDemo {
    public static void main(String[] args) {

//        A obj = new B();
        A obj1 = new B(8);
        //B obj = new B();
    }
}
