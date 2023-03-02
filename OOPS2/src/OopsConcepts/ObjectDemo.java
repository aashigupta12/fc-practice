package OopsConcepts;

class Calc{

    //variables
    int num1;
    int num2;
    int result;

    //we can have
    public Calc(){
        num1 = 5;
        num2 = 5;
    }

    public Calc(int n){
        num1 = n;
        num2 = n;
    }

    public Calc(double d, int n){
        //typecasting
        num1 = (int) d;
        num2 = n;
    }


}
public class ObjectDemo {
    public static void main(String[] args) {

        //object is created to access the class variables and methods
        Calc obj = new Calc();          //Calc() -> constructor
        System.out.println(obj.num1);
        System.out.println(obj.num2);
    }
}
