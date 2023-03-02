package OopsConcepts;


class SuperClass{

    int x = 10;
    public void show(){
        System.out.println("In SuperClass");
    }

    public void config(){
        System.out.println("i am not in superclass");
    }
}

//method overriding :
// child class method will override the parent class method
class SubClass extends SuperClass{

    int x = 20;
    public void show(){

//        super.show(); //this will call super class method first
        System.out.println("In SubClass");
    }

    public int config(int a){
        System.out.println("i am not in superclass" + a);
        return a;
    }
}

class SubClass2 extends SuperClass{
    public void show(){
        System.out.println("in subclass 2");
    }
}
public class MethodOverriding {

    //compile time poly & runtime
    public static void main(String[] args) {
        SuperClass obj1 = new SubClass(); //runtime poly
        obj1.show();  //since we are deciding at runtime which show to call

        System.out.println(obj1.x); //10 , runtime polymorphism cannot be achieved by data members


        obj1.config(); //can only be called if ref and obj are both of sub class
        //if we have ref of superclass and obj of sub,
        // we can only call methods which are present in superclass

        obj1 = new SubClass2();
        obj1.show();  //dynamic dispatch : followed by runtime poly
    }
}
