package OopsConcepts;


class Casio{

    int num1;
    int num2;
    String operation;

    //Constructor Overloading
    public Casio(){
        num1 = 0;
        num2 = 0;
        operation = "nothing";
    }

    public Casio(int i){
        num1 = i;
        num2 = 0;
        operation = "nothing";
    }

    public Casio(int i, int j){
        num1 = i;
        num2 = j;
        operation = "nothing";
    }

    public Casio(int i, int j, String op){
        num1 = i;
        num2 = j;
        operation = op;
    }

    //method overloading
    public void add(int i, int j){
        System.out.println(i+j);
    }

    public void add(int i, int j, int k){
        System.out.println(i+j + k);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {

        Casio obj = new Casio();

        obj.add(6,9);
        obj.add(9,8,7);
    }
}
