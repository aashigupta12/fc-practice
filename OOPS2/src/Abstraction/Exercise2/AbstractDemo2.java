package Abstraction.Exercise2;

class Writer{

}
class Pen{
    public void write(){
        System.out.println("I am a pen");
    }
}

class Pencil{
    public void write(){
        System.out.println("I am a pencil");
    }
}

class Kit{
    public void doSomething(Pen p){
        p.write();
    }
}
class Printer{

//    since Integer, float extends Number class
    //we don't have to make separate methods for integer, float values
    public void show(Number i){
        System.out.println(i);
    }

}
public class AbstractDemo2 {
    public static void main(String[] args) {
        Printer obj = new Printer();
        obj.show(6.7);
    }
}
