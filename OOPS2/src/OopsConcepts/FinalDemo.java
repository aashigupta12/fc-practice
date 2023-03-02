package OopsConcepts;

//final class can't be extended
class Aa {
//    final int Day; //constant
//    public Aa(){
//        Day = 10;
//    }

    //final method cannot be override
    public final void show(){
        System.out.println("in a show");
    }
}

class Bb extends Aa{
//    public void show(){
//        System.out.println("in b show");
//    }
}
public class FinalDemo {
    public static void main(String[] args) {
        Bb obj = new Bb();
//        System.out.println(obj.Day);
        obj.show();
    }
}
