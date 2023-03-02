package OopsConcepts;

class Calc2{
    int num1;
    int num2;
    int result;


    public Calc2(int num1, int num2){
        //instance variable = local variable
        this.num1 = num1; //current
        this.num2 = num2;
    }

//    public Calc2(int number1, int number2){
//        //instance variable = local variable
//        number1 = num1;
//        number2 = num2;
//    }
}
public class ThisKeyword {
    public static void main(String[] args) {

        Calc2 obj = new Calc2(12,13);

        System.out.println(obj.num1);
        System.out.println(obj.num2);
    }
}
