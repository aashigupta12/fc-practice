package OopsConcepts;


class A{
    public void show(){
        System.out.println("Hi I am A");
    };
}

class B {
    public void show(){
        System.out.println("Hi, I am B");
    };
}

//cannot extend multiple classes in java

class C
//        extends A, B
        {

}
public class MultipleInheritanceAmbiguity {
    public static void main(String[] args) {
//        C obj = new C();
//        obj.show();
        //let's assume it is possible that C is able to extend
        //class A and B, but now when obj of C is created
        //and calling show method, ambiguity arises, will it call A's show or B's show
        //this is the reason why java doesn't support multiple inheritance directly
    }
}
