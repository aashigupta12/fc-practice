package OopsConcepts;

class Employee{
    int eid;
    int salary;
    static String ceo;


    static { //static block is executed, when load a class
        ceo = "larry";
        System.out.println("in static block");
    }

    public Employee(){ //const is executed, when you create an object
        eid = 1;
        salary = 3000;
        System.out.println("in constructor");
    }

    public void show(){
        System.out.println(eid + " : " + salary + " : " + ceo  );
    }
}
public class StaticDemo {

    static int  i = 0 ;
    public static void main(String[] args) {

        Employee emp1 = new Employee();
          i = 9; //you can only access static variable inside a static method
//        emp1.eid = 9;
//        emp1.salary = 4000;
//        emp1.ceo = "Mahesh";

        Employee emp2 = new Employee();
//        emp2.eid = 10;
//        emp2.salary = 5000;
//        emp2.ceo = "Mahesh";
//        emp2.ceo = "nikita";
        //since ceo is static variable,
        // we can use obj name or clasName
        //to access static variable , we don't need object
//        Employee.ceo = "nikita";

        //both have ceo as nikita, because "ceo" is not object specific
        //because : static keyword
        emp1.show(); //9 : 4000 : nikita
        emp2.show(); //10 : 5000 : nikita
    }
}
