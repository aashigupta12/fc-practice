package OopsConcepts;

class Outer{
    static int a;
    public static void show(){

    }
    //inner class inside outer class
    static class Inner{ //Outer$Inner.class
        public void display(){
            System.out.println("In display");
        }
    }
}
public class InnerDemo {

    public static void main(String[] args) {

        Outer obj = new Outer();
        obj.show();


//        class = object
        //in order to use inner class, we need outer class
        //in order to create object of inner class we need to use the object of inner class
//        Outer.Inner obj1 = obj.new Inner(); //for non static inner class
        Outer.Inner obj1 = new Outer.Inner(); //for static inner class
        obj1.display();

    }
}
