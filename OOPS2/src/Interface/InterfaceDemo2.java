package Interface;


interface Demo2{

    //variable declared in interface ,
    // is by default a final/constant variable
    int num = 9;
    void abc();
    static void show(){
        System.out.println("hi");
    }
}

class Demo2Imp implements Demo2{

    @Override
    public void abc() {
        //cannot change interface var value here
//        num = 9;
    }
}
public class InterfaceDemo2 {
    public static void main(String[] args) {

        //since in order to call interface methods
        //we have to make a class to implement a interface and
        //create object of it to call
        //but to avoid making class and skip those long steps
        //we can declare method "static"
        //and directly call using interface name
        Demo2.show();
    }
}


